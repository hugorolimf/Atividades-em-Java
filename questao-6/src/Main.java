/*   Hugo Eduardo de Castro Rolim Filho
    Registro acadêmico: 202411011264    */

/* 6. (0,2 pontos) Escreva um aplicativo para simular o lançamento de dois dados... */

import java.util.Random;

public class Main {
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
