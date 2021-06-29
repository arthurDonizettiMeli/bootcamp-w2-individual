package dakar;

public class Carro extends Veiculo {

  public Carro(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
    super(velocidade, aceleracao, anguloDeGiro, placa);
    setPeso(1000);
    setRodas(4);
  }

  @Override
  public String toString() {
    return "Carro{"+super.getPlaca()+" - Potência " + super.potenciaVeiculo() + "}";
  }
}
