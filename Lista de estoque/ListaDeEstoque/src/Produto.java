public class Produto {
    String nome;
    double preco;
    int quantidade = 0;
    
    

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double preco() {
        return preco;
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$ " + String.format("%.2f", total());
    }
    public int quantidade() {
        return quantidade;
    }
    public double total() {
        return preco * quantidade;
    }


}
