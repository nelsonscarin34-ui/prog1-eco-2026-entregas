import java.util.Scanner; 

class Estudodia {
    String dia;
    int minutos;

}

public class ProgramaEstudodia {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     Estudodia[] semana = new Estudodia[7]; 

     String[] nomesdias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"}; 

     int total = 0; 
     Estudodia maisestudo = null; 

     for (int i = 0; i< semana.length; i++) {
        semana[i] = new Estudodia(); 
        semana[i].dia = nomesdias[i]; 
       
    System.out.println("Minutos estudados na "+nomesdias[i]+ ": "); 
    
    semana[i].minutos = entrada.nextInt();
    total += semana[i].minutos; 
    
    if (maisestudo == null || semana[i].minutos > maisestudo.minutos) {
        maisestudo = semana[i];
    }
}

    System.out.println("Total de minutos estudados na semana: "+ total); 
    System.out.println("Dia com mais estudos: "+ maisestudo.dia + "(" + maisestudo.minutos + "minutos)"); 

    entrada.close(); 
    }
}
