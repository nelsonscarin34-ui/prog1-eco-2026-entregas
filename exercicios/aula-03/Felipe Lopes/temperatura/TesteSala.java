package termometro;
import java.util.Scanner;
public class TesteSala {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Sala sala1 = new Sala();
		
		System.out.println( "Nome da sala" );
		sala1.nome = entrada.nextLine();
		
		System.out.println("Digite a temperatura da sala");
		sala1.temperatura = entrada.nextDouble();
		
		if (sala1.temperatura <20) {
			System.out.println("a sala" + sala1.nome + "está Fria");
		} 
		else if (sala1.temperatura <=25) {
			System.out.println("a sala" + sala1.nome + "está confortável");	
		}
		else {
			System.out.println("a sala" + sala1.nome + "está quente");
		}
		
		

	}

}
