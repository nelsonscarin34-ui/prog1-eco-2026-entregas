import java.util.Scanner;

public class ProgramaEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite a disciplina: ");
        String disc = scanner.nextLine();

        System.out.println("Quantos minutos você estudou hoje? ");
        int tempo = scanner.nextInt();

        // Criando estudo
        Estudo estudo = new Estudo();
        estudo.disciplina = disc;
        estudo.minutos = tempo;

        // Verificação
        if (estudo.minutos < 30) {
            System.out.println("Bom começo!");
        } else if (estudo.minutos < 60) {
            System.out.println("Boa dedicação!");
        } else {
            System.out.println("Modo focado ativado!");
        }

        scanner.close();
    }
}
