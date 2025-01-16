package ExRelampagoSurpresaSemNumero;

public class Compra extends Transacao{

    private float precoUnitario;
    private Produto produto;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int quantidadeCompra, float precoUnitario){
        super(dataCompra, produto, quantidadeCompra);
        this.precoUnitario = precoUnitario;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public Produto getProduto() {
        return produto;
    }

    @Override
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean comprar(Produto produto, int quantidadeComprada){
        if(produto.verificarEstoqueExcedente(quantidadeComprada)){
            //exibir mensagem
            return false;
        }
        produto.creditarEstoque(quantidadeComprada);
        return true;
    }
}
