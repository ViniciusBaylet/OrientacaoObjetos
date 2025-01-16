package ExGerenciamentoProdutos;

public class ProdutoRoupa extends Produto{

    private float desconto;

    @Override
    public float getDesconto() {
        return this.desconto;
    }

    public void setDesconto(float desconto) {
        if(desconto < 0){
            throw new IllegalArgumentException("Desconto inválido");
        }
        this.desconto = desconto;
    }
}
