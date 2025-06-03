//2. Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

package lista10;

public class ExercicioDoEWhile02 {

    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        do {
            if (numero % 2 == 0) {
                soma += numero;
            }
            numero++;
        } while (numero <= 500);

        System.out.println("Somatório dos valores pares de 1 a 500: " + soma);
    }
}
