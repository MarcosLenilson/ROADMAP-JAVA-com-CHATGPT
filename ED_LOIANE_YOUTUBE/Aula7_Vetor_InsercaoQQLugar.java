package ED_LOIANE_YOUTUBE;

public class Aula7_Vetor_InsercaoQQLugar {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        Testes vetor = new Testes(10);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        

        System.out.println(vetor);
        
        vetor.adiciona(0, "A");
        
        System.out.println(vetor);
        
        vetor.adiciona(3, "D");
        
        System.out.println(vetor);



    }
}