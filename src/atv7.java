import java.util.Random;

public class atv7 {
    public static void main(String[] args) {

        //Transposta de Matriz
        //Criar Matriz [3][2]
        //Criar Matriz [2][3]
        //Inverter [indice

        int tamanho2 = 2;
        int tamanho3 = 3;
        int[][] matriz = new int[tamanho3][tamanho2];
        int[][] matrizTransposta = new int[tamanho2][tamanho3];

        Random r = new Random();

        //Preenchendo Matriz e invertendo índice
        for (int l = 0; l < tamanho3; l++) {
            for (int c = 0; c < tamanho2; c++) {
                matriz[l][c] = r.nextInt(6);      //Ads número Random na Matriz
                matrizTransposta[c][l] = matriz[l][c];  //Inverte
            }
        }

        System.out.println("Matriz:");
        //Mostrando Matriz 3x2
        for (int[] num : matriz) {
            for (int numeros : num) {
                System.out.print(numeros + "  ");
            }
            System.out.println();
        }

        System.out.println("Matriz Transposta:");
        //Mostrando Matriz Transposta
        for (int[] num : matrizTransposta) {
            for (int numeros : num) {
                System.out.print(numeros + "  ");
            }
            System.out.println();
        }

    }
}
