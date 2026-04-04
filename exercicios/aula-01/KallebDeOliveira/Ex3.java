package entrega1;

 class Estudante {
    String nome;
    String matricula;
}

 class ProgramaEstudante {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.nome = "Ana Silva";
        estudante1.matricula = "2026001";

        System.out.println("Nome do estudante: " + estudante1.nome);
        System.out.println("Matrícula: " + estudante1.matricula);
    }
}
