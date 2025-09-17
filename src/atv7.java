import java.util.Random;

public class atv7 {
    public static void main(String[] args) {

        //Transposta de Matriz
        //Criar Matriz [3][2]
        //Criar Matriz [2][3]
        //inverter [indice

        int tamanho2 = 2;
        int tamanho3 = 3;
        int[][] matriz = new int[tamanho3][tamanho2];
        int[][] matrizTransposta = new int[tamanho2][tamanho3];

        Random r = new Random(6);

        for (int l = 0; l < tamanho3; l++) {
            for (int c = 0; c < tamanho2; c++) {
                matriz[l][c] = r.nextInt(6);
            }
        }


        for (int[] num : matriz) {
            for (int numeros : num) {
                System.out.print(numeros + "  ");
            }
            System.out.println();
        }




    }
}
