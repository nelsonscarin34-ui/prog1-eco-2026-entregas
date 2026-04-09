import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEstudantes = 5;
        int fantasma = 0;
        int iniciante = 0;
        int focado = 0;
        int atleta = 0;

        for (int i = 0; i < totalEstudantes; i++) {
            System.out.println("Estudante: " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Frequência semanal: ");
            int freq = Integer.parseInt(scanner.nextLine());

            EstudanteAcademia estudante = new EstudanteAcademia(nome, freq);

            String classificacao = estudante.classificar();
            System.out.println("Classificação: " + classificacao);

            // Contadores
            if (classificacao.equals("Plano fantasma")) {
                fantasma++;
            } else if (classificacao.equals("Modo iniciante")) {
                iniciante++;
            } else if (classificacao.equals("Modo focado")) {
                focado++;
            } else {
                atleta++;
            }

            System.out.println();
        }

        // Resultado final
        System.out.println("Resumo: ");
        System.out.println("Plano fantasma: " + fantasma);
        System.out.println("Modo iniciante: " + iniciante);
        System.out.println("Modo focado: " + focado);
        System.out.println("Modo atleta: " + atleta);

        scanner.close();
    }
}
