package ExSistemaPagamento;

public class FuncionarioComum extends Funcionario{

    @Override
    public float calcularSalario() {
        return this.getSalarioMensal();
    }
}
