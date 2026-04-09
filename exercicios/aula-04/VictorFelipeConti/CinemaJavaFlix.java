import java.util.Scanner;

public class CinemaJavaFlix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIngressos = 0;
        double faturamentoTotal = 0.0;

        while (true) {
            System.out.println("Nome do filme (Enter para sair): ");
            String filme = scanner.nextLine();

            // condição de parada
            if (filme.isEmpty()) {
                break;
            }

            System.out.println("Horário (ex: 19:30): ");
            String horario = scanner.nextLine();

            System.out.println("Meia-entrada? (S/N): ");
            String resposta = scanner.nextLine();

            boolean meia = resposta.equalsIgnoreCase("S");

            IngressoCinema ingresso = new IngressoCinema(filme, horario, meia);

            totalIngressos++;
            faturamentoTotal += ingresso.calcularValor();

            System.out.println("Ingresso registrado! Valor: R$ " + ingresso.calcularValor());
            System.out.println();
        }

        System.out.println("Resumo: ");
        System.out.println("Total de ingressos vendidos: " + totalIngressos);
        System.out.printf("Faturamento total: R$ %.2f\n", faturamentoTotal);

        scanner.close();
    }
}
