package Banco;

public class ContaCorrente extends Conta{
    private int taxaManutencao = 50;
    
    public ContaCorrente(int numeroAgencia, int numeroConta, double saldo, Cliente cliente) {
        super(numeroAgencia, numeroConta, saldo, cliente);
    }

    public double simularOperacao(int meses){
        double saldoFinal = getSaldo() - (taxaManutencao * meses);
        return saldoFinal;
    }
}
