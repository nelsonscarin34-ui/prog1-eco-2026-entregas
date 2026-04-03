import java.util.ArrayList;
import java.util.Scanner;
public class AcademiaJavaFit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Atleta> estudantes = new ArrayList<>();
        System.out.print("Quantos estudantes serão cadastrados? ");
        int n = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < n; i++) {
            Atleta estudante = new Atleta();
            System.out.print("Nome do estudante " + (i + 1) + ": ");
            estudante.nome = entrada.nextLine();
            System.out.print("Frequencia da semanal: ");
            estudante.frequenciaSemanal = entrada.nextInt();
            entrada.nextLine();
            estudantes.add(estudante);
            System.out.println();
        }
        int fantasma = 0;
        int iniciante = 0;
        int focado = 0;
        int atleta = 0;
        for (Atleta e : estudantes) {
            int f = e.frequenciaSemanal;
            if (f == 0) {
                fantasma++;
            } else if (f <= 2) {
                iniciante++;
            } else if (f <= 4) {
                focado++;
            } else {
                atleta++;
            }
        }
        System.out.println(" Resumo da Academia");
        System.out.println("Plano fantasma: " + fantasma);
        System.out.println("Modo iniciante: " + iniciante);
        System.out.println("Modo focado: " + focado);
        System.out.println("Modo atleta: " + atleta);
    }
}