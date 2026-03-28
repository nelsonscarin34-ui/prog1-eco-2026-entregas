import java.util.Scanner;

public class programaTermometro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        termometro sala = new termometro();

        System.out.println("Digite o nome da sala:");
        sala.sala = teclado.nextLine();

        System.out.println("Digite a temperatura:");
        sala.temperatura = teclado.nextInt();

        if (sala.temperatura < 20) {
            System.out.println("Frio");
        } else if (sala.temperatura <= 25) {
            System.out.println("Bom");

        } else {
            System.out.println("Quente");
        }
        teclado.close();

    }

}
