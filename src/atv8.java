import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        // Jogo da Velha
        //Matriz Char 3x3 com espaço vazio   X e O

        Scanner sc = new Scanner(System.in);

        int jogadas = 0;
        int tamanho = 3;

        char[][] tabuleiro = new char[tamanho][tamanho];
        char jogador = 'X';

        //inicializa tabuleiro vazio
        for (int l = 0; l < tamanho; l++) {   //linha
            for (int c = 0; c < tamanho; c++) {  //col
                tabuleiro[l][c] = ' ';

            }
        }


        System.out.println("=========== Jogo da Velha ===========");
        System.out.println("== O Primeiro Jogador Inicia com X ==");
        System.out.println("=====================================");
        while (jogadas < 9) {


            //Jogada usuário
            mostrarTabuleiro(tabuleiro);

            System.out.println("Informe a linha (1-3): ");
            int linha = sc.nextInt() - 1; //para o indice ficar correto

            System.out.println("informe a coluna (1-3)");
            int coluna = sc.nextInt() - 1;

            //validação
            if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho) {
                System.out.println("Posição inválida, tente novamente!");
                continue;
            }
            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição já ocupada, tente novamente");
                continue;
            }

            //jogada
            tabuleiro[linha][coluna] = jogador;
            jogadas++;


            //troca jogador
            jogador = (jogador == 'X') ? 'O' : 'X';
            System.out.println("Vez de Jogar: " + jogador);


            // usar 3 ifs
            //1 para linha
            //1 para colunas
            //1 para diagonais

            //ou for para percorrer linhas e colunas
            //e ifs para diagonais

            //verificar se o espaço não está vazio
        }

        System.out.println("Deu Velha! Ninguém Ganhou.");
        sc.close();


    }

    public static void mostrarTabuleiro(char[][] tabuleiro) {
        for (char[] linha : tabuleiro) {
            for (char tab : linha) {
                System.out.print("| " + tab + " |");
            }
            System.out.println();
        }

    }

}
