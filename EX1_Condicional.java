package ExerciciosCondicional;/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
 */

import java.util.Scanner;

public class EX1_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int x = scan.nextInt();

        if (x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");

        }
    }
}
