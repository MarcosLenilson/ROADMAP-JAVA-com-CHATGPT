package ED_LOIANE_YOUTUBE;

public class Aula5_Vetor_PosicaoElementos {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        Testes vetor = new Testes(10);
		
		vetor.adiciona("elemento 1"); // 0
		vetor.adiciona("elemento 2"); // 1 			
		vetor.adiciona("elemento 3"); // 2

        System.out.println(vetor.busca(2));
        
    }
}