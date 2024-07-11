public class ContaCorrente {
    private String nome;
    private int conta;
    private double saldo;
  

  public ContaCorrente() {
    System.out.println("Conta Corrente");
  }
  public void criarConta(String nome, int conta, double saldo) {
      this.nome = nome;
      this.conta = conta;
      this.saldo = saldo;
  }
  public void depositar(double valor) {
    this.saldo += valor;
}

public void retirar(double valor) {
    this.saldo -= valor - 5;
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
