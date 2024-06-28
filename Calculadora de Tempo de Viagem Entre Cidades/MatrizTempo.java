/*   Hugo Eduardo de Castro Rolim Filho   */

/* Construa um algoritmo que leia a tabela acima e informe ao usuário o tempo
necessário para percorrer duas cidades por ele fornecidas, até o momento em que ele
fornecer duas cidades iguais (origem e destino)  */

import java.util.Scanner;

public class MatrizTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Irei informar o tempo necessário para percorrer duas cidades.");

        //Matriz de tempos
        int[][] tempos = {

                                /*Cidade*/
                    //    1   2   3   4   5   6   7
                    /*1*/ {0, 2, 11, 6, 15, 11, 1},
                    /*2*/ {2, 0, 7, 12, 4, 2, 15},
                    /*3*/ {11, 7, 0, 11, 8, 3, 13},
                    /*4*/ {6, 12, 11, 0, 10, 2, 1},
                    /*5*/ {15, 4, 8, 10, 0, 5, 13},
                    /*6*/ {11, 2, 3, 2, 5, 0, 14},
                    /*7*/ {1, 15, 13, 1, 13, 14, 0}
        };

        //Visualização da matriz. (para fins de estudo)

//        System.out.println("Tabela de tempos de voo entre as cidades:");
//        System.out.print("    "); //Espacamento
//        for (int i = 1; i <= 7; i++) {
//            System.out.print(i + "   ");
//        }
//        System.out.println();
//        for (int i = 0; i < tempos.length; i++) { //(.length retorna o número de linhas na matriz "tempos". Ou seja, se tem 7 cidades, temos 7 linhas.)
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < tempos[i].length; j++) { //Como cada linha (ou subarray) de tempos tem 7 colunas, tempos[i].length é 7, então o loop irá de 0 a 6, iterando por todas as colunas da linha i.
//                System.out.printf("%4d", tempos[i][j]); //%4d adiciona espaço de largura em "4" aos números.
//            }
//            System.out.println();
//        }

        //Solicite as cidades
        while (true) {
            System.out.print("Digite a cidade de origem (1 a 7): ");
            int origem = sc.nextInt();
            System.out.print("Digite a cidade de destino (1 a 7): ");
            int destino = sc.nextInt();

            //Se origem e destino sejam iguais, encerre o programa
            if (origem == destino) {
                System.out.println("Origem e destino são iguais.");
                break;
            }
            origem--;
            destino--;

                // Obtém o tempo de voo da matriz e exibe
                int tempo = tempos[origem][destino];
                System.out.println("O tempo necessário para percorrer da cidade " + (origem + 1) + " até a cidade " + (destino + 1) + " é de " + tempo + " Horas.");
            }
        }
    }