package Banco;

import java.util.ArrayList;

public class TesteOperacoes {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Conta> listaContas;

    public void criarConta(){
        /*
        a)
        Esse método deve receber as strings: nome, endereço e profissão 
        do cliente por meio do método Scanner. Em seguida, essas informações 
        devem instanciar um objeto do tipo Cliente e adicioná-lo no atributo 
        listaClientes.
        b) 
        Receba uma string: tipoConta por meio do método Scanner, que deve 
        informar qual o tipo de conta que o usuário deseja criar (poupança 
        ou corrente). Crie um objeto de acordo com a classe especificada.
        c) 
        Para preencher o objeto, receba dois números inteiros (número da 
        agência e conta) e um número flutuante: saldo, através do método 
        Scanner. Adicione o objeto no atributo listaContas.
        d) 
        Use o tratamento de exceções para evitar que o usuário informe números 
        de agência e conta como string, bem como para evitar que ele insira o 
        valor do saldo menor do que zero.
        */
    }

    public void realizarOperacoes(){
        /*
        a) 
        Esse método deve receber quatro parâmetros: o número da agência e conta 
        do cliente que deseja enviar o dinheiro, bem como o número da agência 
        e conta do cliente que vai receber o dinheiro.
        b) 
        Através desses parâmetros, realize duas buscas no atributo listaContas 
        para encontrar aconta do cliente que deseja enviar o dinheiro e a conta 
        do cliente que vai receber o dinheiro. Dica: utilize um for para 
        percorrer a lista e encontre o objeto através das funções do arraylist.
        c) 
        Use o método transferencia() existente na classe Conta para realizar 
        a movimentação do valor.
        */
    }

    public void exibirSaldo(){
        /*
        a) 
        Esse método deve receber como parâmetro os números de agência e conta 
        do usuário que terá o saldo consultado. Realize isso utilizando o 
        método Scanner.
        b) 
        Percorra a lista de contas, encontre a conta pesquisada e a salve em 
        um objeto.
        c) 
        Receba através do método Scanner a quantidade de meses que vão ser 
        simulados para demonstrar o saldo. Em seguida, utilizando polimorfismo, 
        execute o método exibirSaldo da classe Conta.
        */
    }

    public void apresentarMenu(){
        /*
        a) 
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
