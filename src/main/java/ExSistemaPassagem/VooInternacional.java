package ExSistemaPassagem;

public class VooInternacional extends Voo{

    private float taxaConversao;

    public float getTaxaConversao() {
        return taxaConversao;
    }

    public void setTaxaConversao(float taxaConversao) {
        this.taxaConversao = taxaConversao;
    }

    @Override
    public float taxaConversao() {
        return this.getTaxaConversao();
    }
}
