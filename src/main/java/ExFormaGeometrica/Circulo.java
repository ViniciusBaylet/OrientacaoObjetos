package ExFormaGeometrica;

public class Circulo extends FormaGeometrica {

    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return this.raio * this.raio * 3.1416f;
    }

    @Override
    public float calcularPerimetro() {
        return 2.0f * 3.1416f * this.raio;
    }
}
