/*
Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int A = scan.nextInt();
        System.out.println("Informe o valor de B: ");
        int B = scan.nextInt();
        System.out.println("Informe o valor de C: ");
        int C = scan.nextInt();
        System.out.println("Informe o valor de D: ");
        int D = scan.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("A diferença é: " + diferenca);
    }
}
