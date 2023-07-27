package ESTRUTURA_DE_DADOS;

public class Vetor_PosicaoElementos {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        Testes vetor = new Testes(2);
		
		vetor.adiciona("elemento 1"); // 0
		vetor.adiciona("elemento 2"); // 1 			
		vetor.adiciona("elemento 3"); // 2

        System.out.println(vetor.busca(15));
        
    }
}