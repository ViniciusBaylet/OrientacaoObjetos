package ExSistemaPedidos;

public class ProdutoRoupa extends Produto{

    public float calcularPrecoDesconto() {
        return this.getPrecoBase() - (this.getPrecoBase() * this.getDesconto() / 100.0f);
    }
}
