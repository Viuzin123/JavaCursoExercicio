package ExerciciosCondicional;/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

 */

import java.util.Scanner;

public class EX3_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Escreva o segundo número: ");
        int n2 = scan.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("São multíplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
