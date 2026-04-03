import java.util.Scanner;

public class CofrinhoDigital{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();
        System.out.print("Digite o nome do dono: ");
        cofre.nomeDono = entrada.nextLine();

        System.out.print("Quanto voce quer depositar: ");
        double valor = entrada.nextDouble();
        cofre.saldo = valor;

        System.out.println("O cofrinho de " + cofre.nomeDono 
            + " tem " + cofre.saldo + " reais"
        );
        entrada.close();
    }
}