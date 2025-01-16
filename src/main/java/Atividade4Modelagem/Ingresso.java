package Atividade4Modelagem;

public class Ingresso {

    private int numeroIngresso;
    private int assentoIngresso;
    private String tipoIngresso;
    private float valorIngresso;
    private String dataHoraComprada;



    public Ingresso(int numeroIngresso, int assentoIngresso, String tipoIngresso, float valorIngresso, String dataHoraCompra) {
        this.numeroIngresso = numeroIngresso;
        this.assentoIngresso = assentoIngresso;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.dataHoraComprada = dataHoraCompra;
    }
    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public int getAssentoIngresso() {
        return assentoIngresso;
    }

    public void setAssentoIngresso(int assentoIngresso) {
        this.assentoIngresso = assentoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String getDataHoraComprada() {
        return dataHoraComprada;
    }

    public void setDataHoraComprada(String dataHoraComprada) {
        this.dataHoraComprada = dataHoraComprada;
    }

    public void imprimirIngresso(){
        System.out.println("Número do ingresso: " + this.getNumeroIngresso());
        System.out.println("Assento do ingresso: " + this.getAssentoIngresso());
        System.out.println("Tipo do ingresso: " + this.getTipoIngresso());
        System.out.println("Valor do ingresso: " + this.getValorIngresso());
        System.out.println("Data e hora da compra do ingresso: " + this.getDataHoraComprada());
    }
}
