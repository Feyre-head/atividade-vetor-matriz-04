import java.util.Random;

public class atv4 {
    public static void main(String[] args) {
        //Matriz 4x4 com Random
        //Exibir números na Diagonal (quando os indices l e c são iguais)


        //   0  1  2  3
        // 0 D  X  X  X
        // 1 X  D  X  X
        // 2 X  X  D  X
        // 3 X  X  X  D

        Random random = new Random();

        int[][] matrizList = new int[4][4];

        //Adiciona números aleatórios na Matriz
        for (int l = 0; l < matrizList.length; l++) {
            for (int c = 0; c < matrizList.length; c++) {
                matrizList[l][c] = random.nextInt(9);

            }
        }

        // for each / Print da Matriz
        for (int[] linha : matrizList) {    //Percorre cada linha (array) da Matriz
            for (int elemento : linha) {   // Percorre cada número de cada da linha
                System.out.print(elemento + "   ");

            }
            System.out.println(); //Quebra de linha
        }

        //Print índice
        System.out.println("Números Diagonal");
        for (int i = 0; i < matrizList.length; i++) {
            System.out.println(matrizList[i][i]); //Printa somente onde os índices forem iguais na Matriz
        }
    }
}
