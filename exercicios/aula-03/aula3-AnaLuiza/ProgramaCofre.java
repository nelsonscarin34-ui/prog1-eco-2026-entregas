import java.util.Scanner;

class Cofre {
    String nome; 
    double saldo;
}

public class ProgramaCofre {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in); 

    Cofre cofrinho = new Cofre(); 

    System.out.println("Nome do dono do cofre: "); 
    cofrinho.nome = entrada.nextLine();

    System.out.println("Quanto deseja guardar agora?");
    double valor = entrada.nextDouble();

    cofrinho.saldo = valor; 

    System.out.println("O cofre de " + cofrinho.nome 
        + " agora tem R$ " + cofrinho.saldo + " reais"); 

    entrada.close(); 
    
    }
}
