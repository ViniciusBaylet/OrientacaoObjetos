package ExFormaGeometrica;

public class Retangulo extends FormaGeometrica {

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}
