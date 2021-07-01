package Exercicio2;

public class Counter {
  private int valor;

  public Counter() {
  }

  public Counter(int valor) {
    this.valor = valor;
  }

  public Counter(Counter counter) {
    this.valor = counter.valor;
  }

  public void Incrementar() {
    valor++;
  }

  public void Decrementar() {
    valor--;
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }
}
