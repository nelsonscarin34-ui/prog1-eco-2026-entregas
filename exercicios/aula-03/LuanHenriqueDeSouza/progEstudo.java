import java.util.Scanner;

public class progEstudo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Estudo estudo = new Estudo();

        System.out.println("Nome da disciplina: ");
        estudo.disciplina = teclado.nextLine();
        System.out.println("Tempo de estudo: ");
        estudo.minutos = teclado.nextInt();

        if (estudo.minutos < 30) {
            System.out.println("Bom começo!");
        } else if (estudo.minutos >= 60) {
            System.out.println("Modo focado ativado!");
        } else {
            System.out.println("Boa dedicação!");
        }
        teclado.close();

    }
}
