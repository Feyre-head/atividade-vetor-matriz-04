import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {

        //Criar vetor [10]
        //Entrada 10 numeros
        //for menor número / maior número

        Scanner sc = new Scanner(System.in);

        int[] numberList = new int[10];

        System.out.println("Informe 10 números para descobrir qual é maior e qual é menor");

        for (int i = 0; i < numberList.length; i++) {
            System.out.println("Informe o [" + (i + 1) + "] Número: ");
            numberList[i] = sc.nextInt();
        }

        int maiorNum = 0;
        int menorNum = 0;


        for (int c = 0; c < numberList.length; c++) {
            if (numberList[c] > maiorNum) {
                maiorNum = numberList[c];
            }
            if (numberList[c] < menorNum) {
                menorNum = numberList[c];
            }
        }

        System.out.println("maior número é: " + maiorNum);
        System.out.println("Menor num: " + menorNum);


    }
}


// menor =