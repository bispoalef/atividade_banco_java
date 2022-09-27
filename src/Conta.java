public abstract class Conta {

    private int agencia;
    private int numeroConta;
    private int saldoContaCorrente = 0;
    private int saldoContaPoupanca = 0;

    public Conta(int agencia, int numeroConta) {
        super();
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }



    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void depositoContaCorrente(int saldoContaCorrente) {
        this.saldoContaCorrente += saldoContaCorrente;
    }
    public void saqueContaCorrente(int saldoContaCorrente) {
        this.saldoContaCorrente -= saldoContaCorrente;
    }

    public int getSaldoContaPoupanca() {
        return saldoContaPoupanca;
    }

    public void depositoContaPoupanca(int saldoContaPoupanca) {
        this.saldoContaPoupanca += saldoContaPoupanca;
    }
    public void saqueContaPoupanca(int saldoContaPoupanca) {
        this.saldoContaPoupanca -= saldoContaPoupanca;
    }

}
