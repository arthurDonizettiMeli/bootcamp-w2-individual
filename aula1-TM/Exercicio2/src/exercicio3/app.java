package exercicio3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class app {
/*
    Exercício 3:  Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no console:
    nome, preço, quantidade e o valor total da compra.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Produto[] listaCompra = new Produto[3];

            int i = 0;
            while (i < listaCompra.length) {
                System.out.println("Digite o nome do produto:");
                String nome = scanner.next();

                System.out.println("Digite o preço do produto:");
                double preco = Double.parseDouble(scanner.next());

                System.out.println("Digite a quantidade do produto:");
                int quantidade = Integer.parseInt(scanner.next());

                Produto p = new Produto(nome, preco, quantidade);

                listaCompra[i] = p;
                i++;
            }

            for (i = 0; i < listaCompra.length; i++) {
                System.out.printf("Produto %d\n", i+1);
                System.out.println(listaCompra[i].toString());
            }

            System.out.printf("Valor Total: R$%.2f", listaCompra[0].Total() + listaCompra[1].Total() + listaCompra[2].Total());

        } catch (Exception ex) {
            System.out.println();
        }
    }

    private static class Produto {
        private String Nome;
        private double Preco;
        private int Quantidade;

        public int getQuantidade() {
            return Quantidade;
        }

        public void setQuantidade(int quantidade) {
            Quantidade = quantidade;
        }

        public Produto(String nome, double preco, int quantidade) {
            Nome = nome;
            Preco = preco;
            Quantidade = quantidade;
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String nome) {
            Nome = nome;
        }

        public double getPreco() {
            return Preco;
        }

        public void setPreco(double preco) {
            Preco = preco;
        }

        public double Total(){
            return Preco * Quantidade;
        }

        @Override
        public String toString() {
            return   Nome + "\n" +
                    "R$"+ Preco + "\n" +
                    "Quantidade: "+ Quantidade + "\n";
        }
    }
}
