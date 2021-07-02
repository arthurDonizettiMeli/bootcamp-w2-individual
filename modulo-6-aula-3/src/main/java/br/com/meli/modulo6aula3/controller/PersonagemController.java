package br.com.meli.modulo6aula3.controller;

import br.com.meli.modulo6aula3.entity.Personagem;
import br.com.meli.modulo6aula3.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/personagem")
public class PersonagemController {

  @Autowired
  PersonagemService service;

  @GetMapping("/buscar/{name}")
  public ResponseEntity<List<Personagem>> getPersonagemByName(@PathVariable String name){
    return ResponseEntity.ok(service.getPersonagemByName(name));
  }
}
