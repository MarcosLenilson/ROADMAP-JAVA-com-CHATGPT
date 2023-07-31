package ED_LOIANE_YOUTUBE;

public class Aula8_Vetor_AdicionarCapacidade {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        Testes vetor = new Testes(3);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        
        System.out.println(vetor);

    }
}