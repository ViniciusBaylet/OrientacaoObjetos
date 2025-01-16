package ExSistemaPedidos;

public class ProdutoLivro extends Produto{

    @Override
    public float calcularPrecoDesconto() {
        return this.getPrecoBase() - (this.getPrecoBase() * this.getDesconto() / 100.0f);
    }
}
