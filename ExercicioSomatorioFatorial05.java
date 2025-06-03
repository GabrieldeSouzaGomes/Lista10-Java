//5) Elaborar um programa que efetue a leitura de 15 valores numéricos 
//inteirose no final apresente o total do somatório da fatorial de cada valor lido.

package lista10;

import java.util.Scanner;

public class ExercicioSomatorioFatorial05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long somaFatoriais = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

            long fatorial = calcularFatorial(numero);
            somaFatoriais += fatorial;
        }

        System.out.println("Somatório dos fatoriais dos números digitados: " + somaFatoriais);

        scanner.close();
    }

    // Método para calcular o fatorial de um número inteiro não negativo
    private static long calcularFatorial(int n) {
        if (n < 0) {
            return 0; // Ou pode tratar erro; aqui assumimos fatorial de negativo como 0
        }

        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
