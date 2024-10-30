package ExerciciosCondicional;/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

import java.util.Scanner;

public class EX4_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hora inicial");
        int horaInicial = scan.nextInt();
        System.out.println("Hora final");
        int horaFinal = scan.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - (horaInicial + horaFinal);
        }
        System.out.println("O tempo de jogo foi " + duracao);
    }
}
