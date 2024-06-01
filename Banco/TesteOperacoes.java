package Banco;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteOperacoes {
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Conta> listaContas = new ArrayList<Conta>();
    
    Scanner scan = new Scanner(System.in);
    
    public void criarConta() throws SaldoInvalidoException, TipoDaContaInvalidoException { // OK
        System.out.println("Informe o Nome, Endereço e Profissão do Cliente:");
        String nome = scan.nextLine(); 
        String endereco = scan.nextLine();
        String profissao = scan.nextLine();
        Cliente cliente = new Cliente(nome, endereco, profissao);
        this.listaClientes.add(cliente);
        try {
            System.out.println("Informe o tipo da Conta:");
            String tipoConta = scan.nextLine();
            System.out.print("Informe o número da Agência: ");
            int numAgencia = scan.nextInt();
            System.out.print("Informe o número da Conta: ");
            int numConta = scan.nextInt();
            System.out.print("Informe o Saldo Inicial da Conta: ");
            double saldoInicial = scan.nextDouble();

            if (saldoInicial < 0) {
                throw new SaldoInvalidoException("Saldo não pode ser negativo.");
            }
            if(tipoConta == "poupança"){
                ContaPoupanca conta = new ContaPoupanca(numAgencia, numConta, saldoInicial, cliente);
                listaContas.add(conta);
            } else if(tipoConta == "corrente"){
                ContaCorrente conta = new ContaCorrente(numAgencia, numConta, saldoInicial, cliente);
                listaContas.add(conta);
            } else {
                throw new TipoDaContaInvalidoException("Tipo de Conta inválido.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Informação inválida.");
        }
    }

    public void realizarOperacoes(int numAgenciaEnvia, int numContaEnvia, int numAgenciaRecebe, int numContaRecebe) throws SaldoInsuficienteException{
        for (Conta clienteEnvia : this.listaContas) {
            if (clienteEnvia.getNumeroConta() == numContaEnvia) {
                for (Conta clienteRecebe : this.listaContas) {
                    if (clienteRecebe.getNumeroConta() == numContaRecebe) {
                        System.out.print("Insira o valor do pix para doação ao pobre: ");
                        double valor = scan.nextDouble();
                        clienteEnvia.transferencia(clienteRecebe, valor);
                    }
                }
            }
        }
    }

    public void exibirSaldo(){ 
        /* a) 
        Esse método deve receber como parâmetro os números de agência e conta 
        do usuário que terá o saldo consultado. Realize isso utilizando o 
        método Scanner.
        */
        System.out.print("Informe o número da agência: ");
        int numAgencia = scan.nextInt();
        System.out.print("Informe o número da conta: ");
        int numConta = scan.nextInt();
        
        /* b) 
        Percorra a lista de contas, encontre a conta pesquisada e a salve em um objeto.
        */
        for (Conta conta : this.listaContas) {
            if(conta.getNumeroConta() == numConta){
                System.out.print("Informe a quantidade de meses: ");
                int meses = scan.nextInt();
                // simularSaldo
                conta.exibirSaldo();
            }
        }
        /* c) 
        Receba através do método Scanner a quantidade de meses que vão ser 
        simulados para demonstrar o saldo. Em seguida, utilizando polimorfismo, 
        execute o método exibirSaldo da classe Conta.
        */
    }

    public void apresentarMenu(){
        /* a) 
        Esse método deve apresentar três mensagens: 
            i) Criar conta; 
            ii) Realizar operações; 
            iii) Exibir saldo;
        b) 
        De acordo com o valor recebido pelo usuário através do método Scanner, 
        o método direciona para cada ação ao seu respectivo método.
        c) 
        Utilize um while para executar o método apresentarMenu até que o usuário 
        deseje parar as operações 
        (obs: ao final de cada operação essa pergunta pode ser feita ao usuário).
        */
    }
}
