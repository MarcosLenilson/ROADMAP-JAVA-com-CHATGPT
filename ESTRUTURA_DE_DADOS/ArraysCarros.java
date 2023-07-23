package ESTRUTURA_DE_DADOS;

public class ArraysCarros {
    public static void main(String[] args) {

        // final int numCarros = 5;
        // Carro[] carros = new Carro[numCarros];

        // carros[0]=new Carro("HRV");
        // carros[1]=new Carro("Golf");
        // carros[2]=new Carro("Camaro");
        // carros[3]=new Carro("Mustang");
        // carros[4]=new Carro("Toro");

        // for(int i = 0; i < numCarros; i++){
        // carros[i].info();
        // }

        // @ CRIAR UM ARRAY PARA CRIAR OUTRO ARRAY

        final int numCarros = 5;
        Carro[] carros = new Carro[numCarros];
        String[] nomeCarros = {"HRV", "Golf", "Camaro", "Mustang", "Toro"};

        //@ INICIALIZAR O ARRAY carros
        for(int i = 0; i < numCarros; i++){
            carros[i] = new Carro(nomeCarros[i]);
        }

        // @ IMPRIMIR CARROS

        for(Carro c:carros){
            c.info();
        }

    }

}
