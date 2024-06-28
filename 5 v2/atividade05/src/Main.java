/*   Hugo Eduardo de Castro Rolim Filho
    Registro acadêmico: 202411011264    */

/* 5. (0,2 pontos) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por
até três horas. Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado
após as três primeiras horas. A tarifa máxima para qualquer dado período de 24 horas é R$
10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva
um aplicativo que calcule e exiba as tarifas de estacionamento para cada cliente que
estacionou nessa garagem ontem. Você deve inserir as horas de estacionamento para cada
cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos
recibos de ontem. Ele deve utilizar o métod  calculaCobrancas para determinar a tarifa
para cada cliente.*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalRecebido = 0;

        while (true) {
            System.out.print("Digite quantas horas o veículo ficou estacionado (ou -1 para sair): ");
            int horas = sc.nextInt();

            if (horas == -1) {
                break;
            } else if (horas < 0 || horas > 24) { // || (ou)
                System.out.println("Horas inválidas. Por favor, insira um número de 0 a 24.");
            } else {
                double cobranca = calculoCobranca(horas); // Chama o método calculoCobranca
                totalRecebido += cobranca; // Adiciona a cobrança atual ao total recebido para mostrar no final do progama

                // Exibe a cobrança calculada para o cliente atual
                System.out.printf("A cobrança para %d horas é: R$ %.2f\n", horas, cobranca); //%valor .2casas decimais f ponto fluante
            }
        }

        // Total de todas as cobranças para o dia
        System.out.printf("O total de recibos de ontem é: R$ %.2f\n", totalRecebido);
    }

    // Método que calcula a tarifa de estacionamento baseada nas horas estacionadas
    public static double calculoCobranca(int horas) {
        double cobranca = 0;

        if (horas <= 3) {
            cobranca = 2.00;
        } else if (horas > 3 && horas <= 24) {
            cobranca = 2.00 + (horas - 3) * 0.50; // Adiciona R$ 0,50 por cada hora adicional após as 3 primeiras horas
            if (cobranca > 10.00) {
                cobranca = 10.00;
            }
        }

        return cobranca; // Retorna o valor da cobrança calculada para usar no programa principal
    }
}