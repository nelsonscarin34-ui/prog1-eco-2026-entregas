package EstruturasBasicas;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int n=1;
		//Scanner instanciador, para escolha da atividade.
		Scanner instanciador = new Scanner(System.in);
		System.out.print("digite o numero referente a atividade que você quer verificar");
		n=instanciador.nextInt();
		//Switch que utiliza a variavel N definida pelo scanner instanciador.
		switch (n) {
		case 1:
			//Scanner entrada e Objeto Cofre sendo criados.
			Cofrinho Cofre = new Cofrinho();
			Scanner entrada = new Scanner(System.in);
			//Coleta de Informações
			System.out.print("Digite o nome do dono do cofre:");
			Cofre.nome = entrada.nextLine();
			System.out.print("\nQuanto dinheiro você gostaria de depositar? :");
			Cofre.saldo = entrada.nextDouble();
			//Demonstração de objetos coletados
			System.out.print("\nO cofrinho de "+ Cofre.nome +" agora tem " + Cofre.saldo + " reais");
			break;
		case 2:
			Sala Sala = new Sala();
			//Scanner entrada2 e Objeto Sala sendo criados
			Scanner entrada2 = new Scanner(System.in);
			Sala.nome = entrada2.nextLine();
			Sala.temperatura = entrada2.nextInt();
			//if e else gerando respostas condicionais.
			if (Sala.temperatura >25) {
				System.out.print("\nA sala está quente.");
			}else if (Sala.temperatura >=20 && Sala.temperatura<=25) {
				System.out.print("\nA sala está confortável.");
			}else if (Sala.temperatura <20) {
				System.out.print("\nA sala está fria.");
			}
			break;
		case 3:
			//scanner entrada 3 e objeto estudando sendo criado.
			Estudo Estudando = new Estudo();
			Scanner entrada3 = new Scanner(System.in);
			//Coleta de informações.
			System.out.print("qual disciplina?");
			Estudando.disciplina = entrada3.nextLine();
			System.out.print("quantos minutos estudou?");
			Estudando.minutos = entrada3.nextInt();
			if (Estudando.minutos >=60) {
				System.out.print("\nModo focado ativado!");
			}else if (Estudando.minutos>=30) {
				System.out.print("\nBoa dedicação!");
			}else if(Estudando.minutos>=1) {
				System.out.print("\nBom começo");
			}else {
				System.out.print("\nhuh?");
			}
		
			break;
		default:
            System.out.println("\nde 1 a 4 lá na variavel N que fica no main, belesa? então safe");
		}
		
		instanciador.close();
	}

}
