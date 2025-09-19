import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        //Jogo da Velha
        //Matriz Char 3x3 com espaço vazio   X e O

        Scanner sc = new Scanner(System.in);

        int jogadas = 0;
        int tamanho = 3;
        char[][] tabuleiro = new char[tamanho][tamanho];
        char jogador = 'X';

        //Inicializa tabuleiro vazio
        for (int l = 0; l < tamanho; l++) {   //linha
            for (int c = 0; c < tamanho; c++) {  //col
                tabuleiro[l][c] = ' ';
            }
        }

        boolean jogoAtivo = true;


        System.out.println("=========== Jogo da Velha ===========");
        System.out.println("== O Primeiro Jogador Inicia com X ==");
        System.out.println("=====================================");
        mostrarTabuleiro(tabuleiro);
        while (jogoAtivo && jogadas < 9) {


            //Jogada usuário
            System.out.println("Informe a linha (1-3): ");
            int linha = sc.nextInt() - 1; //para o indice ficar correto

            System.out.println("informe a coluna (1-3)");
            int coluna = sc.nextInt() - 1;

            //Validação da posição informada
            if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho) {
                System.out.println("Posição inválida, tente novamente!");
                continue;
            }
            //Validação se posição preenchida
            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição já ocupada, tente novamente");
                continue;
            }

            //Jogada
            tabuleiro[linha][coluna] = jogador;
            jogadas++;
            mostrarTabuleiro(tabuleiro);

            //Chama função verifica vitoria e passa o tabuleiro atual e o jogador
            if (verificaVitoria(tabuleiro, jogador)) {
                System.out.println("Jogador " + jogador + " Venceu!");
                mostrarTabuleiro(tabuleiro);
                jogoAtivo = false;
            } else {
                //troca jogador

                //jogador = (jogador == 'X') ? 'O' : 'X';
                //ou
                if (jogador == 'X'){
                    jogador = 'O';
                }else {
                    jogador = 'X';
                }
                System.out.println("Vez de Jogar: " + jogador);
            }
        }

        if (jogoAtivo) {
            System.out.println("Deu Velha! Ninguém Ganhou.");
        }
        sc.close();


    }

    //Classe para mostrar o tabuleiroo
    public static void mostrarTabuleiro(char[][] tabuleiro) {
        for (char[] linha : tabuleiro) {
            for (char tab : linha) {
                System.out.print(" " + tab + " | ");
            }
            System.out.println();
        }

    }

    //Classe verificar vitória
    public static boolean verificaVitoria(char[][] tabuleiro, char simbolo) {

        //Verifica Linhas
        for (int l = 0; l < tabuleiro.length; l++) {
            if (tabuleiro[l][0] == simbolo && tabuleiro[l][1] == simbolo && tabuleiro[l][2] == simbolo) {
                return true;

            }
        }

        //Verifica Colunas
        for (int c = 0; c < tabuleiro.length; c++) {
            if (tabuleiro[0][c] == simbolo && tabuleiro[1][c] == simbolo && tabuleiro[2][c] == simbolo) {
                return true;
            }
        }

        //Verifica diagonal
        if (tabuleiro[0][0] == simbolo & tabuleiro[1][1] == simbolo & tabuleiro[2][2] == simbolo) {
            return true;
        }

        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][1] == simbolo) {
            return true;
        }

        return false;


        //verificar se o espaço não está vazio
    }

}
