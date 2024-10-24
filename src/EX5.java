/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1,
o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
Calcule e mostre o valor a ser pago.

 */

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Código da peça 1: ");
        int codigo1 = scan.nextInt();
        System.out.println("Quantidade de peças 1: ");
        int quantidade1 = scan.nextInt();
        System.out.println("Valor da peça 1: ");
        double valorPeca1 = scan.nextDouble();

        System.out.println("Código da peça 2: ");
        int codigo2 = scan.nextInt();
        System.out.println("Quantidade de peças 2: ");
        int quantidade2 = scan.nextInt();
        System.out.println("Valor da peça 2: ");
        double valorPeca2 = scan.nextDouble();

        double pagar1 = (valorPeca1 * quantidade1);
        double pagar2 = (valorPeca2 * quantidade2);
        double total = (pagar2 + pagar1);


        System.out.println("Codigo da peça 1: " + codigo1);
        System.out.println("Codigo da peça 2: " + codigo2);
        System.out.println("Quantidade de peças 1: " + quantidade1);
        System.out.println("Quantidade de peças 2: " + quantidade2);
        System.out.println("O total a pagar e: " + total);

    }
}
