package Banco;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteOperacoes {
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Conta> listaContas = new ArrayList<Conta>();
    
    Scanner scan = new Scanner(System.in);
    
    public void criarConta() throws SaldoInvalidoException, TipoDaContaInvalidoException {
        System.out.println("Informe o Nome, Endereço e Profissão do Cliente:");
        String nome = scan.nextLine(); 
        String endereco = scan.nextLine();
        scan.nextLine();
        String profissao = scan.nextLine();
        Cliente cliente = new Cliente(nome, endereco, profissao);
        this.listaClientes.add(cliente);
        try {
            System.out.println("Informe o tipo da Conta\nP - Poupança\nC - Corrente");
            String tipoConta = scan.nextLine();
            System.out.println("Informe o número da Agência: ");
            int numAgencia = scan.nextInt();
            System.out.println("Informe o número da Conta: ");
            int numConta = scan.nextInt();
            System.out.println("Informe o Saldo Inicial da Conta: ");
            double saldoInicial = scan.nextDouble();

            if (saldoInicial < 0) {
                throw new SaldoInvalidoException("Saldo não pode ser negativo.");
            }

            if(tipoConta.equals("P")){
                ContaPoupanca conta = new ContaPoupanca(numAgencia, numConta, saldoInicial, cliente);
                listaContas.add(conta);
            } else if(tipoConta.equals("C")){
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
        System.out.print("Informe o número da agência: ");
        int numAgencia = scan.nextInt();
        System.out.print("Informe o número da conta: ");
        int numConta = scan.nextInt();
        for (Conta conta : this.listaContas) {
            if(conta.getNumeroConta() == numConta && conta.getNumeroAgencia() == numAgencia){
                System.out.print("Informe a quantidade de meses para simulação: ");
                int meses = scan.nextInt();
                conta.exibirSaldo();
                double simulacao = conta.simularOperacao(meses);
                System.out.println("Simulação de saldo após " + meses +  " meses: R$" + simulacao);
            }
        }
    }

    public void apresentarMenu() throws SaldoInsuficienteException, SaldoInvalidoException, TipoDaContaInvalidoException {
        int op;
        do {
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Realizar Operações");
            System.out.println("3 - Exibir Saldo");
            System.out.println("0 - Encerrar Programa");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    System.out.println("Informe o número da agência que deseja realizar a transferência: ");
                    int numAgenciaEnvia = scan.nextInt();
                    System.out.println("Informe o número da conta que deseja realizar a transferência: ");
                    int numContaEnvia = scan.nextInt();
                    System.out.println("Informe o número da agência de destino: ");
                    int numAgenciaRecebe = scan.nextInt();
                    System.out.println("Informe o número da conta de destino: ");
                    int numContaRecebe = scan.nextInt();
                    realizarOperacoes(numAgenciaEnvia, numContaEnvia, numAgenciaRecebe, numContaRecebe);
                    break;
                case 3:
                    exibirSaldo();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 0);
    }
}
