package laChiqui;

public class ConvidadoMeli extends Convidado {
  public ConvidadoMeli(String name) {
    super(name);
  }

  @Override
  public void ComerBolo() {
    super.ComerBolo();
    System.out.println(super.getName() + " grita: Viva La Chiqui!!");
  }
}
