package ESTRUTURA_DE_DADOS;

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
    // for(int i = 0; i < this.elementos.length; i++) {
    // if(this.elementos[i] == null) {
    // this.elementos[i] = elemento;
    // break;
    // }
    // }
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

    // @ Função que retorna um booleano True caso consiga adicionar mais elementos
    // no vetor ou False caso não
    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            System.out.println("ERRROOOOOO");
            return false;
        }
    }
    // @ MÉTODO DE BUSCA
    public String busca(int posicao){
        return  this.elementos[posicao];
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
