import java.util.Scanner;

public class programaCofrinho {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        cofrinho cofre = new cofrinho();

        System.out.println("Nome do dono: ");
        cofre.nomeDono = teclado.nextLine();

        System.out.println("Quanto você quer guardar?");
        cofre.saldo = teclado.nextDouble();

        System.out.println("O cofrinho de: " + cofre.nomeDono + " tem R$ " + cofre.saldo);
        teclado.close();
    }
}
