/*   Hugo Eduardo de Castro Rolim Filho  */

/* Escreva um aplicativo que permita ao usuário inserir uma temperatura em
Fahrenheit e exiba o equivalente em Celsius ou inserir uma temperatura em Celsius e exiba
o equivalente em Fahrenheit, para isso você deve implementar os métodos a e b descritos
abaixo:  */

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja converter para Fahrenheit (1) ou Celsius (2)? ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius  = sc.nextDouble();

            double fahrenheit = celsiusfahrenheit(celsius );
            System.out.println("A temperatura em Fahrenheit e: " + fahrenheit);
        }

        else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = fahrenheitcelsius(fahrenheit);
            System.out.println("A temperatura em Celsius e: " + celsius);
        }

        else {
            System.out.println("Opção Inválida");

        }
    }


        public static double celsiusfahrenheit(double celsius) {
            return 9.0 / 5.0 * celsius + 32;
        }
        public static double fahrenheitcelsius(double fahrenheit) {
            return 5.0 / 9.0 * (fahrenheit - 32);
        }

}