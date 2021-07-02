package br.com.meli.modulo6aula3.service;

import br.com.meli.modulo6aula3.entity.Personagem;
import br.com.meli.modulo6aula3.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PersonagemService {

  @Autowired
  PersonagemRepository repository;

  public List<Personagem> getPersonagemByName(String name) {
    try {
      return repository.getPersonagemByName(name);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
