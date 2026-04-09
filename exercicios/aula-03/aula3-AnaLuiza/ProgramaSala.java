import java.util.Scanner; 

class Sala {
    String nome; 
    double temp; 
}

public class ProgramaSala {
    public static void main(String[] agrs) {

        Scanner entrada = new Scanner(System.in); 

        Sala sala = new Sala();

        System.out.println("Qual o nome da sala? "); 
        sala.nome = entrada.nextLine(); 

        System.out.println("Qual a temperatura da sala?"); 
        sala.temp = entrada.nextDouble(); 

        System.out.println("Sala: " + sala.nome + "está com " + sala.temp + "graus.");

        if (sala.temp<20){
            System.out.println("Sala fria!!");
        } else if (sala.temp <= 25) {
            System.out.println("Sala confortável"); 
            } else {
                System.out.println("Sala quente!!!"); 
            }
        entrada.close();
        }
}






