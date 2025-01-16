package ExRelampagoSurpresaSemNumero;

public class Venda extends Transacao{

    Produto produto;

    public Venda(String dataVenda, Cliente cliente, Produto produto, int quantidadeVendida){
        super(dataVenda, produto, quantidadeVendida);
    }

    @Override
    public Produto getProduto() {
        return produto;
    }

    @Override
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean vender(Produto produto, int quantidadeVendida){
        if(produto.verificarEstoqueInsuficiente(quantidadeVendida)){
            //exibir mensagem
            return false;
        }
        produto.debitarEstoque(quantidadeVendida);
        //exibir na tela o valor da venda
        produto.verificarEstoqueBaixo();
        //exibir mensagem
        return true;
    }
}
