package Exercicio1;

import java.math.BigDecimal;

public class ContaCorrente {
  private static final BigDecimal SALDO_MINIMO_PARA_ABERTURA = BigDecimal.valueOf(200);

  private int numero;
  private int agencia;
  private String titular;
  private BigDecimal saldo;
  private BigDecimal chequeEspecialUsado;
  private BigDecimal chequeEspecial;

  public ContaCorrente() {
  }

  private ContaCorrente(int numero, int agencia, String titular, BigDecimal saldo, BigDecimal chequeEspecial) {
    this.numero = numero;
    this.agencia = agencia;
    this.titular = titular;
    this.saldo = saldo;
    this.chequeEspecial = chequeEspecial;
    this.chequeEspecialUsado = BigDecimal.valueOf(0);
  }

  public ContaCorrente(Exercicio1.ContaCorrente cc) {
    this.numero = cc.numero;
    this.agencia = cc.agencia;
    this.titular = cc.titular;
    this.saldo = cc.saldo;
    this.chequeEspecialUsado = cc.chequeEspecialUsado;
    this.chequeEspecial = cc.chequeEspecial;
  }

  public static Exercicio1.ContaCorrente AbrirContaCorrente(int numero, int agencia, String titular, BigDecimal saldo, BigDecimal chequeEspecial) {
    if (SaldoPermiteAbrirContaCorrente(saldo)) {
      return new Exercicio1.ContaCorrente(numero, agencia, titular, saldo, chequeEspecial);
    }
    throw new RuntimeException("Saldo insuficiente para abertura de conta.");
  }

  public void deposito(BigDecimal valor) {
    if (EstaUsandoChequeEspecial()) {
      valor = CreditarChequeEspecial(valor);
    }
    CreditarSaldo(valor);
  }

  public void saque(BigDecimal valor) {
    if (ValorTotal().compareTo(valor) > 0) {
      valor = DescontarSaldo(valor);
      if (valor.compareTo(BigDecimal.valueOf(0)) > 0) {
        DescontarChequeEspecial(valor);
      }
    } else
      throw new RuntimeException("Saldo insuficiente para saque.");
  }

  private BigDecimal DescontarSaldo(BigDecimal valor) {
    BigDecimal resto = BigDecimal.valueOf(0);
    if (this.saldo.compareTo(valor) < 0) {
      resto = valor.subtract(this.saldo);
    }
    this.saldo = this.saldo.subtract(valor.subtract(resto));
    return resto;
  }

  private void DescontarChequeEspecial(BigDecimal valor) {
    this.chequeEspecialUsado = this.chequeEspecialUsado.add(valor);
  }

  private void CreditarSaldo(BigDecimal valor) {
    this.saldo = this.saldo.add(valor);
  }

  private BigDecimal CreditarChequeEspecial(BigDecimal valor) {
    BigDecimal resto = BigDecimal.valueOf(0);
    if (this.chequeEspecialUsado.compareTo(valor) < 0) {
      resto = valor.subtract(this.chequeEspecialUsado);
    }
    this.chequeEspecialUsado = this.chequeEspecialUsado.subtract(valor.subtract(resto));
    return resto;
  }

  public void devolucao(Exercicio1.ContaCorrente cc, BigDecimal valor) {
    cc.saque(valor);
    this.deposito(valor);
  }

  public void transferencia(Exercicio1.ContaCorrente cc, BigDecimal valor) {
    this.saque(valor);
    cc.deposito(valor);
  }

  public BigDecimal ValorTotal() {
    return this.saldo.add(this.chequeEspecial.subtract(this.chequeEspecialUsado));
  }

  private static boolean SaldoPermiteAbrirContaCorrente(BigDecimal saldo) {
    return saldo.compareTo(SALDO_MINIMO_PARA_ABERTURA) >= 0;
  }

  private boolean EstaUsandoChequeEspecial() {
    return this.chequeEspecialUsado.compareTo(BigDecimal.valueOf(0)) > 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  public BigDecimal getChequeEspecial() {
    return chequeEspecial;
  }

  public void setChequeEspecial(BigDecimal chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  public BigDecimal getChequeEspecialUsado() {
    return chequeEspecialUsado;
  }

  public void setChequeEspecialUsado(BigDecimal chequeEspecialUsado) {
    this.chequeEspecialUsado = chequeEspecialUsado;
  }

  @Override
  public String toString() {
    return "ContaCorrente{" +
        "numero=" + numero +
        ", agencia=" + agencia +
        ", titular='" + titular + '\'' +
        ", saldo=" + saldo +
        ", chequeEspecialUsado=" + chequeEspecialUsado +
        ", chequeEspecial=" + chequeEspecial +
        '}';
  }
}

