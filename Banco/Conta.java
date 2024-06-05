package Banco;

public class Conta {
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroAgencia, int numeroConta, double saldo, Cliente cliente) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void deposito(double dinheiro){
        this.saldo += dinheiro;
    }

    public void saque(double dinheiro){
        this.saldo -= dinheiro;
    }

    public void transferencia(Conta conta, double dinheiro) throws SaldoInsuficienteException{
        if(this.saldo >= dinheiro){
            this.saque(dinheiro);
            conta.deposito(dinheiro);
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente. Transferência não realizada.");
        }
    }
    
    public void exibirSaldo(){
        System.out.println("Nome do Usuário: " + this.cliente.getNome());
        System.out.println("Saldo na Conta: R$" + this.saldo);
    }

    public double simularOperacao(int meses) { return 0.0; }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
