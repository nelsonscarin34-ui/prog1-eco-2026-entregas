
import java.util.Scanner; 
import java.util.ArrayList;

class ItemPedido {
    String nome;
    int quantidade; 
    double precoUnitario;

    double precototal() {
        return quantidade * precoUnitario;
    }

}

public class ProgramaItemPedido {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in); 
        ArrayList<ItemPedido> itens = new ArrayList<>();

        int opcao;

        do {
            System.out.println("Opções: "); 
            System.out.println("1- cadastrar novo item.");
            System.out.println("2- listar itens"); 
            System.out.println("3- ver total do pedido");
            System.out.println("0- sair");
            opcao = entrada.nextInt();
            entrada.nextLine();
        
        if (opcao==1) {
            ItemPedido item = new ItemPedido(); 

            System.out.println("Nome do produto: "); 
            item.nome = entrada.nextLine(); 

            System.out.println("Quantidade: ");
            item.quantidade = entrada.nextInt(); 

            System.out.println("Preco unitário: "); 
            item.precoUnitario = entrada.nextDouble(); 


            itens.add(item); 
       
            } else if (opcao==2) {
                System.out.println("Itens pedidos: ");   
                    for (int i = 0; i< itens.size(); i++) { 
                        ItemPedido ite = itens.get(i); 
                        System.out.println((i+1)+ ". "+ ite.nome + "-quantidade: "+ ite.quantidade
                         + "-total: "+ ite.precototal());}
            } else if (opcao==3) { 
                double total = 0.0; 
                    for(ItemPedido ite : itens) {
                    total += ite.precototal(); 
                }
                System.out.println("Total do pedido: "+ total); 
                }
            } while (opcao!=0);

        entrada.close(); 
    
        }
    }