import java.util.Random;

public class atv4 {
    public static void main(String[] args) {
        //Diagonal Principal

        Random random = new Random();

        int[][] matrizList = new int[4][4];

        for (int l = 0; l < matrizList.length; l++) {
            for (int c = 0; c < matrizList.length; c++) {
                matrizList[l][c] = random.nextInt(10);

            }
        }

        for (int l = 0; l < matrizList.length; l++) {
            for (int c = 0; c < matrizList.length; c++) {
                System.out.println(matrizList[l][c]);
                System.out.println(); // quebra de linha para formatar

            }
        }

        for (int i = 0; i < matrizList.length; i++) {
            System.out.println(matrizList[i][i]);
        }
    }
}
