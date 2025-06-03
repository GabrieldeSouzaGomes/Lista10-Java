//1. Apresentar os quadrados dos números inteiros de 15 a 200.

package lista10;

public class ExercicioNumerosInteirosQuinzeADuzentos01 {

    public static void main(String[] args) {
        int numero = 15;

        System.out.println("Quadrados dos números de 15 a 200:");

        do {
            long quadrado = (long) numero * numero;
            System.out.println(numero + " ao quadrado = " + quadrado);
            numero++;
        } while (numero <= 200);
    }
}

