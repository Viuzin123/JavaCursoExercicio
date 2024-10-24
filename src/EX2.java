/*
Faça um programa para ler o valor do raio de um círculo,
e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do raio: ");
        double raio = scan.nextDouble();

        double pi = 3.14159;
        double area = pi*(raio*raio);

        System.out.printf("A área é = %.2f\n ", area);
    }
}