package ExRelampagoSurpresaSemNumero;

public class Transacao {

    private String dataTransacao;
    private int quantidade;
    private Produto produto;

    public Transacao(String dataTransacao, Produto produto, int quantidade){
        this.dataTransacao = dataTransacao;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if(produto.getQuantidadeEstoque() <= 0){
            throw new IllegalArgumentException("Não há o produto no estoque.");
        }
        this.produto = produto;
    }
}
