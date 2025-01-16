package ExSistemaPassagem;

public abstract class Voo {

    private String origem;
    private String destino;
    private String data;

    private float distancia;

    private float fatorPreco;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getFatorPreco() {
        return fatorPreco;
    }

    public void setFatorPreco(float fatorPreco) {
        this.fatorPreco = fatorPreco;
    }

    public abstract float taxaConversao();

    public float calcularPrecoViagem()
    {
        return this.getDistancia() * this.getFatorPreco() * this.taxaConversao();
    }
}
