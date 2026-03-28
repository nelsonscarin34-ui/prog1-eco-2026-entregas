public class programaTurma_estudante {
    public static void main(String[] args) {
        estudante[] turma = new estudante[5];

        turma[0] = new estudante();
        turma[0].nome = "Ana";
        turma[0].nota = 8.5;

        turma[1] = new estudante();
        turma[1].nome = "Bruno";
        turma[1].nota = 7.0;

        turma[2] = new estudante();
        turma[2].nome = "Carla";
        turma[2].nota = 9.2;

        turma[3] = new estudante();
        turma[3].nome = "Luana";
        turma[3].nota = 6.8;

        turma[4] = new estudante();
        turma[4].nome = "Tinoco";
        turma[4].nota = 9.8;

        for (int i = 0; i < turma.length; i++) {
            System.out.println("Estudante: " + turma[i].nome + " | Nota: " + turma[i].nota);
        }
    }
}
