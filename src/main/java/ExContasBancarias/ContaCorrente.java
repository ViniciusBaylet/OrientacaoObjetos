package ExContasBancarias;

public class ContaCorrente extends ContaBancaria{

    private float taxaManutencao;

    public float getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public float calcularJuros(){
       return this.getDepositar() * this.getTaxaManutencao();
    }

}
