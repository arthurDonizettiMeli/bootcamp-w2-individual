import java.util.Arrays;
import java.util.Scanner;

public class Celular implements Precedente<Celular> {
    private String number;
    private String holder;

    public Celular() {
    }

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return number + " - " + holder;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.number.compareTo(celular.number);
    }

    public static void main(String[] args) {
        Precedente lista[] = new Celular[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            try {
                IncluirCelular(i, lista, scanner);
            } catch (RuntimeException ex) {
                System.out.println("Ouve um erro ao realizar ação: " + ex.getMessage());
            }
        };

        scanner.close();

        System.out.println("Lista desordenada:");
        System.out.println(Arrays.toString(lista));

        Precedente<Celular>[] listaOrdenada = SortUtil.sort(lista);
        System.out.println("Lista ordenada:");
        System.out.println(Arrays.toString(listaOrdenada));
    }

    private static void IncluirCelular(int index, Precedente<Celular>[] lista, Scanner scanner) {
        System.out.println("Adicione um celular:");
        System.out.println("Número:");
        String numero = scanner.next();

        System.out.println("Holder:");
        String holder = scanner.next();

        lista[index] = new Celular(numero, holder);
        System.out.println();
    }
}
