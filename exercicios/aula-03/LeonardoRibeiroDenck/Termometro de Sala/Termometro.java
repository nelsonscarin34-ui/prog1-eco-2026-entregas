
import java.util.Scanner;

public class Termometro{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Sala sala = new Sala();

        System.out.print("Nome da sala: ");
        sala.nome = entrada.nextLine();

        System.out.print("Qual a temperatura atual: ");
        sala.temperatura = entrada.nextDouble();
        System.out.println("A sala " + sala.nome 
            + " tem a temperatura de: " + sala.temperatura + " ºC");
        if(sala.temperatura < 20){
            System.out.println("Esta fria");

        } else if(sala.temperatura <=25 ){
            System.out.println("Esta confortavel");
        }else{
            System.out.println("esta quente");
        }
    }
}