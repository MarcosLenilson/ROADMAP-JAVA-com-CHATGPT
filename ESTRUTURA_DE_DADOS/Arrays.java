package ESTRUTURA_DE_DADOS;

public class Arrays {
    public static void main(String[] args) {
        /*
          O java sempre irá inicializar o array com valor 0
        */

        // DECLARAÇÔES SEMELHANTES

        // int n1, n2, n3, n4, n5;
        final int tamanho = 5; // @ DEFINIÇÂO DE CONTANTE 
        // int[] num = new int[tamanho]; // @ ARRAY VAZIO COM ESSA INICIALIZAÇÃO

        int [] num = {102, 56, 186, 5, 17}; // @ ARRAY JÁ COM ELEMENTOS DENTRO (INICIALIZADO)

        // num[0] = 102;
        // num[1] = 56;
        // num[2] = 186;
        // num[3] = 5;
        // num[4] = 17;

        // // @ LOOP INCREMENTANDO
        // for (int i = 0; i < tamanho; i++) {
        //     System.out.printf("%d%n", num[i]);
        // }

        // System.out.println("*********************************************************************************************");

        // // @ LOOP DECREMENTANDO
        // for (int i = 4; i < tamanho; i--) {
        //     System.out.printf("%d%n", num[i]);
        // }

        // @ LOOP ESPECIAL QUE FACILITA AS ITERAÇÕES COM ARRAYS, COLEÇÕES ETC.
        for (int n:num){
            System.out.printf("%d%n", n);
        }


    }

}
