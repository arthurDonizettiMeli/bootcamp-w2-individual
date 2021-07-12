package exercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class app {
/*
    Exercício 2:  Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13 milhão e possui uma
    média de crescimento anual de 148%, uma concorrente do ramo, “Empresa Y”, é avaliada em 18,4 milhões e com sua
    média de crescimento anual em 32%.

    Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a empresa
    X ultrapasse a empresa Y em seu valor de empresa.
 */
    public static void main(String[] args) {
        double valorX = 1130000;
        double valorY = 18400000;

        double crescimentoX = 1.48;
        double crescimentoY = 0.32;

        int ano = 2021;
        while(valorX < valorY) {
            ano++;

            valorX += valorX * crescimentoX;
            valorY += valorY * crescimentoY;

            System.out.printf("Empresa X - 01/01/%d - Valor da Empresa: %.2fm\n", ano, valorX/1000000);
            System.out.printf("Empresa Y - 01/01/%d - Valor da Empresa: %.2fm\n\n", ano, valorY/1000000);
        }
    }
}
