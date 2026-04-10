
import java.util.Scanner; 


public class Mediaalunos {
    public static void main(String[]agrs) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Quantos alunos existem na sala? "); 
        int n = entrada.nextInt(); 
        
        double[] notas = new double[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Nota do aluno: " + (i+1) + ": ");
            notas[i] = entrada.nextDouble(); 
        }

        double soma = 0.0; 
        int abaixo6 = 0; int entre6e79 = 0; int acima8 = 0; 

        
            for(int i = 0; i < n; i++) {
            soma += notas[i]; 

            if (notas[i]<6) {
                abaixo6++; 
            } else if (notas[i]<8) {
                entre6e79++; 
                } else {
                    acima8++;
                }
             }
        
        double media = soma / n; 

        System.out.print("Média: " + media);
        System.out.print("Abaixo de 6: "+ abaixo6); 
        System.out.print("Entre: "+entre6e79); 
        System.out.print("Acima de 8: "+acima8);

        entrada.close(); 

    
    }
}

