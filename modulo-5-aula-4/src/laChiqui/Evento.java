package laChiqui;

import java.util.ArrayList;
import java.util.List;

public class Evento {
  private String name;
  private List<Convidado> listaConvidados;
  private List<Fogos> listaFogos;

  public Evento(String name) {
    this.name = name;
    this.listaConvidados = new ArrayList<>();
    this.listaFogos = new ArrayList<>();
  }

  public void IncluirConvidado(Convidado convidado){
    listaConvidados.add(convidado);
  }

  public void IncluirFogos(Fogos fogos){
    listaFogos.add(fogos);
  }

  public void ExplodirFogos(){
    listaFogos.stream().forEach(fogos -> fogos.Explodir());
  }

  public void ComerBolo(){
    listaConvidados.stream().forEach(convidado -> convidado.ComerBolo());
  }
}
