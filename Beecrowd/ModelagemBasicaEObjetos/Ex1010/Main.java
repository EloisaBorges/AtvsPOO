package Beecrowd.ModelagemBasicaEObjetos.Ex1010;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        Peca peca1 = new Peca(cod1, qtd1, valor1);

        int cod2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double valor2 = sc.nextDouble();
        Peca peca2 = new Peca(cod2, qtd2, valor2);

        double totalAPagar = peca1.calcularSubtotal() + peca2.calcularSubtotal();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAPagar);

    }
}