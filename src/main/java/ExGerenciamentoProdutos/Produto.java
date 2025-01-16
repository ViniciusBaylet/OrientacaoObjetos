package ExGerenciamentoProdutos;

public abstract class Produto {

    private String nome;
    private float precoUnitario;
    private int quantidadeEstoque;
    private int quantidadeVendida;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0 || quantidadeEstoque < this.quantidadeVendida){
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeEstoque = this.quantidadeEstoque - this.quantidadeVendida;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public abstract float getDesconto();

    public float calcularPreco(){
        return this.precoUnitario * this.quantidadeVendida - (this.precoUnitario * this.getDesconto() / 100.0f);
    }
}
