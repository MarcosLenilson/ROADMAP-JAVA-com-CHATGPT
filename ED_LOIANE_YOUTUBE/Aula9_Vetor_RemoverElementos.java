package ED_LOIANE_YOUTUBE;

public class Aula9_Vetor_RemoverElementos {
    public static void main(String[] args) {
        // Array estático de tamanho fixo
        Testes vetor = new Testes(3);
        
        vetor.adiciona("B"); // 0
        vetor.adiciona("G"); // 1
        vetor.adiciona("D"); // 2
        vetor.adiciona("E"); // 3
        vetor.adiciona("F"); // 4
        
        System.out.println(vetor);
        
        vetor.remove(1);
        
        System.out.println(vetor);

        // @ Removendo um elemento sem saber qual a posição dele
        System.out.println("Remover elemento E");
        int pos = vetor.busca("E");
        if(pos > -1){
            vetor.remove(pos);
        }else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}