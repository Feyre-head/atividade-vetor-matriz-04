import java.util.Random;

public class atv2 {
    public static void main(String[] args) {
        // Preencher 15 numeros Random
        // for para pares e for para ímpares
        // Mostrar pares e ímpares

        Random random = new Random();

        int tamanho = 15;
        int[] numeros = new int[tamanho];

        System.out.println("Números Aleatórios Informados:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = random.nextInt(15);
            System.out.println((1 + i) + "- " + numeros[i]);

            System.out.println("Números Pares:");
            for (int num : numeros) {
                if (num % 2 == 0) {
                    System.out.println(num + "");
                }
            }

            System.out.println("Números Ímpares");
            for (int num : numeros) {
                if (num % 2 != 0) {
                    System.out.println(num + " ");
                }
            }

        }
    }
}
