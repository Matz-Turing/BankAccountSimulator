import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criacao das contas com saldo inicial
        Conta contaCorrente = new Conta(1500.00, "Corrente");
        Conta contaPoupanca = new Conta(500.00, "Poupanca");

        // Informacoes iniciais
        System.out.println("Contas bancarias criadas:");
        System.out.println("Conta Corrente: Saldo inicial de R$ " + contaCorrente.getSaldo());
        System.out.println("Conta Poupanca: Saldo inicial de R$ " + contaPoupanca.getSaldo());

        // Tentativa de deposito na conta corrente
        System.out.println("\nTentando depositar R$ 1.500,00 na Conta Corrente:");
        boolean resultado = contaCorrente.depositar(1500.00);
        System.out.println(resultado ? "Deposito bem-sucedido." : "Deposito falhou. Valor excede o limite permitido para contas Corrente.");
        System.out.println("Saldo atual da Conta Corrente: R$ " + contaCorrente.getSaldo());

        // Tentativa de deposito na conta poupanca
        System.out.println("\nTentando depositar R$ 1.500,00 na Conta Poupanca:");
        resultado = contaPoupanca.depositar(1500.00);
        System.out.println(resultado ? "Deposito bem-sucedido." : "Deposito falhou. Valor deve ser positivo.");
        System.out.println("Saldo atual da Conta Poupanca: R$ " + contaPoupanca.getSaldo());

        // Deposito adicional na conta poupanca
        System.out.println("\nDepositando R$ 98,52 na Conta Poupanca:");
        resultado = contaPoupanca.depositar(98.52);
        System.out.println(resultado ? "Deposito bem-sucedido." : "Deposito falhou. Valor deve ser positivo.");
        System.out.println("Saldo atual da Conta Poupanca: R$ " + contaPoupanca.getSaldo());

        // Tentativa de saque da conta poupanca
        System.out.println("\nTentando sacar R$ 100,00 da Conta Poupanca:");
        resultado = contaPoupanca.sacar(100.00);
        System.out.println(resultado ? "Saque bem-sucedido." : "Saque falhou. Saldo insuficiente ou valor invalido.");
        System.out.println("Saldo atual da Conta Poupanca: R$ " + contaPoupanca.getSaldo());

        // Tentativa de transferencia da conta corrente para a poupanca
        System.out.println("\nTentando transferir R$ 1.800,00 da Conta Corrente para a Conta Poupanca:");
        resultado = contaCorrente.transferir(1800.00, contaPoupanca);
        System.out.println(resultado ? "Transferencia bem-sucedida." : "Transferencia falhou. Apenas contas Corrente podem transferir e saldo insuficiente.");
        System.out.println("Saldo atual da Conta Corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo atual da Conta Poupanca: R$ " + contaPoupanca.getSaldo());

        // Tentativa de transferencia da conta poupanca para a corrente
        System.out.println("\nTentando transferir R$ 700,00 da Conta Poupanca para a Conta Corrente:");
        resultado = contaPoupanca.transferir(700.00, contaCorrente);
        System.out.println(resultado ? "Transferencia bem-sucedida." : "Transferencia falhou. Apenas contas Corrente podem transferir ou saldo insuficiente na Conta Poupanca.");
        System.out.println("Saldo atual da Conta Poupanca: R$ " + contaPoupanca.getSaldo());
        System.out.println("Saldo atual da Conta Corrente: R$ " + contaCorrente.getSaldo());

        // Saque da conta poupanca
        System.out.println("\nTentando sacar R$ 1.000,00 da Conta Poupanca:");
        resultado = contaPoupanca.sacar(1000.00);
        System.out.println(resultado ? "Saque bem-sucedido." : "Saque falhou. Saldo insuficiente ou valor invalido.");
        System.out.println("Saldo atual da Conta Poupanca: R$ " + contaPoupanca.getSaldo());

        // Saque da conta corrente
        System.out.println("\nTentando sacar R$ 1.000,00 da Conta Corrente:");
        resultado = contaCorrente.sacar(1000.00);
        System.out.println(resultado ? "Saque bem-sucedido." : "Saque falhou. Saldo insuficiente ou valor invalido.");
        System.out.println("Saldo atual da Conta Corrente: R$ " + contaCorrente.getSaldo());

        // Fechar o scanner
        scanner.close();
    }
}
