public class atv6 {
    public static void main(String[] args) {
          // Criar Matriz 5x5
         // Preencher diagonal com 1 e o restante 0
        // Índiice onde linha e coluna sao iguais colocar 1

        int tamanho = 5;
        int[][] matriz = new int[tamanho][tamanho];

        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                if (l == c) {         //Se o índice de L e C forem iguais armazena 1
                    matriz[l][c] = 1;
                } else {             //Senão armazena 0
                    matriz[l][c] = 0;
                }
            }
        }

        //For each para printar
        for (int[] num : matriz) {       // Pega cada linha (array) da matriz
            for (int numeros : num) {   // Pega o numero de cada linha
                System.out.print(numeros + "  ");
            }
            System.out.println();
        }

    }
}
