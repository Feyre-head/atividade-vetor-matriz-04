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
        for (char[] num : tabuleiro) {
            for (char tab : num) {
                tab = '~';
                System.out.print(tab + "  ");
            }
            System.out.println();
        }

        //Sorteio de 3 navios em posição aleatorias
        int totalNavios = 3;
        int colocados = 0;
        while (colocados < totalNavios){
            int linha = r.nextInt(tamanho);
            int coluna = r.nextInt(tamanho);
            if(mar[linha][coluna] == 0){
                mar[linha][coluna] = 1; //coloca navio
                colocados++;
            }
        }

        System.out.println("======== Batalha Naval ========");
        System.out.println("Encontre os 3 navios escondidos");

        int acertos = 0;
        while(acertos < totalNavios){
            System.out.println("Informe a linha (0-6)");
            int linha = sc.nextInt();

            System.out.println("Digite a Coluna (0-6)");
            int coluna = sc.nextInt();

            //Verifica se é válido a posição
            if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho){
                System.out.println("Posição Inválida, tente novamente!");
                continue;
            }

            //0 = água, 1 = navio, -1 = navio acertado, 2 = tiro na água
            if (mar[linha][coluna] == 1){
                System.out.println("Acertou um Navio!");
                mar[linha][coluna] = -1;
                tabuleiro[linha][coluna] = 'X';
                acertos++;
            } else if (mar[linha][coluna] == -1) {
                System.out.println("Você já acertou esse navio antes!");

            } else if (mar[linha][coluna] == 2) {
                System.out.println("Você já tentou aqui e foi água!");
            }else {
                System.out.println("Água");
                mar[linha][coluna] = 2;
                tabuleiro[linha][coluna] = 'O';

            }
            System.out.println("Navios restantes:" + (totalNavios - acertos));
            exibirTabuleiro(tabuleiro);
        }
        sc.close();

    }

    public static void exibirTabuleiro(char[][] tabuleiro){

    }

}
