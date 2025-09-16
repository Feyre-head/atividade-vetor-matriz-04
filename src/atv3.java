import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        //Matriz 3x3

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        //    0  1  2
        // 0  x  x  x
        // 1  x  x  x
        // 2  x  x  x

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("Informe o valor da Linha [" + l + "] e coluna [" + c + "] ");
                matriz[l][c] = sc.nextInt();
            }
        }

        System.out.println("Números Informados");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(matriz[l][c] + " ");
                sc.nextLine();
            }
        }

    }
}
