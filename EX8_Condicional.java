package ExerciciosCondicional;
import java.util.Locale;
import java.util.Scanner;

public class EX8_Condicional {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o seu salário: ");
        double salario = scan.nextDouble();

        double imposto;

        if (salario <= 2000) {
            imposto = 0;
            System.out.println("Isento");

        } else if (salario > 2000 && salario <= 3000) {
            imposto =  (salario - 2000.0) * 0.08;
        } else if (salario > 3000 && salario <= 4500) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        System.out.printf("O imposto é: %.2f\n", imposto);
    }
}
