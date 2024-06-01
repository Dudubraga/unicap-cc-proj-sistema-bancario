package Banco;

public class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.05;
    
    public ContaPoupanca(int numeroAgencia, int numeroConta, double saldo, Cliente cliente) {
        super(numeroAgencia, numeroConta, saldo, cliente);
    }

    public double simularOperacao(int meses){
        /*
        esse método deve receber como parâmetro um número inteiro, representando 
        a quantidade de meses desejados para simular o rendimento da conta poupança. 
        O método deve retornar o rendimento do saldo atual de acordo com a 
        taxaRendimento da conta. O rendimento ocorre a cada mês a partir da seguinte 
        fórmula: saldo + (taxaRendimento * saldo)
        */
        double rendimento = 0;
        for(int i = 0; i < meses; i++){
            rendimento += getSaldo() + (this.taxaRendimento * getSaldo());
        }
        // ??? so isso ???
        return rendimento;
    }
}
