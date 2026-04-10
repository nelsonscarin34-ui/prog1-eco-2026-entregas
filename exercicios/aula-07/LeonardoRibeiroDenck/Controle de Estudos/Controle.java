import java.util.Scanner;
public class Controle{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EstudoDia[] semana = new EstudoDia[7];

        String[] nomeDias ={
            "Segunda", "Teca", "Quarta", "Quinta", "Sexta", "Sabado", "domingo"
        };
        int total = 0;
        EstudoDia maisEstudo = null;

        for (int i = 0; i < semana.length; i++) {
            semana[i] = new EstudoDia();
            semana[i].dia = nomeDias[i];

            System.out.println("Tempo de estudo (em minutos) dia " + nomeDias[i] + ": ");
            semana[i].minutos = entrada.nextInt();

            total += semana[i].minutos; 
            
            if(maisEstudo == null || semana[i].minutos > maisEstudo.minutos){
                maisEstudo = semana[i];
            }
        }
        System.out.println("Total de minutos na semana: " + total);
        System.out.println("Dia com mais estudo: " + maisEstudo.dia + "(" + maisEstudo.minutos + " minutos)");
    }
}