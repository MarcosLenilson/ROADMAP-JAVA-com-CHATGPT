package ESTRUTURA_DE_DADOS.EXERCICIOS;

/*
 * 
 */

public class Arrays_BuscarMenorValor {

    public static void main(String[] args) {
        int[] v = {6, 45, 48, 5, 4, 12, 122, 44, 12, 36, 55, 483, 100, 78, 54, 65, 48, 108, 2, 3, 7, 8, 9, 99};
        int index_Menor = buscar_Menor(v);

        System.out.printf("A posicao do elemento de Menor valor e %d", index_Menor);

    }
      
    // @ Função para BUSCA LINEAR
    private static int buscar_Menor(int[] v) {
        int Menor = 0; // @ Variável que guardará o índice de Menor valor de elemento.

        // @ BUSCA LINEAR = Pergunta para todos o elementos e ele é Menor. Caso sendo o Menor o índice é atribuído à variável Menor
        for(int i = 1; i < v.length; i++){
            if(v[i] < v[Menor]){ // @ SE v na posição de i(index) for Menor que v na posição da variável Menor que é igual a 0... a variável recebe a posição de i
                Menor = i;
            }
        }
        
        return Menor;
    }
}
