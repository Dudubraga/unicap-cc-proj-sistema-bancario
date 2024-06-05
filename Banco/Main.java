package Banco;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException, SaldoInvalidoException, TipoDaContaInvalidoException {
        TesteOperacoes teste = new TesteOperacoes();
        teste.apresentarMenu();
    }
}
