class EstudanteAcademia {
    String nome;
    int frequenciaSemanal;

    // Construtor

public EstudanteAcademia(String nome, int frequenciaSemanal) {
    this.nome = nome;
    this.frequenciaSemanal = frequenciaSemanal;
    }

    // Método para classificar
    public String classificar() {
        if (frequenciaSemanal == 0) {
            return "Plano fantasma";
        } else if (frequenciaSemanal <= 2) {
            return "Modo iniciante";
        } else if (frequenciaSemanal <= 4) {
            return "Modo focado";
        } else {
            return "Modo atleta!";
        }
    }
}
