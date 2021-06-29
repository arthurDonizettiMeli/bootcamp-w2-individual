package dakar;

public class Moto extends Veiculo {
  public Moto(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
    super(velocidade, aceleracao, anguloDeGiro, placa);
    setPeso(300);
    setRodas(2);
  }

  @Override
  public String toString() {
    return "Moto{"+super.getPlaca()+" - Potência " + super.potenciaVeiculo() + "}";
  }
}
