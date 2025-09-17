public class atv6 {
    public static void main(String[] args) {
        //Criar Matriz 5x5
        // Preencher diagonal com 1 e o restante 0
        // onde l e c sao iguais colocar 1

        int tamanho = 5;
        int[][] matriz = new int[tamanho][tamanho];

        for (int l = 0 ; l < tamanho ; l++){
            for (int c = 0 ; c < tamanho; c++){
                if(l == c){
                    matriz[l][c] = 1;
                }else {
                    matriz[l][c] = 0;
                }
            }
        }

        for (int[] num : matriz){ //pega cada linha (array) da matriz
            for (int numeros : num) {   //pega o numero de cada linha
                System.out.print(numeros + "  ");
            }
            System.out.println();
        }

    }
}
