package ED_LOIANE_YOUTUBE;

import java.util.Arrays;

public class Testes {
    private String[] elementos;
    private int tamanho;

    // ? CONSTRUTOR
    public Testes(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // @ Método fraco para adicionar elementos
    // public void adiciona(String elemento) {
    //     for(int i = 0; i < this.elementos.length; i++) {
    //         if(this.elementos[i] == null) {
    //             this.elementos[i] = elemento;
    //             break;
    //         }
    //     }
    // }

    // @ Método que trata exceções... Nesse caso tentando adicionar um elemento em vetor ja cheio 
    // public void adiciona(String elemento) throws Exception {
				
	// 	if(this.tamanho > this.elementos.length) { // @ Aqui fazemos a verificação se a variável tamanho for maior que o comprimento do vetor...
	// 		this.elementos[this.tamanho] = elemento; // @ è feita a atribuição de mais um espaço no vetor
	// 		this.tamanho++;
	// 	}else { // @ Caso se a variável for menor que o comprimento do vetor...
	// 		throw new Exception("vetor já esta cheio"); // @ é mostrado uma mensagem no ERRO que será exibido
	// 	}
	// }

    // @ Função que retorna um booleano True caso consiga adicionar mais elementos no vetor ou False caso não
    public boolean adiciona(String elemento) {
    aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    // 0 1 2 3 4 5 6   
    // B C E F G + + 
    // @ MÉTODO ADICIONAR ELEMENTO EM QQ LUGAR DO VETOR
    public boolean adiciona(int posicao, String elemento){
        aumentaCapacidade();
        if(!(posicao >= 0 && posicao < tamanho)){ // @ Verifica se a posição que o usuário esta passando é uma posição válida 
            throw new IllegalArgumentException("Posição Inválida");
        } 
       
        // & Mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i]; // @ O vetor da posição 4 + 1 recebendo o 4 que é o  valor do i
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;        
    }

    // @ AUMENTAR A CAPACIDADE DO VETOR
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2]; // @ Dobrando a capacidade do vetor
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;

        }
    }


    // B G D E F => posição a ser removida = 1 (G)
    // 0 1 2 3 4 => tamanho = 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    // @ MÉTODO PARA REMOVER ELEMENTO DO VETOR
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){ // @ Verifica se a posição que o usuário esta passando é uma posição válida 
            throw new IllegalArgumentException("Posição Inválida");
        } 
        for(int i = posicao; i < this.tamanho - 1; i++ ){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }


    // @ MÉTODO DE BUSCA DE ELEMENTO DO VETOR
    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        } 
        return  this.elementos[posicao];
    }

    // @ MÉTODO SE EXISTE
    public int busca(String elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i; // @ Retorna o próprio elemento
            }
        }
        return -1; // @ Retorno de um valor que não existe
    }     



    // @ IMPRIMIR ELEMENTOS DO VETOR
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }



}
