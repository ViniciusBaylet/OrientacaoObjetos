package ExSistemaPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularSalario(){
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setSalarioMensal(2000.0f);
        assertEquals(2000.0f, funcionario.calcularSalario());
    }

}