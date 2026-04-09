import java.util.Scanner;

public class ProgramaSala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.println("Digite o nome da sala: ");
        String nomeSala = scanner.nextLine();

        System.out.println("Digite a temperatura atual: ");
        double temp = scanner.nextDouble();

        // Criando sala
        Sala sala = new Sala();
        sala.nome = nomeSala;
        sala.temperatura = temp;

        // Verificando temperatura
        if (sala.temperatura < 20 ) {
            System.out.println("A sala " + sala.nome + " está Fria.");
        } else if (sala.temperatura <= 25) {
            System.out.println("A sala " + sala.nome + " está Confortável.");
        } else {
            System.out.println("A sala " + sala.nome + " está Quente.");
        }

        scanner.close();
    }
}
