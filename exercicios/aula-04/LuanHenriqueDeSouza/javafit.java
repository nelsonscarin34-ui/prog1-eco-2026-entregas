import java.util.Scanner;

public class javafit {
    public static void main(String[] args) {
        int n, i, fantasma = 0, iniciante = 0, focado = 0, atleta = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Número de alunos: ");
        n = teclado.nextInt();
        teclado.nextLine();

        EstudanteAcademia[] alunos = new EstudanteAcademia[n];
        for (i = 0; i < n; i++) {
            alunos[i] = new EstudanteAcademia();
            System.out.println(" Nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = teclado.nextLine();

            System.out.println("Frequência semanal: ");
            alunos[i].frequenciaSemanal = teclado.nextInt();
            teclado.nextLine();

            int f = alunos[i].frequenciaSemanal;

            if (f == 0) {
                fantasma++;
                System.out.println("Plano fantasma");
            } else if (f <= 2) {
                iniciante++;
                System.out.println("Modo focado");
            } else if (f <= 4) {
                focado++;
                System.out.println("Modo focado");
            } else {
                atleta++;
                System.out.println("MOdo atleta");
            }
            System.out.println();

        }
        System.out.println("Dados:");
        System.out.println("Plano fantasma: " + fantasma);
        System.out.println("Modo iniciante: " + iniciante);
        System.out.println("Modo focado: " + focado);
        System.out.println("Modo atleta: " + atleta);
        teclado.close();

    }
}
