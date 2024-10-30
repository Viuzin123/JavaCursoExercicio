package ExerciciosCondicional;/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
 */

import java.util.Scanner;

public class EX2_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número");
        int x = scan.nextInt();

        if (x % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

    }
}
