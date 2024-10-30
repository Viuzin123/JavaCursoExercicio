/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */
package ExerciciosCondicional;

import java.util.Scanner;

public class EX7_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("QUal o valor de X: ");
        int x = scan.nextInt();
        System.out.println("QUal o valor de Y: ");
        int y = scan.nextInt();

        if (x < 0 && y < 0) {
            System.out.println("3°Quadrante");
        } else if (x > 0 && y > 0) {
            System.out.println("1°Quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("4°Quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2°Quadrante");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        }
    }
}