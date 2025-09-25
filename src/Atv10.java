import java.util.Random;
import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        //Char 7x7
        //sortear 3 posição de navio
        //while até achar todos
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int tamanho = 7;
        int[][] mar = new int[tamanho][tamanho];
        char[][] tabuleiro = new char[tamanho][tamanho]; // usado só para exibir ao jogador

//        ~ → água (ainda não tentou)
//        O → tiro na água
//        X → navio acertado

        //Inicializa tabuleiro com Água
        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                tabuleiro[l][c] = '~';
            }
        }

        exibirTabuleiro(tabuleiro);

        //Sorteio de 3 navios em posição aleatorias
        int totalNavios = 3;
        int colocados = 0;
        while (colocados < totalNavios) {
            int linha = r.nextInt(tamanho);
            int coluna = r.nextInt(tamanho);
            if (mar[linha][coluna] == 0) {
                mar[linha][coluna] = 1; //coloca navio
                colocados++;
            }
        }

//        exibirTabuleiroBomba(mar);

        System.out.println("======== Batalha Naval ========");
        System.out.println("Encontre os 3 navios escondidos");
        System.out.println("""               
                0 = Tiro na Água
                X = Bomba
                """);

        int acertos = 0;
        while (acertos < totalNavios) {
            System.out.println("Informe a linha (0-6)");
            int linha = sc.nextInt();

            System.out.println("Digite a Coluna (0-6)");
            int coluna = sc.nextInt();

            //Verifica se é válido a posição
            if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho) {
                System.out.println("Posição Inválida, tente novamente!");
                continue;
            }

            System.out.println("=========================");
            //0 = água, 1 = navio, -1 = navio acertado, 2 = tiro na água
            if (mar[linha][coluna] == 1) {
                System.out.println("\uD83D\uDCA5 Acertou um Navio!");
                mar[linha][coluna] = -1;
                tabuleiro[linha][coluna] = 'X';
                acertos++;
            } else if (mar[linha][coluna] == -1) {
                System.out.println("Você já acertou esse navio antes!");

            } else if (mar[linha][coluna] == 2) {
                System.out.println("Você já tentou aqui e foi água!");
            } else {
                System.out.println("\uD83C\uDF0A Água!");
                mar[linha][coluna] = 2;
                tabuleiro[linha][coluna] = 'O';

            }
            System.out.println("Navios restantes:" + (totalNavios - acertos));

            System.out.println("======================");
            exibirTabuleiro(tabuleiro);
            System.out.println("======================");
        }
        sc.close();

    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("   0  1  2  3  4  5  6 ");
        for (int l = 0; l < tabuleiro.length; l++) {
            System.out.print(l + "  ");
            for (int c = 0; c < tabuleiro.length; c++) {
                System.out.print(tabuleiro[l][c] + "  ");
            }
            System.out.println();
        }
    }


//    public static void exibirTabuleiroBomba(int[][] mar) {
//        System.out.println("   0  1  2  3  4  5  6 ");
//        for (int l = 0; l < mar.length; l++) {
//            System.out.print(l + "  ");
//            for (int c = 0; c < mar.length; c++) {
//                System.out.print(mar[l][c] + "  ");
//            }
//            System.out.println();
//        }
//    }
}
