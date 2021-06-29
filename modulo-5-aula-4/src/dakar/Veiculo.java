package dakar;

import java.util.Objects;

public abstract class Veiculo {
  private double velocidade;
  private double aceleracao;
  private int anguloDeGiro;
  private String placa;
  private double peso;
  private int rodas;

  public Veiculo(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
    this.velocidade = velocidade;
    this.aceleracao = aceleracao;
    this.anguloDeGiro = anguloDeGiro;
    this.placa = placa;
  }

  public Double potenciaVeiculo() {
    return velocidade * aceleracao / (anguloDeGiro * (peso - rodas * 100));
  }

  public double getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(double velocidade) {
    this.velocidade = velocidade;
  }

  public double getAceleracao() {
    return aceleracao;
  }

  public void setAceleracao(double aceleracao) {
    this.aceleracao = aceleracao;
  }

  public int getAnguloDeGiro() {
    return anguloDeGiro;
  }

  public void setAnguloDeGiro(int anguloDeGiro) {
    this.anguloDeGiro = anguloDeGiro;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getRodas() {
    return rodas;
  }

  public void setRodas(int rodas) {
    this.rodas = rodas;
  }
}
