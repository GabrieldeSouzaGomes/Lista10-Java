//7) Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10.

package lista10;

public class ExercicioValoresImpares07 {

    public static void main(String[] args) {
        System.out.println("Fatorial dos valores ímpares de 1 a 10:");

        for (int i = 1; i <= 10; i += 2) { // percorre só os ímpares
            long fatorial = calcularFatorial(i);
            System.out.println(i + "! = " + fatorial);
        }
    }

    // Método que calcula o fatorial de um número inteiro não negativo
    private static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
