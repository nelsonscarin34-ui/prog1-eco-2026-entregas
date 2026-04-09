import java.util.Scanner;

public class ProgramaCofrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedindo dados ao usuário
        System.out.println("Digite o nome do dono do cofrinho: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor que deseja guardar: ");
        double valor = scanner.nextDouble();

        //Criando objeto Cofrinho
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.nomeDono = nome;
        cofrinho.saldo = valor;

        //Exibir mensagem
        System.out.println("O cofrinho de " + cofrinho.nomeDono + " agora tem " + cofrinho.saldo + " reais.");

        scanner.close();
    }
    
}
