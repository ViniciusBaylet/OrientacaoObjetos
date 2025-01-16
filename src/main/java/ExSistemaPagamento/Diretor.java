package ExSistemaPagamento;

public class Diretor extends Funcionario{

    private float lucro;
    private float porcentagemLucro;

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public float getPorcentagemLucro() {
        return porcentagemLucro;
    }

    public void setPorcentagemLucro(float porcentagemLucro) {
        this.porcentagemLucro = porcentagemLucro;
    }

    @Override
    public float calcularSalario() {
        return this.getSalarioMensal() + (this.lucro * this.porcentagemLucro / 100);
    }
}
