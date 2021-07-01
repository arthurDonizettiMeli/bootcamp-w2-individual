package Exercicio1;

import java.math.BigDecimal;

public class app {

    public static void main(String[] args) {
        try{
            ContaCorrente cc1 = Exercicio1.ContaCorrente.AbrirContaCorrente(5555, 222, "Pessoa 1", BigDecimal.valueOf(250), BigDecimal.valueOf(200));
            ContaCorrente cc2 = Exercicio1.ContaCorrente.AbrirContaCorrente(9435, 201, "Pessoa 2", BigDecimal.valueOf(780), BigDecimal.valueOf(1000));

            System.out.println("Conta Corrente 1 - Abertura");
            System.out.println(cc1);

            System.out.println("Conta Corrente 2 - Abertura");
            System.out.println(cc2);

            System.out.println();

            cc1.deposito(BigDecimal.valueOf(1000));
            System.out.println("Conta Corrente 1 - Depósito de 1000");
            System.out.println(cc1);

            System.out.println();

            cc1.transferencia(cc2, BigDecimal.valueOf(500));
            System.out.println("Conta Corrente 1 - Transferiu de 500");
            System.out.println(cc1);
            System.out.println("Conta Corrente 2 - Recebeu de 500");
            System.out.println(cc2);

            System.out.println();

            cc2.saque(BigDecimal.valueOf(2000));
            System.out.println("Conta Corrente 2 - Sacou 2000");
            System.out.println(cc2);

            System.out.println();

            cc1.transferencia(cc2, BigDecimal.valueOf(750));
            System.out.println("Conta Corrente 1 - Transferiu de 750");
            System.out.println(cc1);
            System.out.println("Conta Corrente 2 - Recebeu de 750");
            System.out.println(cc2);

            System.out.println();

            cc1.devolucao(cc2, BigDecimal.valueOf(1000));
            System.out.println("Conta Corrente 1 - Resgatou de 1000");
            System.out.println(cc1);
            System.out.println("Conta Corrente 2 - Devolveu de 1000");
            System.out.println(cc2);

        } catch (RuntimeException ex) {
            System.out.println("Houve um erro ao realizar ação: " + ex.getMessage());
        }
    }

}
