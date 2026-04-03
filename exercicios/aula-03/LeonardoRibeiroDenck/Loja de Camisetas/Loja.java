import java.util.Scanner;

public class Loja{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Camiseta camiseta = new Camiseta();
        System.out.print("Qual o tamanho da camiseta: ");
        camiseta.tamanho = entrada.nextLine();
        System.out.print("Qual a cor: ");
        camiseta.cor = entrada.nextLine();
        System.out.print("Qual o preco: ");
        camiseta.preco = entrada.nextDouble();
        System.out.println("A camiseta do tamanho " + camiseta.tamanho
            + " da cor " + camiseta.cor + " tem o preco " + camiseta.preco + " R$");
        if(camiseta.preco > 100){
            System.out.println("Camiseta premium");
        }else{
            System.out.println("Camiseta padrao");
        }
    }
}