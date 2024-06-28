/*   Hugo Eduardo de Castro Rolim Filho  */

/* ) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo
deve utilizar um objeto de classe Random, uma vez para lançar o primeiro dado e
novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada.
Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de
2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. A Figura
abaixo mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar o
dado 36.000 vezes. Utilize um array unidimensional para contar o número de vezes que
cada possível soma aparece. Exiba os resultados em formato tabular. */

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random random = new Random();
        int[] somaFrequencias = new int[13];
        int lancamentos = 36000;

        // Lançamentos dos dados
        for (int i = 0; i < lancamentos; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int soma = dado1 + dado2;
            somaFrequencias[soma]++;
        }

        // Exibe os resultados
        System.out.println("Tabulação das somas dos dados:");
        System.out.print("    ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 6; j++) {
                int soma = i + j;
                System.out.printf("%4d", soma);
            }
            System.out.println();
        }

        System.out.println("\nSoma\tFrequência");
        for (int i = 2; i < somaFrequencias.length; i++) {
            System.out.println(i + "\t" + somaFrequencias[i]);
        }
    }
}
