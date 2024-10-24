/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Infome o valor de A: ");
        double A = scan.nextDouble();
        System.out.println("Infome o valor de B: ");
        double B = scan.nextDouble();
        System.out.println("Infome o valor de C: ");
        double C = scan.nextDouble();

        double areaTriangulo = A * C / 2;
        double areaCirculo = (C * C) * pi;
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.println("A área do triângulo é: " + areaTriangulo);
        System.out.println("A área do círculo é: " + areaCirculo);
        System.out.println("A área do trapézio é: " + areaTrapezio);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("A área do retangulo é: " + areaRetangulo);
    }
}
