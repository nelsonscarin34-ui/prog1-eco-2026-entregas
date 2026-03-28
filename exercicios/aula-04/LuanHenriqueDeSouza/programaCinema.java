import java.util.Scanner;

public class programaCinema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double faturamento = 0.0;
        int qtdIngresso = 0;

        while (true) {
            System.out.println("Nome do filme (Enter para sair): ");
            String filme = teclado.nextLine();

            if (filme.isEmpty()) {
                break;
            }
            ingressoCinema ingresso = new ingressoCinema();
            ingresso.filme = filme;

            System.out.println("Horário: ");
            ingresso.horario = teclado.nextLine();

            System.out.println("Meia entrada?");
            String resposta = teclado.nextLine();

            if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("SS") || resposta.equalsIgnoreCase("sim")) {
                ingresso.meiaEntrada = true;
                ingresso.valor = 15.0;
            } else {
                ingresso.meiaEntrada = false;
                ingresso.valor = 30;
            }
            System.out.println("Ingresso registrado: " + ingresso.filme + "às " + ingresso.horario + "| valor: R$ "
                    + ingresso.valor);

            faturamento += ingresso.valor;
            qtdIngresso++;
        }
        System.out.println("Total de ingressos vendidos: " + qtdIngresso);
        System.out.println("Faturamento total: " + faturamento);
        teclado.close();
    }
}
