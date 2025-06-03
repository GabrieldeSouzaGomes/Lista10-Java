//10) Elaborar um programa que apresente o resultado inteiro da divisão 
//de dois números quaisquer. Para a elaboração do programa, não utilizar 
//em hipótese alguma o conceito do operador aritmético DIV. A solução deve
//ser alcançada com a utilização de looping. Ou seja, o programa deve 
//apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.

package lista10;

import java.util.Scanner;

public class ExercicioCabeNoDividendo10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo (número inteiro positivo): ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor (número inteiro positivo): ");
        int divisor = scanner.nextInt();

        if (divisor <= 0) {
            System.out.println("Erro: o divisor deve ser maior que zero.");
        } else {
            int quociente = 0;

            while (dividendo >= divisor) {
                dividendo -= divisor;
                quociente++;
            }

            System.out.println("O resultado da divisão inteira é: " + quociente);
        }

        scanner.close();
    }
}

