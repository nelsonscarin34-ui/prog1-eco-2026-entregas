import java.util.Scanner;

public class progCamiseta {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Camiseta camiseta = new Camiseta();

        System.out.println("Digite o tamanho: ");
        camiseta.tamanho = teclado.nextLine();
        System.out.println("Digite a cor:");
        camiseta.cor = teclado.nextLine();
        System.out.println("Digite o preço:");
        camiseta.preco = teclado.nextInt();
        System.out.println("Dados: " + camiseta.cor + " " + camiseta.tamanho + " " + camiseta.preco);
        if (camiseta.preco > 100) {
            System.out.println("Camiseta premium");
        } else {
            System.out.println("Camiseta padrão");
        }

    }
}
