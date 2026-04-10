import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <ItemPedido> itens = new  ArrayList<>();

        int opcao;
        do { 
            System.out.println("\n1 -- Adicionar item");
            System.out.println("2 -- Listar itens");
            System.out.println("3-- Valor total do pedido");
            System.out.println("0 -- Sair");
            System.out.println("Escolha: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if(opcao == 1){
                ItemPedido item = new ItemPedido();
                System.out.println("Nome do item: ");
                item.nome = entrada.nextLine();

                System.out.println("Quantidade: ");
                item.quantidade = entrada.nextInt();

                System.out.println("Preco por unidade: ");
                item.precoUnitario = entrada.nextDouble();
                entrada.nextLine();

                itens.add(item);
            }
            else if(opcao == 2){
                System.out.println("\n Itens do seu pedido");
                for (int i = 0; i < itens.size(); i++) {
                    ItemPedido it = itens.get(i);
                    System.out.println((i + 1) +". " + it.nome
                    + " - quantidade: " + it.quantidade + 
                    "- total: R$ " + it.calcularTotal());
                }
            }
            else if (opcao == 3){
                double total = 0.0;
                for (ItemPedido it : itens){
                    total += it.calcularTotal();
                }
                System.out.println("O total do pedido deu: R$ " + total);
            }
        } while (opcao != 0);
    }
}