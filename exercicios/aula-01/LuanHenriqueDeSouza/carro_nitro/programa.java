import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int execucao;
        jogador carro1 = new jogador();
        System.out.println("Digite o nome do seu carro: ");
        carro1.modelo = teclado.nextLine();
        System.out.println("Velocidade atual: " + carro1.velocidade);
        System.out.println("Digite 1 para ativar o nitrou o 0 para finalizar o programa.");
        execucao = teclado.nextInt();

        while (execucao == 1) {
            carro1.usarNitro();
            execucao = teclado.nextInt();

        }
        teclado.close();

    }
}