package saveTheRopa;

import java.io.IOException;
import java.util.*;

public class GuardaRoupa {
  private Map<Integer, List<Vestuario>> dicionario;
  private int contador;

  public int getContador() {
    return contador;
  }

  public GuardaRoupa() {
    contador = 0;
    dicionario = new HashMap<>();
  }

  public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
    contador++;
    dicionario.put(contador, listaDeVestuario);
    return contador;
  }

  public void mostrarVestuarios() {
    dicionario.forEach((integer, vestuarios) -> System.out.println(integer + " - " + Arrays.toString(vestuarios.toArray())));
  }

  public List<Vestuario> devolverVestuarios(Integer id) {
    if (dicionario.containsKey(id))
      return dicionario.remove(id);

    throw new RuntimeException("Locker não encontrado no Id: " + id);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    var lista = new GuardaRoupa();
    int opcao = 1;

    do {
      try {
        if (lista.getContador() == 0) {
          guardarVestuarios(lista, scanner);
        } else {
          opcao = escolherAcao(scanner);

          switch (opcao) {
            case 1:
              guardarVestuarios(lista, scanner);
              break;
            case 2:
              lista.mostrarVestuarios();
              break;
            case 3:
              retirarVestuario(scanner, lista);
              break;

            case 4:
              System.out.println("Obrigado pela confiança! Volte sempre!");
              break;
            default:
          }
        }
      } catch (RuntimeException | IOException ex) {
        System.out.println("Houve um erro ao completar a ação. " + ex.getMessage());
      }
    } while (opcao != 4);
  }

  private static Integer guardarVestuarios(GuardaRoupa lista, Scanner scanner) throws IOException {
    List<Vestuario> vestuarios = new ArrayList();

    for (int i = 0; i < 2; i++) {
      System.out.println("Adicione uma roupa:");
      System.out.println("Marca:");
      String marca = scanner.next();

      System.out.println("Modelo:");
      String modelo = scanner.next();

      Vestuario item = new Roupa(marca, modelo);
      vestuarios.add(item);
    }

    Integer id = lista.guardarVestuarios(vestuarios);

    System.out.println("Suas roupas foram guardadas no locker nº " + id + ".");
    System.out.println("Pressione ENTER para continuar.");
    System.in.read();

    return id;
  }

  private static void retirarVestuario(Scanner scanner, GuardaRoupa lista) {
    System.out.println("Informe o ID do seu locker:");
    Integer id = Integer.parseInt(scanner.next());
    var vestuario = lista.devolverVestuarios(id);
    System.out.println("Seus itens: " + Arrays.toString(vestuario.toArray()));
    System.out.println();
  }

  private static int escolherAcao(Scanner scanner) {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Adicionar novo vestuário");
    System.out.println("2 - Mostrar vestuarios guardados");
    System.out.println("3 - Retirar seu vestiário");
    System.out.println("4 - Sair");
    return Integer.parseInt(scanner.next());
  }
}
