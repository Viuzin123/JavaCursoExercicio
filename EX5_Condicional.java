package ExerciciosCondicional;/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */

import java.util.Scanner;

public class EX5_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o código: ");
        int codigo = scan.nextInt();

        System.out.println("Quantos deste pedido vai querer: ");
        int quantidade = scan.nextInt();

        double conta = 0;

        if (codigo == 1) {
            conta = quantidade * 4;
        } else if (codigo == 2) {
            conta = quantidade * 4.50;
        } else if (codigo == 3) {
            conta = quantidade * 5;
        } else if (codigo == 4) {
            conta = quantidade * 2;
        } else if (codigo == 5) {
            conta = quantidade * 1.50;
        } else {
            System.out.println("Não tem no menu");
        }
        System.out.printf("O valor do pedido foi de R$ %.2f\n ", conta);
    }
}
