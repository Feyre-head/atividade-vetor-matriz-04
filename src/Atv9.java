import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        //Ranking Notas
        //5 alunos
        //2 notas

        //Guardar notas de 5 alunos (2 notas) e calcular média.


        // 1. Vetor `String[] alunos = new String[5]`
        // 2. Matriz `double[5][2] para notas
        // 3. Usar `for` para preencher
        // 4. Usar `for` para calcular e mostrar médias

        Scanner sc = new Scanner(System.in);

        int linha = 1;
        int coluna = 2;
        String[] aluno = new String[linha];
        double[][] notas = new double[linha][coluna];

        for (int a = 0; a < linha; a++) {
            System.out.println("Informe o nome do Aluno: ");
            aluno[a] = sc.next();

            for (int c = 0; c < coluna; c++) {  //coluna
                System.out.println("Informe a " + (1 + c) + " nota:");
                notas[a][c] = sc.nextInt();
            }

            System.out.println();
        }

        for (int a = 0; a < aluno.length; a++) {
            System.out.println("Aluno:" + aluno[a]);
            System.out.println("Primeira Nota: " + notas[a][0]);
            System.out.println("Segunda nota: " + notas[a][1]);
        }


    }

    public static double media(double a, double b) {
        return (a + b) / 2;
    }
}
