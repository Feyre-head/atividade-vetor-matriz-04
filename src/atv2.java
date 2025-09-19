import java.util.Random;

public class atv2 {
    public static void main(String[] args) {
        // Preencher 15 numeros com Random
        // Usar um for para pares e outro for para ímpares
        // Mostrar pares e ímpares

        Random random = new Random();

        //Opcional, variavel tamanho do vetor
        int tamanho = 15;

        //Cria vetor com tamanho
        int[] numeros = new int[tamanho];

        //Adiciona os números random do vetor e printa ele
        System.out.println("Números Aleatórios Informados:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = random.nextInt(15);  //Adiciona os números random ao vetor
            System.out.println((1 + i) + "- " + numeros[i]); //Print dos números

            //Verifica números pares
            System.out.println("Números Pares:");
            for (int num : numeros) {
                if (num % 2 == 0) {
                    System.out.println(num + "");
                }
            }

            //Verifica Números ímpares
            System.out.println("Números Ímpares");
            for (int num : numeros) {
                if (num % 2 != 0) {
                    System.out.println(num + " ");
                }
            }

        }
    }
}
