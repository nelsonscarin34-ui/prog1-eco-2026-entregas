public class programa {

    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "Cristiano Ronaldo";
        aluno.matricula = "0123456789";

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
    }
}