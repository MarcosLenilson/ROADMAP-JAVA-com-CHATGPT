package ESTRUTURA_DE_DADOS.EXERCICIOS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Arrays_InsercaoDinamicamente {

   

    public static void main(String[] args) {
         // Criar um ArrayList vazio
        ArrayList<Integer> lista = new ArrayList<>();

        // Definir o tamanho do array
        int tamanhoArray = 5;

        // Preencher o ArrayList com números aleatórios
        Random random = new Random();
        for (int i = 0; i < tamanhoArray; i++) {
            int numeroAleatorio = random.nextInt(100); // Gera um número aleatório entre 0 e 99
            lista.add(numeroAleatorio);
        }

        System.out.println("Os elementos do array são:");
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }

        // Ordenar o ArrayList em ordem crescente
        Collections.sort(lista);

        System.out.println("Array ordenado:");
        for (int elemento : lista) {
            System.out.println(elemento);
        }

    }

   
}
