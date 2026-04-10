import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        while (true) { 
            System.out.println("Titulo do livro ('end' para encerrar): ");
            String titulo = entrada.nextLine();

            if(titulo.equalsIgnoreCase("end")){
                break;
            }
            System.out.println("Autor: ");
            String autor = entrada.nextLine();

            System.out.println("numero de paginas: ");
            int paginas = entrada.nextInt();
            entrada.nextLine();

            livros.add(new Livro(titulo,autor,paginas));
        }
        System.out.println("Livros com mais de 300 paginas:");
        for (Livro l : livros){
            if(l.paginas > 300){
                l.resumir();
            }
        }
    }
}