import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("numero de alunos: ");
        int n = entrada.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        int baixo = 0, meio = 0, cima = 0;

        for (int i = 0; i < n; i++) {
            soma += notas[i];

            if (notas[i] < 6) {
                baixo++;
            } 
            else if (notas[i] < 8) {
                meio++;
            } 
            else {
                cima++;
            }
        }
        double media = soma / n;

        System.out.println("Media: " + media);
        System.out.println("Teve " + baixo + " notas abaixo de 6");
        System.out.println("Teve " + meio + " notas entre 6 e 7.9");
        System.out.println("Teve " + cima + " notas acima de 8");
    }
}