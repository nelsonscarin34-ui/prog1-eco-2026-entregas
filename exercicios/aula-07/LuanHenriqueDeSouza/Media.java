import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int n = teclado.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nota do aluno " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }
        double soma = 0.0;
        int baixo = 0, meio = 0, alto = 0;

        for (int i = 0; i < n; i++) {
            soma += notas[i];

            if (notas[i] < 6) {
                baixo++;
            } else if (notas[i] < 8) {
                meio++;
            } else {
                alto++;
            }
        }
        double media = soma / n;
        System.out.println("Média: " + media);
        System.out.println("Abaixo de 6: " + baixo);
        System.out.println("Entre 6 e 7.9: " + meio);
        System.out.println("Acima de 8: " + alto++);

        teclado.close();
    }
}