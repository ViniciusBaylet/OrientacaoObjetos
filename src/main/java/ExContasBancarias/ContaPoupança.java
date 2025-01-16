package ExContasBancarias;

public class ContaPoupança extends ContaBancaria{

    private float taxaJurosFixa;

    public float getTaxaJurosFixa() {
        return taxaJurosFixa;
    }

    public void setTaxaJurosFixa(float taxaJurosFixa) {
        this.taxaJurosFixa = taxaJurosFixa;
    }

    @Override
    public float calcularJuros() {
        return this.getSaldoConta() * this.taxaJurosFixa;
    }
}
