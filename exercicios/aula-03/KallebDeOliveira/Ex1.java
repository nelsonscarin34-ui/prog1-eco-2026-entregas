package entrega2;

import java.util.Scanner;
 class Cofrinho {
String nomeDono;
double saldo;
}
class ProgramaCofrinho{
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Cofrinho cofre = new Cofrinho();
	System.out.println("Qual o nome do dono do cofre? ");
	cofre.nomeDono =entrada.nextLine();
	System.out.println("Qual o valor que deseja guardar? ");
	cofre.saldo = entrada.nextDouble();
	entrada.nextLine();
	System.out.println("O cofrinho de "+cofre.nomeDono+" possui no total R$"+cofre.saldo);
	entrada.close();
}
	
}
