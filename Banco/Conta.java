package Banco;

public class Conta {
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public void deposito(double dinheiro){
        // recebe uma quantia de dinheiro e salva no saldo da conta
    }

    public void saque(double dinheiro){
        // remove uma quantia de dinheiro e retira do saldo da conta
    }

    public void transferencia(){
        /*
        recebe como parâmetro um objeto do tipo conta e
        transfere uma quantia do saldo da conta atual para 
        o saldo da conta que foi recebida como parâmetro. 
        Garanta que exista saldo suficiente para isso.
        */
    }

    public void exibirSaldo(){
        /* 
        apresenta uma mensagem de texto informando 
        o nome do usuário e o quanto ele possui na conta
        */
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
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
