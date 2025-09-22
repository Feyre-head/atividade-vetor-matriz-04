import java.util.Random;

public class Atv10 {
    public static void main(String[] args) {
        //Char 7x7
        //sortear 3 posição de navio
        //while até achar todos

        int tamanho = 7;
        char[][] tabuleiro = new char[tamanho][tamanho];

        Random r = new Random();

        //Preencher o tabuleiro
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                tabuleiro[l][c] = '~';
                System.out.print(tabuleiro[l][c] + "  ");

            }
            System.out.println();
        }

        //add navios random


        //verificar que duas posições não sejam iguais

    }
}
