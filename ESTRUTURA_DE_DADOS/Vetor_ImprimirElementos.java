package ESTRUTURA_DE_DADOS;

public class Vetor_ImprimirElementos {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        Testes vetor = new Testes(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");			
		vetor.adiciona("elemento 3");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);

    }
}