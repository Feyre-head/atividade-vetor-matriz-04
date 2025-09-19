import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        //Matriz 3x3
        //Mostrar a Matriz no formato tradicional
        //Utilizar Scanner para entrada de dados
        //Utilizar for para preenche a Matriz

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        //    0  1  2
        // 0  x  x  x
        // 1  x  x  x
        // 2  x  x  x

        //Pedir valores e guardar
        for (int l = 0; l < matriz.length; l++) {   //Percorre linha
            for (int c = 0; c < matriz.length; c++) {  //Percorre coluna
                System.out.println("Informe o valor da Linha [" + l + "] e coluna [" + c + "] ");
                matriz[l][c] = sc.nextInt(); //Guarda valores
            }
        }

        //Print com (for each)
        System.out.println("Números Informados");
        for (int[] linha : matriz) {  //Percorre cada linha (arrays) da matriz
            for (int elemento : linha) {  //Percorre os número de cada linha
                System.out.print(elemento + " ");
            }
            System.out.println(); //quebra de linha
        }
    }
}
