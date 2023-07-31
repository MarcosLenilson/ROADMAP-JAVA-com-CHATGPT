package ESTRUTURA_DE_DADOS.EXERCICIOS;

import java.util.Arrays;

public class Arrays_EstaOrdenado {

    public static void main(String[] args) {
        int[] v = {6, 45, 48, 5, 4, 12, 122, 44, 12, 2, 3, 7, 8, 9, 99};
        
        System.out.println("Números não ordenados:");
        for(int numero : v)
            System.out.println(numero);
        System.out.println();

        Arrays.sort(v);

        System.out.println("Números ordenados:");
        for(int numero : v)
            System.out.println(numero);
        System.out.println();

    }

   
}
