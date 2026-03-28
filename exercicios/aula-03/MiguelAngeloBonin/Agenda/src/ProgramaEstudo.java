import java.util.Scanner;
public class ProgramaEstudo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Estudo estudo = new Estudo();

        System.out.print("Disciplina estudada: ");
        estudo.disciplina = entrada.nextLine();

        System.out.print("Quanto você estudou hoje? ");
        estudo.minutos = entrada.nextInt();

        System.out.println("Você estudou " + estudo.minutos
                + " minutos de " + estudo.disciplina + ".");

        if (estudo.minutos < 30) {
            System.out.println("Boa!");
        } else if (estudo.minutos < 60) {
            System.out.println("Continue Assim");
        } else {
            System.out.println("'-'");
        }

        entrada.close();
    }
}
            