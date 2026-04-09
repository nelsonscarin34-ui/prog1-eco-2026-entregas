import java.util.ArrayList;
import java.util.Scanner;

public class CinemaJavaFlixArrayList {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<IngressoCinema> ingressos = new ArrayList<>();

        while (true) {
            System.out.print("Nome do filme (Enter para sair): ");
            String filme = entrada.nextLine();

            if (filme.isEmpty()) {
                break; // encerra o cadastro
            }

            IngressoCinema ingresso = new IngressoCinema();
            ingresso.filme = filme;

            System.out.print("Horário da sessão (20:00): ");
            ingresso.horario = entrada.nextLine();

            System.out.print("Meia-entrada? (S/N): ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                ingresso.meiaEntrada = true;
                ingresso.valorPago = 15.0;
            } else {
                ingresso.meiaEntrada = false;
                ingresso.valorPago = 30.0;
            }

            ingressos.add(ingresso);

            System.out.println("Ingresso registrado: " + ingresso.filme 
                + " às " + ingresso.horario
                + " | valor: R$ " + ingresso.valorPago + "\n");
        }

        double totalFaturado = 0.0;
        System.out.println("=== Ingressos vendidos ===");
        for (int i = 0; i < ingressos.size(); i++) {
            IngressoCinema ing = ingressos.get(i);
            System.out.println((i + 1) + ". " + ing.filme
                + " (" + ing.horario + ") - R$ " + ing.valorPago);
            totalFaturado += ing.valorPago;
        }

        System.out.println("Total de ingressos vendidos: " + ingressos.size());
        System.out.println("Faturamento total: R$ " + totalFaturado);

        entrada.close();
    }
}
