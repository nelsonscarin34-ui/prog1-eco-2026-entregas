class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void exibirResumo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }
}
