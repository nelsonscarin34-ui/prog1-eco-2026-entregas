package entrega4;

import java.util.ArrayList;
import java.util.Scanner;

class EstudanteAcademia {
    String nome;
    int frequenciaSemanal;
}

 class AcademiaJavaFit {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos estudantes serão cadastrados? ");
        int n = entrada.nextInt();
        entrada.nextLine();

        // Criando a lista dinâmica de estudantes
        ArrayList<EstudanteAcademia> estudantes = new ArrayList<>();

        int fantasma = 0, iniciante = 0, focado = 0, atleta = 0;

        for (int i = 0; i < n; i++) {
            // Criamos um novo objeto estudante
            EstudanteAcademia novoEstudante = new EstudanteAcademia();

            System.out.print("Nome do estudante " + (i + 1) + ": ");
            novoEstudante.nome = entrada.nextLine();

            System.out.print("Frequência semanal (dias por semana): ");
            novoEstudante.frequenciaSemanal = entrada.nextInt();
            entrada.nextLine();

            // Adicionamos o estudante na nossa lista
            estudantes.add(novoEstudante);

            int f = novoEstudante.frequenciaSemanal;

            if (f == 0) {
                fantasma++;
                System.out.println("Plano fantasma.");
            } else if (f <= 2) {
                iniciante++;
                System.out.println("Modo iniciante.");
            } else if (f <= 4) {
                focado++;
                System.out.println("Modo focado.");
            } else {
                atleta++;
                System.out.println("Modo atleta!");
            }
            System.out.println();
        }

        System.out.println("=== Resumo da Academia ===");
        System.out.println("Plano fantasma: " + fantasma);
        System.out.println("Modo iniciante: " + iniciante);
        System.out.println("Modo focado: " + focado);
        System.out.println("Modo atleta!: " + atleta);

        entrada.close();
    }
}