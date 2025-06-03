//4) Elaborar um programa que efetue o cálculo e no final apresente o somatório
//do número de grãos de trigo que se pode obter num tabuleiro de xadrez, obedecendo
//à seguinte regra: colocar um grão de trigo no primeiro quadro e nos quadros seguintes
//o dobro do quadro anterior. Ou seja, no primeiro quadro coloca-se 1 grão, no segundo quadro 
//colocam-se 2 grãos (neste momento têm-se 3 grãos), no terceiro quadro colocam-se 4 grãos (tendo 
//neste momento 7 grãos), no quarto colocam-se 8 grãos (tendo-se então 15 grãos) até atingir o sexagésimo
//quarto (64o) quadro. Utilize variáveis do tipo real como acumuladores.

package lista10;

public class ExercicioTiposAcumuladores04 {

    public static void main(String[] args) {
        double grãosNoQuadro = 1;  // grãos no quadro atual
        double totalGrãos = 0;     // total acumulado

        for (int quadro = 1; quadro <= 64; quadro++) {
            totalGrãos += grãosNoQuadro;
            grãosNoQuadro *= 2;  // dobra para o próximo quadro
        }

        System.out.printf("Total de grãos de trigo nos 64 quadros: %.0f\n", totalGrãos);
    }
}

