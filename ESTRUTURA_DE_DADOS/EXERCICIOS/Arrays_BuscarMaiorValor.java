package ESTRUTURA_DE_DADOS.EXERCICIOS;

public class Arrays_BuscarMaiorValor {

    public static void main(String[] args) {
        int[] v = {6, 45, 48, 5, 4, 12, 122, 44, 12, 36, 55, 483, 100, 78, 54, 65, 48, 108, 2, 3, 7, 8, 9, 99};
        int index_Maior = buscar_Maior(v);

        System.out.printf("A posicao do elemento de maior valor e %d", index_Maior);

    }
      
    // @ Função para BUSCA LINEAR
    private static int buscar_Maior(int[] v) {
        int maior = 0; // @ Variável que guardará o índice de maior valor de elemento.

        // @ BUSCA LINEAR = Pergunta para todos o elementos e ele é maior. Caso sendo o maior o índice é atribuído à variável MAIOR
        for(int i = 1; i < v.length; i++){
            if(v[i] > v[maior]){ // @ SE v na posição de i(index) for maior que v na posição da variável maior que é igual a 0... a variável recebe a posição de i
                maior = i;
            }
        }
        
        return maior;
    }
}
