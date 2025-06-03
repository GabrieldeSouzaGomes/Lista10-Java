//8) Elaborar um programa que possibilite calcular a área total de uma residência
//(sala, cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.). O 
//programa deve solicitar a entrada do nome, a largura e o comprimento de um 
//determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também
//uma mensagem solicitando do usuário a confirmação de continuar calculando novos
//cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial.

package lista10;

import java.util.Scanner;

public class Numero08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0.0;
        String resposta;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.nextLine();

            System.out.print("Digite a largura do " + nomeComodo + " (em metros): ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do " + nomeComodo + " (em metros): ");
            double comprimento = scanner.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.printf("Área do %s: %.2f metros quadrados.%n", nomeComodo, areaComodo);

            // Consumir o \n pendente após nextDouble
            scanner.nextLine();

            System.out.print("Deseja continuar calculando novos cômodos? (SIM/NAO): ");
            resposta = scanner.nextLine().trim().toUpperCase();

        } while (!resposta.equals("NAO"));

        System.out.printf("Área total da residência: %.2f metros quadrados.%n", areaTotal);

        scanner.close();
    }
}
