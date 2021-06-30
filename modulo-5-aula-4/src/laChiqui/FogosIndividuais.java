package laChiqui;

public class FogosIndividuais implements Fogos {
  private String barulho;

  public FogosIndividuais(String barulho) {
    this.barulho = barulho;
  }

  public void Explodir(){
    System.out.println(barulho);
  }
}
