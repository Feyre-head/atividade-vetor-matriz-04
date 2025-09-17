import java.util.Random;

public class atv4 {
    public static void main(String[] args) {
        //Matriz 4x4 com Random
        //Exibir números na Diagonal (quando os indices l e c são iguais)

        Random random = new Random();

        int[][] matrizList = new int[4][4];

        for (int l = 0; l < matrizList.length; l++) {
            for (int c = 0; c < matrizList.length; c++) {
                matrizList[l][c] = random.nextInt(12);

            }
        }

        // for each
        for (int[] linha : matrizList) {    //Percorre linha (array)
            for (int elemento : linha) {     // percorre cada elemento da linha
                System.out.print(elemento + "   ");

            }
            System.out.println(); // quebra de linha para formatar
        }

        System.out.println("Números Diagonal");
        for (int i = 0; i < matrizList.length; i++) {
            System.out.println(matrizList[i][i]);
        }
    }
}
