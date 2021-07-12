package Exercicio4;

public class Fracao {
  private int numerador;
  private int denominador;
  private static int mmc;

  public Fracao(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public Fracao(int inteiro) {
    this.numerador = inteiro;
    this.denominador = inteiro;
  }

  public static Fracao Adicionar(Fracao fracao1, Fracao fracao2) {
    ConverterFracoesPorMMC(fracao1, fracao2);
    return new Fracao(fracao1.numerador + fracao2.numerador, mmc);
  }

  public static Fracao Subtrair(Fracao fracao1, Fracao fracao2) {
    ConverterFracoesPorMMC(fracao1, fracao2);
    return new Fracao(fracao1.numerador - fracao2.numerador, mmc);
  }

  public static Fracao Multiplicar(Fracao fracao1, Fracao fracao2) {
    return new Fracao(fracao1.numerador * fracao2.numerador, fracao1.denominador * fracao2.denominador);
  }

  public static Fracao Dividir(Fracao fracao1, Fracao fracao2) {
    return new Fracao(fracao1.denominador * fracao2.numerador, fracao1.numerador * fracao2.denominador);
  }

  public double Total() {
    return this.numerador / this.denominador;
  }

  private static void ConverterFracoesPorMMC(Fracao fracao1, Fracao fracao2) {
    mmc = Fracao.MMC(fracao1.getDenominador(), fracao2.getDenominador());
    fracao1.ConverterPorMMC();
    fracao2.ConverterPorMMC();
  }

  private void ConverterPorMMC() {
    this.numerador = mmc / this.denominador * this.numerador;
    this.denominador = mmc;
  }

  private static int MMC(int denominador1, int denominador2) {
    int denominadorFinal = 1;
    int primo = proximoPrimo(Math.max(denominador1, denominador2));
    while (denominador1 > 1 || denominador2 > 1) {
      while (denominador1 % primo != 0 && denominador2 % primo != 0) {
        primo = proximoPrimo(primo);
      }
      if (denominador1 % primo == 0 && denominador2 % primo == 0) {
        denominadorFinal *= primo;
        denominador1 /= primo;
        denominador2 /= primo;
      } else {
        if (denominador1 % primo == 0) {
          denominadorFinal *= primo;
          denominador1 /= primo;
        }
        if (denominador2 % primo == 0) {
          denominadorFinal *= primo;
          denominador2 /= primo;
        }
      }
    }
    return denominadorFinal;
  }

  private static int proximoPrimo(int inicial) {
    int numeroAtual = inicial;
    while (true) {
      numeroAtual--;
      if (ehPrimo(numeroAtual)) {
        return numeroAtual;
      }
    }
  }

  private static boolean ehPrimo(int numeroAtual) {
    for (int i = 2; i <= (numeroAtual / 2); i++) {
      if (numeroAtual % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  @Override
  public String toString() {
    return numerador + " / " + denominador;
  }
}
