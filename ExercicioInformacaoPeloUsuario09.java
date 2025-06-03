//9) Elaborar um programa que efetue a leitura de valores positivos inteiros 
//até que um valor negativo seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.

package lista10;

import java.util.Scanner;

public class ExercicioInformacaoPeloUsuario09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;  // menor valor possível para inicializar maior
        int menor = Integer.MAX_VALUE;  // maior valor possível para inicializar menor

        do {
            System.out.print("Digite um número positivo (negativo para sair): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

        } while (numero >= 0);

        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número positivo foi informado.");
        } else {
            System.out.println("Maior número informado: " + maior);
            System.out.println("Menor número informado: " + menor);
        }

        scanner.close();
    }
}
