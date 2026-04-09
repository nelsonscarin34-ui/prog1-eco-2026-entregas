class Estudante {
    String nome; 
    int anonascimento; 
    int idade;
    String endereco;
    String matricula; 

}

public class ProgramaEstudante {
    public static void main (String[] args) {

    Estudante estudante1 = new Estudante();

    estudante1.nome = "Maria Clara Lemos"; 
    estudante1.anonascimento = 2013;
    estudante1.idade = 13;
    estudante1.matricula = "150313";

    System.out.println("Nome do estudante: "+estudante1.nome);
    System.out.println("Ano de nascimento do estudante: "+estudante1.anonascimento);
    System.out.println("Idade do estudante: "+estudante1.idade);
    System.out.println("Matrícula do estudante: "+estudante1.matricula); 
    
    }
}