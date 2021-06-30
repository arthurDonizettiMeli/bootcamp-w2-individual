package br.com.meli.modulo6aula1.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static java.util.Map.entry;

@Service
public class CodigoMorse {
  public String Converter(String frase){
    Map<Character, String> mapaLetras = Map.ofEntries(
        entry('0', "-----"),
        entry('1', ".----"),
        entry('2', "..---"),
        entry('3', "...--"),
        entry('4', "....-"),
        entry('5', "....."),
        entry('6', "-...."),
        entry('7', "--..."),
        entry('8', "---.."),
        entry('9', "----."),
        entry('A', ".-"),
        entry('B', "-..."),
        entry('C', "-.-."),
        entry('D', "-.."),
        entry('E', "."),
        entry('F', "..-."),
        entry('G', "--."),
        entry('H', "...."),
        entry('I', ".."),
        entry('J', ".---"),
        entry('K', "-.-"),
        entry('L', ".-.."),
        entry('M', "--"),
        entry('N', "-."),
        entry('O', "---"),
        entry('P', ".--."),
        entry('Q', "--.-"),
        entry('R', ".-."),
        entry('S', "..."),
        entry('T', "-"),
        entry('U', "..-"),
        entry('V', "...-"),
        entry('W', ".--"),
        entry('X', "-..-"),
        entry('Y', "-.--"),
        entry('Z', "--.."),
        entry(' ', " ")
    );

    StringBuilder convertido = new StringBuilder();
    for(int i = 0; i < frase.length(); i++) {
      char letra = frase.toUpperCase().charAt(i);
      if (mapaLetras.containsKey(letra))
        convertido.append(mapaLetras.get(letra));
    }
    return convertido.toString();
  }
}
