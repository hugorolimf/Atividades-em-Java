/*   Hugo Eduardo de Castro Rolim Filho
    Registro acadêmico: 202411011264    */

/*  Criar um algoritmo em Java que, dadas as temperaturas registradas
diariamente durante uma semana, imprima as temperaturas e indique quais delas
estiveram acima da temperatura média. Aqui estão os passos para resolver esse
problema: */

import java.util.Scanner;

public class MediaSemanalTemp {
    public static void main(String[] args) {

        System.out.println("Irei calcular a média semanal da temperatura e mostrar as temperaturas acima da média. ");
        Scanner sc = new Scanner(System.in);

        int[] temperaturas = new int[7]; // array para armazenar as temperaturas


        for (int i = 0; i < 7; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextInt();
        }

        // media das temperaturas
        int soma = 0;
        for (int temperatura : temperaturas) {
            soma += temperatura;
        }

        int media = soma / 7;
        System.out.println("A temperatura média da semana é: " + media + "°C");

        // Imprima todas as temperaturas registradas e indique quais delas estiveram acima da média.

        System.out.println("Temperaturas acima da média:");
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > media) {
                System.out.println("A temeperatura do dia " + (i + 1) + " está acima da média. A temperatura é de " + temperaturas[i] + "°C");
            }
        }
    }
}