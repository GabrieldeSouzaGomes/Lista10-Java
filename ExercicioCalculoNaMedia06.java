//) Elaborar um programa que efetue a leitura sucessiva de valores numéricos
//e apresente no final o total do somatório, a média aritmética e o total de 
//valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário
//estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o 
//usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar 
//como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da média

package lista10;

import java.util.Scanner;

public class ExercicioCalculoNaMedia06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
                contador++;
            }

        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("\nTotal de valores lidos: " + contador);
            System.out.println("Somatório: " + soma);
            System.out.printf("Média aritmética: %.2f\n", media);
        } else {
            System.out.println("\nNenhum número positivo foi inserido.");
        }

        scanner.close();
    }
}
