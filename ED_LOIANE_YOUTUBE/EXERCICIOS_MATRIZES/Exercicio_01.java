package ED_LOIANE_YOUTUBE.EXERCICIOS_MATRIZES;

import java.util.Random;

public class Exercicio_01 {
    public static void main(String[] args) {

        int[][] numAleatorios = new int[4][4];

        Random numRandom = new Random();

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                numAleatorios[i][j] = numRandom.nextInt(100);

            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                if (numAleatorios[i][j] > maior) {
                    maior = numAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }

            }
        }

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                System.out.print(numAleatorios[i][j] + " "); //@ Imprimi todos os elementos linhas e colunas
            }
            System.out.println();
        }


        System.out.println("Maior valor: " + maior);
        System.out.println("linha: " + linha);
        System.out.println("coluna: " + coluna);

    }
}