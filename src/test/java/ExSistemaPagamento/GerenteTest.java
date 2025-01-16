package ExSistemaPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveCalcularSalario(){
        Gerente gerente = new Gerente();
        gerente.setSalarioMensal(6000.0f);
        gerente.setBonusAdicional(500.0f);
        assertEquals(6500.0f, gerente.calcularSalario());
    }

}