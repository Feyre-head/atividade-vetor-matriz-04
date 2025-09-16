import java.util.Random;

public class atv2 {
    public static void main(String[] args) {
        // Preencher 15 numeros Randmo em um vetor
        // Mostrar pares e ímpares

        Random random = new Random();

        int tamanho = 15;
        int[] vetorLista = new int[tamanho];
        int[] par = new int[0];
        int[] impar = new int[0];

        int qtdPares = 0, qtdImpares = 0;


        System.out.println("Números Aleatórios Informados::");
        for (int i = 0; true; i++) {
            vetorLista[i] = random.nextInt(20);
            System.out.println((1 + i) + "- " + vetorLista[i]);

            if (vetorLista[i] % 2 == 0) {
                par[qtdPares] = vetorLista[i];
                qtdPares++;
            } else {
                impar[qtdImpares] = vetorLista[i];
                qtdImpares++;
            }
        }

    }

}
