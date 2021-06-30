package br.com.meli.modulo6aula1.controllers;

import br.com.meli.modulo6aula1.services.CodigoMorse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/morse")
public class CodigoMorseController {

  @Autowired
  CodigoMorse codigoMorse;

  @RequestMapping("/converter/{frase}")
  public ResponseEntity<Map<String, Object>> ConverterFraseParaMorse (@PathVariable String frase) {
    return ResponseEntity.ok(Map.of("Palavra em morse:", codigoMorse.Converter(frase)));
  }
}
