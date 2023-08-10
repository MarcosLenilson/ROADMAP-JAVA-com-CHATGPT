package ED_LOIANE_YOUTUBE.LISTA;

public class ListaEncadeada<T>{
    /* 
        Cada lista tem 1 nó e esse nó ou celula, tem duas informações

            @ INICIO 👇 aponta para o primeiro nó
                %NÒ
        |"""""""""""""""""""|"""""|
        |                   |     |
        |                   |  @  | => Referencia ao próximo objeto
        |                   |     |
        |                   |     |
        ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
           %parte principal    

    */

    //@CODIGO👇

    private No<T> inicio;

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento); //@ Estancia com parametro ELEMENTO. Criado um nó com ELEMENTO.
        this.inicio = celula; //@ INICIO aponta para celula criada
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }


    
}