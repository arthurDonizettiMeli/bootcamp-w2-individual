package br.com.meli.modulo6aula3.repository;

import br.com.meli.modulo6aula3.entity.Personagem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonagemRepository {
  private File file;

  public PersonagemRepository() {
    this.getFile();
  }

  private void getFile() {
    try {
      ClassLoader cl = getClass().getClassLoader();
      this.file = new File(cl.getResource("static/starwars.json").getFile());
    } catch (Exception e) {
      e.getStackTrace();
    }
  }

  public List<Personagem> getPersonagemByName(String name) throws IOException {
    List<Personagem> lista = converterDados();

    return lista.parallelStream().filter(p -> p.getName().contains(name)).collect(Collectors.toList());
  }

  private List<Personagem> converterDados() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    TypeReference<List<Personagem>> typeReference = new TypeReference<List<Personagem>>(){};
    return mapper.readValue(this.file,typeReference);
  }
}
