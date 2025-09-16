import java.util.Random;

public class atv2 {
    public static void main(String[] args) {
        // vetor 15 num aleatórios  Random
        // mostrar pares e ímpares


        Random random = new Random();

        int tamanho = 15;
        int[] numList = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            if (numList[i] < tamanho) {
                numList[i] = random.nextInt(tamanho);
                System.out.println("Números Aleatórios:");
                System.out.println((1 + i) + "- " + numList[i]);
            }

        }

        for (int i = 0; i < tamanho; i++) {
            if (numList[i] % 2 == 0) {
                System.out.println("Par: " + numList[i]);
            } else {
                System.out.println("Ímpar: " + numList[i]);
            }
        }

    }
}
