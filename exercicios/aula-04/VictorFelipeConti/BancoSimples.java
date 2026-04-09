import java.util.Scanner;
public class BancoSimples {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();
        System.out.println("Nome do titular: ");
        conta.titular = entrada.nextLine();
        conta.saldo = 0.0;

        int opcao;
        do {
            System.out.println("\n=== MENU BANCO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir resumo");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Valor para depósito: ");
                double valor = entrada.nextDouble();
                conta.depositar(valor);
                } else if ( opcao == 2) {
                    System.out.println("Valor para saque: ");
                    double valor = entrada.nextDouble();
                    conta.sacar(valor);
                } else if ( opcao == 3) {
                    conta.exibirResumo();
                } else if (opcao != 0) {
                    System.out.println("Opção inválida.");
                }
            } while (opcao != 0);

            System.out.println("Encerrando... Obrigado por usar nosso banco!");
            entrada.close();
        }
    }