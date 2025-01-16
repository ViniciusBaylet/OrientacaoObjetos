package ExContasBancarias;

public abstract class ContaBancaria {

    private int numeroConta;
    private float saldoConta;
    private String titularConta;

    private float depositar;
    private float sacar;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public float getDepositar(){
        return this.depositar;
    }
    public void setDepositar(float depositar) {
        this.depositar = depositar;
    }

    public float getSacar() {
        return sacar;
    }

    public void setSacar(float sacar) {
        if(sacar > this.saldoConta){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.sacar = sacar;
    }
    public float getSaldoConta(){
        return this.saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        if(saldoConta < 0){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldoConta = saldoConta;
        this.saldoConta =  this.saldoConta - this.calcularJuros();
    }
    public abstract float calcularJuros();

    public float novoSaldo(){
        return this.saldoConta + this.depositar - this.sacar - this.calcularJuros();
    }
}
