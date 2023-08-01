package ED_LOIANE_YOUTUBE;

public class Aula20_Matrizes_Bidimensional {
    public static void main(String[] args) {

        // @ Iniciando um vetor de vetores vazio
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8.5;
        notasAlunos[0][3] = 9.2;

        notasAlunos[1][0] = 8.9;
        notasAlunos[1][1] = 6;
        notasAlunos[1][2] = 2.5;
        notasAlunos[1][3] = 5.2;

        notasAlunos[2][0] = 0;
        notasAlunos[2][1] = 2.7;
        notasAlunos[2][2] = 8.5;
        notasAlunos[2][3] = 5.5;

        // @ Loop para printar os valores
        for (int i = 0; i < notasAlunos.length; i++) {
            // System.out.print(notasAlunos[i] + " ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " / ");
            }
            System.out.println();
        }

        // @ Mudando os valores da matriz
        notasAlunos[2][0] = 10;

        System.out.println();

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " / ");
            }
            System.out.println();
        }

        // @ Calculando a Media de cada Aluno
        System.out.println("Media das notas");
        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {

            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + "é: " + (soma / 4));
        }

        // @ Iniciando um vetor de vetores ja com valores definidos

        double[] notaAluno1 = { 8, 9, 7.6, 5.5 }; // @ Inicializando um vetor simples
        double[][] notaAluno2 = { { 8, 9, 10, 7.6, 5.5 }, { 2.5, 8.9, 5.9, 10, 3.5 } }; // @ Inicializando uma matriz (VETOR DE VETORES)
        System.out.println(notaAluno1);
        

        System.out.println("Output da matrix notasAlunos2");

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notaAluno2[i].length; j++) {
                System.out.print(notaAluno2[i][j] + " / ");
            }
            System.out.println();
        }
    }
}