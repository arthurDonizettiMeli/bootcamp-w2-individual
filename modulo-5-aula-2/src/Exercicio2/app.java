package Exercicio2;

public class app {
  public static void main(String[] args) {
    Counter counter = new Counter();
    counter.Incrementar();
    counter.Incrementar();
    counter.Incrementar();
    counter.Incrementar();
    counter.Incrementar();
    counter.Incrementar();
    System.out.println(counter.getValor());
    counter.Decrementar();
    counter.Decrementar();
    counter.Decrementar();
    counter.Decrementar();
    counter.Decrementar();
    System.out.println(counter.getValor());
  }
}
