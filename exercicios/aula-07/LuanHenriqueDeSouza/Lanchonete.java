import java.util.Scanner;
import java.util.ArrayList;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ItemPedido> itens = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar item");
            System.out.println("\n2 - Listar intens");
            System.out.println("\n3 - Ver total");
            System.out.println("\n0 - Sair");
            System.out.println("\nEscolha: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                ItemPedido item = new ItemPedido();

                System.out.println("Quantidade: ");
                item.quantidade = entrada.nextInt();
                System.out.print("Preço unitário: ");
                item.precoUnitario = entrada.nextDouble();
                entrada.nextLine();

                itens.add(item);
            } else if (opcao == 2) {
                System.out.println("\nItens do pedido: ");
                for (int i = 0; i < itens.size(); i++) {
                    ItemPedido it = itens.get(i);
                    System.out.println((i + 1) + it.nome
                            + " - qtd: " + it.quantidade
                            + " - total: R$ " + it.calcularTotal());
                }
            } else if (opcao == 3) {
                double total = 0.0;
                for (ItemPedido it : itens) {
                    total += it.calcularTotal();
                }
                System.out.println("Total do pedido: R$ " + total);
            }

        } while (opcao != 0);

        entrada.close();
    }
}
