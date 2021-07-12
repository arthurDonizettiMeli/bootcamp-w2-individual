package exercicio1;

import java.util.Arrays;
import java.util.Comparator;

public class app {

/*
*
* Exercício 1: Dado um vetor de 10 posições, sendo respectivamente ocupado pelos valores
* 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127
*
* */
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

        Arrays.sort(array);
        System.out.println("Crescente: " + Arrays.toString(array));
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println("Decrescente: " + Arrays.toString(array));
    }
}
