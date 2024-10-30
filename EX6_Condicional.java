/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */
package ExerciciosCondicional;

import java.util.Scanner;

public class EX6_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o número escolhido: ");
        int numero = scan.nextInt();

        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo de [0, 25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo de [25, 50");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo de [50, 75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo de [75, 100]");
        } else {
            System.out.println("Não há um intervalo com esse número");
        }
    }
}