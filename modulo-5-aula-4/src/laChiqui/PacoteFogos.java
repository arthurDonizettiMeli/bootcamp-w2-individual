package laChiqui;

import java.util.HashMap;
import java.util.Map;

public class PacoteFogos  implements Fogos {
  private Map<Integer, Fogos> pacote;
  private int counter;

  public PacoteFogos() {
    pacote = new HashMap<>();
    counter = 0;
  }

  public void incluirFogos(Fogos fogos) {
    counter++;
    pacote.put(counter, fogos);
  }

  @Override
  public void Explodir() {
    pacote.forEach((integer, fogos) -> fogos.Explodir());
  }
}
