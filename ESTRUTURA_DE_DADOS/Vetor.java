package ESTRUTURA_DE_DADOS;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    // ? CONSTRUTOR
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // @ Método fraco para adicionar elementos
    // public void adiciona(String elemento) {
	// 	for(int i = 0; i < this.elementos.length; i++) {
	// 		if(this.elementos[i] == null) {
	// 			this.elementos[i] = elemento;
	// 			break;
	// 		}
	// 	}
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
		
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else {
            System.out.println("ERRROOOOOO");
            return false;
        }
   }


}
