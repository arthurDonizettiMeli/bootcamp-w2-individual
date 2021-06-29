import java.util.Arrays;
import java.util.Scanner;

public class Pessoa implements Precedente<Pessoa> {
    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.nome.toLowerCase().compareTo(pessoa.nome.toLowerCase());
    }

    @Override
    public String toString() {
        return nome +" - "+ cpf;
    }

    public static void main(String[] args) {
        Precedente lista[] = new Pessoa[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            try {
                IncluirPessoa(i, lista, scanner);
            } catch (RuntimeException ex) {
                System.out.println("Ouve um erro ao realizar ação: " + ex.getMessage());
            }
        };

        scanner.close();

        System.out.println("Lista desordenada:");
        System.out.println(Arrays.toString(lista));

        Precedente<Pessoa>[] listaOrdenada = SortUtil.sort(lista);
        System.out.println("Lista ordenada:");
        System.out.println(Arrays.toString(listaOrdenada));
    }

    private static void IncluirPessoa(int index, Precedente<Pessoa>[] lista, Scanner scanner) {
        System.out.println("Adicione uma pessoa:");
        System.out.println("Nome:");
        String name = scanner.next();

        System.out.println("CPF:");
        String cpf = scanner.next();

        lista[index] = new Pessoa(name, cpf);
        System.out.println();
    }
}
