import java.util.Scanner;

class Aluno {
    String nome;
    double nota;
}

public class ControleNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = entrada.nextLine();

            System.out.print("Digite a nota de " + alunos[i].nome + ": ");
            alunos[i].nota = entrada.nextDouble();
            entrada.nextLine();
        }

        double soma = 0;
        double maiorNota = -1;
        String melhorAluno = "";

        System.out.println("\n=== Resultados ===");

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].nome + " - Nota: " + alunos[i].nota);

            soma += alunos[i].nota;

            if (alunos[i].nota > maiorNota) {
                maiorNota = alunos[i].nota;
                melhorAluno = alunos[i].nome;
            }
        }

        double media = soma / alunos.length;

        System.out.println("\nMédia da turma: " + media);
        System.out.println("Melhor aluno: " + melhorAluno + " com nota " + maiorNota);
    }
}
