class Conta {
    Cliente titular = new Cliente();
    double saldo;

    void sacar(double valor) {
        this.saldo -= valor;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    void transferirPara(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);

        this.extrato();
        destino.extrato();
    }

    void extrato() {
        System.out.println("Dono:" + this.titular.nome + "\nSaldo: " + this.saldo);
    }
}
