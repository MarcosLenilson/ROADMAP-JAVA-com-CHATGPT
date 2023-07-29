package ED_LOIANE_YOUTUBE;

public class Aula6_Vetor_ElementoExiste {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        Testes vetor = new Testes(10);
		
		vetor.adiciona("elemento 1"); // 0
		vetor.adiciona("elemento 2"); // 1 			
		vetor.adiciona("elemento 3"); // 2

        System.out.println(vetor.busca("elemento 1"));
        System.out.println(vetor.busca("elemento 4"));
        
    }
}