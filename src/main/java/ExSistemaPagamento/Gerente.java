package ExSistemaPagamento;

public class Gerente extends Funcionario{

    private float bonusAdicional;

    public float getBonusAdicional() {
        return bonusAdicional;
    }

    public void setBonusAdicional(float bonusAdicional) {
        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public float calcularSalario() {
        return this.getSalarioMensal() + this.bonusAdicional;
    }
}
