import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {

        // Armazenar entrada 10 num vetor usando for
        // for / if / usar Math min e máx para mostrar valor maior e menor do array

        Scanner sc = new Scanner(System.in);
        int[] listaVetor = new int[10];

        System.out.println("Vamos Armazenar 10 números em um Array e mostrar o Menor e o Maior valor");

        for (int i = 0; i < listaVetor.length; i++) {
            System.out.println("Informe o [" + (i + 1) + "] Número: ");
            listaVetor[i] = sc.nextInt();
        }

        System.out.println("Números informados:");
        for (int num : listaVetor) {
            System.out.println(num);
        }
        System.out.println("===================");

        int maiorNum = listaVetor[0];
        int menorNum = listaVetor[0];

        for (int num : listaVetor) {
            maiorNum = Math.max(maiorNum, listaVetor[num]);
            menorNum = Math.min(menorNum, listaVetor[num]);
        }

        System.out.println("Maior número é: " + maiorNum);
        System.out.println("Menor número é: " + menorNum);
    }
}
