package ESTRUTURA_DE_DADOS;

public class InsercaoEmArray {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        int[] meuArray = new int[5];

        // Inicializando o array com alguns valores
        meuArray[0] = 10;
        meuArray[1] = 20;
        meuArray[2] = 30;

        // Posição onde desejamos inserir o novo elemento
        int posicaoInsercao = 1;

        // Valor do novo elemento a ser inserido
        int novoElemento = 15;

        // Verificando se a posição de inserção é válida
        if (posicaoInsercao < 0 || posicaoInsercao >= meuArray.length) {
            System.out.println("Posição inválida. A inserção não pode ser realizada.");
        } else {
            // Deslocando os elementos após a posição de inserção uma posição à frente
            for (int i = meuArray.length - 1; i > posicaoInsercao; i--) {
                meuArray[i] = meuArray[i - 1];
            }

            // Inserindo o novo elemento na posição desejada
            meuArray[posicaoInsercao] = novoElemento;

            // Imprimindo o array após a inserção
            System.out.println("Array após a inserção:");
            for (int i = 0; i < meuArray.length; i++) {
                System.out.print(meuArray[i] + " ");
            }
        }
    }
}

