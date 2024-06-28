/* Hugo Eduardo de Castro Rolim Filho  */

/* Você foi desafiado a criar um programa que
simula o jogo de adivinhação com um limite máximo de tentativas.
Aqui estão os detalhes: */

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(101);
        System.out.println("Você deve adivinhar um número escolhido entre 0 e 100. \nMas atenção, você só tem 10 tentativas.");

        System.out.print("Digite um número: ");
        Scanner teclado = new Scanner(System.in);
        int chute = teclado.nextInt();
        int tentativas = 10;

        while (chute != numero) {
            tentativas--;
            if (tentativas == 0) {
                System.out.println("Você perdeu. O número era " + numero);
                break;
            }
            if (chute < numero) {
                System.out.println("O número escolhido é maior. Você tem " + tentativas + " tentativas restantes.");
            } else {
                System.out.println("O número escolhido é menor. Você tem " + tentativas + " tentativas restantes.");
            }
            System.out.print("Digite um número: ");
            chute = teclado.nextInt();
        }
        if (chute == numero) {
            System.out.println("Parabéns, você ganhou!");
        }
    }
}
