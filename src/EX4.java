/*
Fazer um programa que leia o número de um funcionário,
seu número de horas trabalhadas,o valor que recebe por
hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Número do funcionário:");
        int codigo = scan.nextInt();
        System.out.println("Número de horas trabalhadas:");
        int HT = scan.nextInt();
        System.out.println("Valor por hora:");
        double VH = scan.nextDouble();

        double salario = HT * VH;

        System.out.println("O salário é de: " + salario);
        System.out.println("O código é de: " + codigo);

    }
}
