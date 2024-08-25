public class Conta {
    private double saldo;
    private String tipo;

    // Construtor com saldo inicial e tipo padrão como "Corrente"
    public Conta(double saldo) {
        this.saldo = saldo;
        this.tipo = "Corrente";
    }

    // Construtor com saldo inicial e tipo definido
    public Conta(double saldo, String tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }

    // Metodo para deposito
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false; // Valor invalido
        }
        if (tipo.equals("Corrente") && valor > 1000) {
            return false; // Valor excede o limite para contas Corrente
        }
        saldo += valor;
        return true;
    }

    // Metodo para saque
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false; // Valor invalido ou saldo insuficiente
        }
        saldo -= valor;
        return true;
    }

    // Metodo para transferencia
    public boolean transferir(double valor, Conta contaDestino) {
        if (!tipo.equals("Corrente") || valor <= 0 || valor > saldo) {
            return false; // Transferencia nao permitida: apenas contas Corrente podem transferir ou saldo insuficiente
        }
        // Verifica se a conta de destino e uma Conta Poupanca
        if (contaDestino.getTipo().equals("Poupanca")) {
            saldo -= valor;
            contaDestino.depositar(valor);
            return true;
        }
        return false; // Transferencia nao permitida para contas diferentes de Poupanca
    }

    // Metodo para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Metodo para obter o tipo da conta
    public String getTipo() {
        return tipo;
    }
}
