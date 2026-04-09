class IngressoCinema {
    String filme;
    String horario;
    boolean meiaEntrada;

    public IngressoCinema(String filme, String horario, boolean meiaEntrada) {
        this.filme = filme;
        this.horario = horario;
        this.meiaEntrada = meiaEntrada;
    }

    public double calcularValor() {
        if (meiaEntrada) {
            return 15.0;
        } else {
            return 30.0;
        }
    }
}
