package dakar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Corrida {
  private double distancia;
  private BigDecimal premioEmDolares;
  private String nome;
  private int quantidadeVeiculosPermitidos;
  private List<Veiculo> listaVeiculos;
  private SocorristaCarro socorristaCarro;
  private SocorristaMoto socorristaMoto;

  public Corrida(String nome, double distancia, int quantidadeVeiculosPermitidos, BigDecimal premioEmDolares) {
    this.distancia = distancia;
    this.premioEmDolares = premioEmDolares;
    this.nome = nome;
    this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    this.listaVeiculos = new ArrayList<>();
    this.socorristaCarro = new SocorristaCarro();
    this.socorristaMoto = new SocorristaMoto();
  }

  public void registrarCarro(double velocidade, double aceleracao, int anguloDeGiro, String patente) {
    if (existeVagaNaCorrida()){
      var carro = new Carro(velocidade, aceleracao, anguloDeGiro, patente);
      listaVeiculos.add(carro);
      System.out.println("Adicionado carro: " + carro);
    } else {
      System.out.println("A lista de veídulos está cheia.");
    }
  }

  public void registrarMoto(double velocidade, double aceleracao, int anguloDeGiro, String patente){
    if (existeVagaNaCorrida()){
      var moto = new Moto(velocidade, aceleracao, anguloDeGiro, patente);
      listaVeiculos.add(moto);
      System.out.println("Adicionada moto: " + moto);
    } else {
      System.out.println("A lista de veídulos está cheia.");
    }
  }

  public void definirVencedor() {
    Optional<Veiculo> campeao = listaVeiculos.stream().max((v1, v2) -> v1.potenciaVeiculo().compareTo(v2.potenciaVeiculo()));
    if(campeao.isPresent())
      System.out.println("O vencedor da corrida é " + campeao.get());
    else
      System.out.println("Não houve campeão.");
  }

  public void removerVeiculo(Veiculo veiculo) {
    listaVeiculos.remove(veiculo);
    System.out.println("Veículo removido: " + veiculo.toString());
  }

  public void removerVeiculoPorPlaca(String placa) {
    Optional<Veiculo> veiculo = listaVeiculos.stream().filter(v -> v.getPlaca() == placa).findFirst();
    if (veiculo.isPresent()) {
      removerVeiculo(veiculo.get());
    }else {
      System.out.println("Veículo não identificado");
    }
  }

  private boolean existeVagaNaCorrida() {
    return listaVeiculos.size() < quantidadeVeiculosPermitidos;
  }

  public void socorrerCarro(String documento) {
    Optional<Veiculo> carro = this.listaVeiculos.stream().filter(veiculo -> veiculo.getPlaca() == documento && veiculo instanceof Carro).findFirst();
    carro.ifPresent(veiculo -> this.socorristaCarro.socorrer((Carro) veiculo));
  }

  public void socorrerMoto(String documento) {
    Optional<Veiculo> moto = this.listaVeiculos.stream().filter(veiculo -> veiculo.getPlaca() == documento && veiculo instanceof Moto).findFirst();
    moto.ifPresent(veiculo -> this.socorristaMoto.socorrer((Moto) veiculo));
  }

  public double getDistancia() {
    return distancia;
  }

  public BigDecimal getPremioEmDolares() {
    return premioEmDolares;
  }

  public String getNome() {
    return nome;
  }

  public int getQuantidadeVeiculosPermitidos() {
    return quantidadeVeiculosPermitidos;
  }
}
