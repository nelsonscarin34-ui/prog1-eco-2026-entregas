import java.util.Scanner;

class Cofrinho {
    String nomeDono;
    double saldo;
}

public class Progcofrinho {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cofrinho cofre = new Cofrinho();

        System.out.print("Nome do dono: ");
        cofre.nomeDono = entrada.nextLine();

        System.out.print("Quanto deseja guardar? ");
        double valor = entrada.nextDouble();

        cofre.saldo = valor;

        System.out.println("O cofrinho de " + cofre.nomeDono
                + " agora tem R$ " + cofre.saldo + " reais.");

        entrada.close();
    }
}
