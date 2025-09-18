import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        // Jogo da Velha
        //Matriz Char 3x3 com espaço vazio   X e O

        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        char[][] tabuleiro = new char[tamanho][tamanho];

        //inicializa matriz com espaços vazios
        for (int l = 0; l < tamanho; l++) {   //linha
            for (int c = 0; c < tamanho; c++) {  //col
                tabuleiro[l][c] = ' ';

            }
        }

        System.out.println(" === Jogo da Velha === ");
        for (char[] linha : tabuleiro) {
            for (char elemento : linha) {
                System.out.print(elemento + "| ");
            }
            System.out.println();
        }
        boolean jogoAtivo = true;
        char jogadorAtual = 'X';
        int jogadas = 0;

        while (jogoAtivo) {
            //Jogada usuário
            System.out.println("Informe a linha (1-3): ");
            int linha = sc.nextInt() - 1; //para o indice ficar correto
            System.out.println("informe a coluna (1-3)");
            int coluna = sc.nextInt() - 1;

            //validação
            if (linha >= 0 && linha < tamanho && coluna >= 0 && coluna < tamanho) {
                if (tabuleiro[linha][coluna] == ' ') { //só preenche se estiver vazio
                    tabuleiro[linha][coluna] = 'X';
                } else {
                    System.out.println("Posição já ocupada!");
                }
            } else {
                System.out.println("Posição inválida");
            }

        }


    }
}
