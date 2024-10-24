/*
Faça um programa para ler dois valores inteiros, e
depois mostrar na tela a soma desses números com uma
mensagem explicativa.
 */

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Segundo número: ");
        int n2 = scan.nextInt();

        int soma = n1+n2;

        System.out.println("A soma é: "+soma);
    }
}