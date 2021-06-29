package dakar;

import java.math.BigDecimal;

public class app {
  public static void main(String[] args) {
    Corrida corrida = new Corrida("DAKAR", 10.58, 10, new BigDecimal(5000));

    corrida.registrarCarro(300, 2.8, 20, "K19EJ43");
    corrida.registrarCarro(220, 4.0, 25, "J20DK86");
    corrida.registrarCarro(150, 2, 35, "A87JI72");
    corrida.registrarCarro(250, 6.3, 22, "P01ZE22");
    corrida.registrarCarro(230, 5.9, 30, "M74YG32");

    corrida.registrarMoto(250, 5.5, 35, "MTO-0234");
    corrida.registrarMoto(200, 6, 25, "MTO-3648");
    corrida.registrarMoto(220, 7, 35, "MTO-9143");
    corrida.registrarMoto(260, 4, 25, "MTO-7564");
    corrida.registrarMoto(210, 8, 15, "MTO-1643");

    corrida.removerVeiculoPorPlaca("K19EJ43");

    corrida.socorrerCarro("J20DK86");
    corrida.socorrerCarro("MTO-0234");

    corrida.socorrerMoto("J20DK86");
    corrida.socorrerMoto("MTO-0234");

    corrida.definirVencedor();
  }
}
