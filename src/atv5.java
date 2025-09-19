import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        //Matriz 3x3 - preencher com Scanner
        //Criar for para somar linha por linha
        //Criar for para somar coluna por coluna

        //    0  1  2
        // 0  x  x  x
        // 1  x  x  x
        // 2  x  x  x

        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        int[][] numeros = new int[tamanho][tamanho];

        System.out.println("Informe 9 numeros para saber a soma de cada linha e Coluna");
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                System.out.println("Informe numero da linha [" + l + "]  e Coluna [" + c + "]"); //Informar número de acordo com o índice da linha e coluna
                numeros[l][c] = sc.nextInt();
            }
        }

        //Mostrar Matriz
        System.out.println("==== Matriz 3x3 ====");
        for (int[] num : numeros) {      //Percorre linha (array)
            for (int elemento : num) {  //Percorre numero de cada linha
                System.out.print(elemento + "   ");
            }
            System.out.println();
        }

        //Soma Linhas
        for (int l = 0; l < tamanho; l++) {         //Percorre as linhas
            int somaLinha = 0;                     //Variável para armazenar o valor das linhas
            for (int c = 0; c < tamanho; c++) {   //Percorre as colunas
                somaLinha = somaLinha + numeros[l][c];
            }
            System.out.println("Soma da linha " + (l + 1) + " = " + somaLinha);
        }

        System.out.println("====================");
        //Soma Coluna
        for (int l = 0; l < tamanho; l++) {
            int somaColuna = 0;
            for (int c = 0; c < tamanho; c++) {
                somaColuna = somaColuna + numeros[c][l];
            }
            System.out.println("Soma da Coluna " + (l + 1) + " = " + somaColuna);
        }
    }
}
