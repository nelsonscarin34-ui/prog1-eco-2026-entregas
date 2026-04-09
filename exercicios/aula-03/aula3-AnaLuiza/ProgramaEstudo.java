import java.util.Scanner; 

class Estudo {
    String materia; 
    int minutos; 
}

public class ProgramaEstudo {
    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        Estudo estudo = new Estudo(); 

        System.out.println("Qual matéria estudou hoje?");
        estudo.materia = entrada.nextLine(); 

        System.out.println("Por quanto tempo estudou? ");
        estudo.minutos = entrada.nextInt(); 

        System.out.println("Você estudou " + estudo.minutos 
            + " minutos de" + estudo.materia + "."); 

        if (estudo.minutos < 30) {
            System.out.print("Bom começo!");
        } else if (estudo.minutos<60) {
            System.out.println("Boa dedicação!"); 
        }  else {
            System.out.println("Modo foco!"); 
          }
       
    entrada.close(); 
        }
    }
