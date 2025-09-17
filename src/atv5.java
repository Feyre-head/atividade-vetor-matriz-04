import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        int[][] numeros = new int[tamanho][tamanho];

        System.out.println("Informe 9 numeros para saber a soma de cada linha e Coluna");
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                System.out.println("Informe numero da linha [" + l + "]  e Coluna [" + c + "]");
                numeros[l][c] = sc.nextInt();
            }
        }

        System.out.println("==== Matriz 3x3 ====");
        for (int[] num : numeros) { //percorre linha (array)
            for (int elemento : num) { //percorre numero de cada linha
                System.out.print(elemento + "   ");
            }
            System.out.println();
        }

        // Soma linha
        for (int l = 0 ; l < tamanho ; l++){

        }
    }
}
