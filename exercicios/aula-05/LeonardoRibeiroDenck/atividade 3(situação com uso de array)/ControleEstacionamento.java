import java.util.Scanner;
public class ControleEstacionamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        VagasEstacionamento[] vagas = new VagasEstacionamento[10];
        for (int i = 0; i < vagas.length; i++) {
            vagas[i] = new VagasEstacionamento();
            vagas[i].ocupada = false;
        }
        System.out.println(" Sistema de Estacionamento Fixo ");
        while (true) {
            System.out.print("\nDigite o numero da vaga (0-9) para ocupar ou -1 para sair: ");
            int numVaga = entrada.nextInt();
            entrada.nextLine();
            if (numVaga == -1) break;
            if (numVaga >= 0 && numVaga < vagas.length) {
                if (vagas[numVaga].ocupada) {
                    System.out.println("ERRO: Vaga " + numVaga + " já está ocupada pelo carro: " + vagas[numVaga].placaVeiculo);
                } else {
                    System.out.print("Digite a placa do veiculo: ");
                    vagas[numVaga].placaVeiculo = entrada.nextLine();
                    vagas[numVaga].ocupada = true;
                    System.out.println("Vaga " + numVaga + " ocupada com sucesso!");
                }
            } else {
                System.out.println("Vaga inválida!");
            }
        }
        int ocupadas = 0;
        System.out.println("\n=== Mapa de Ocupacao ===");
        for (int i = 0; i < vagas.length; i++) {
            String status = vagas[i].ocupada ? "[OCUPADA: " + vagas[i].placaVeiculo + "]" : "[LIVRE]";
            System.out.println("Vaga " + i + ": " + status);
            if (vagas[i].ocupada) ocupadas++;
        }
        System.out.println("\nTotal de vagas: " + vagas.length);
        System.out.println("Vagas disponíveis: " + (vagas.length - ocupadas));
    }
}
