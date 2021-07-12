package Exercicio4;

public class app {
  public static void main(String[] args) {
    Fracao f1 = new Fracao(5, 6);
    Fracao f2 = new Fracao(8);

    Fracao resultado = Fracao.Adicionar(f1, f2);
    System.out.println(resultado);
    System.out.println();

    resultado = Fracao.Subtrair(f1, f2);
    System.out.println(resultado);
    System.out.println();

    resultado = Fracao.Multiplicar(f1, f2);
    System.out.println(resultado);
    System.out.println();

    resultado = Fracao.Dividir(f1, f2);
    System.out.println(resultado);
  }
}
