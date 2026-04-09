import java.util.Scanner;

class Temperatura {
    String nome;
    double temperatura;
}

public class TemperaturaP {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Temperatura sala = new Temperatura();

        System.out.print("Nome da sala: ");
        sala.nome = entrada.nextLine();

        System.out.print("Temperatura atual da sala: ");
        sala.temperatura = entrada.nextDouble();

        System.out.println("Sala: " + sala.nome
                + " | Temperatura: " + sala.temperatura + " ºC");

        if (sala.temperatura < 20) {
            System.out.println("Situação: Fria");
        } else if (sala.temperatura <= 25) {
            System.out.println("Situação: Confortável");
        } else {
            System.out.println("Situação: Quente");
        }

        entrada.close();
    }
}
            