import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {

        // Armazenar entrada 10 num vetor usando for
        // for / if / é possivel usar for e if para saber tamanho menor e maior
        // ou usar o metodo (Math) min e máx para mostrar valor maior e menor do array

        Scanner sc = new Scanner(System.in);
        int[] listaVetor = new int[10];  //Cria vetor com tamanho 10

        System.out.println("Vamos Armazenar 10 números em um Array e mostrar o Menor e o Maior valor");

        //Laço de Repetição para armazenar 10 números
        for (int i = 0; i < listaVetor.length; i++) {
            System.out.println("Informe o [" + (i + 1) + "] Número: ");
            listaVetor[i] = sc.nextInt();
        }

        //Mostrar os números informados  (usando for each)
        System.out.println("Números informados:");
        for (int num : listaVetor) {  //Armazena todos os itens do vetor em num
            System.out.println(num); //Printa os valores de num
        }
        System.out.println("===================");

        //Cria vetor para guardar valor maior e menor
        int maiorNum = listaVetor[0];
        int menorNum = listaVetor[0];

        for (int num : listaVetor) {   //(for each) percorre o vetor e armazena os numeros do vetor em (num)
            maiorNum = Math.max(maiorNum, listaVetor[num]);  //guarda o maior numero da lista em maiorNum
            menorNum = Math.min(menorNum, listaVetor[num]); //guarda o menor numero da lista em menorNum
        }

        //Printa maior e menor numero
        System.out.println("Maior número é: " + maiorNum);
        System.out.println("Menor número é: " + menorNum);
    }
}
