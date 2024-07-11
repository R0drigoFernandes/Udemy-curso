
public class ContaPoupanca {
    private String nome;
    private int conta;
    private double saldo;
    public ContaPoupanca() {
        System.out.println("Conta Poupança");
        
    }
    public void criarConta(String nome, int conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    
}
