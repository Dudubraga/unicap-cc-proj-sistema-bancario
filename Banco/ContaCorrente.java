package Banco;

public class ContaCorrente extends Conta{
    private int taxaManutencao = 50;
    
    public ContaCorrente(int numeroAgencia, int numeroConta, double saldo, Cliente cliente) {
        super(numeroAgencia, numeroConta, saldo, cliente);
    }

    public double simularOperacao(int meses){
        /*
        esse método deve receber como parâmetro um número inteiro, 
        representando a quantidade de meses desejados para simular o 
        valor de custo das operações da conta corrente. O método retorna 
        o saldo final após o decrescimento da taxaManutencao mensal
        */
        double saldoFinal = getSaldo() - (taxaManutencao * meses);
        // ??? so isso ???
        return saldoFinal;
    }
}
