package laChiqui;

public abstract class Convidado {
  private String name;

  public void ComerBolo() {
    System.out.println(name+" comeu bolo. \"Chomp! Chomp!\"");
  }

  public Convidado(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
