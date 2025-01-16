package ExSistemaPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularSalario(){
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(10000.0f);
        diretor.setLucro(1000000.0f);
        diretor.setPorcentagemLucro(10.0f);
        assertEquals(110000.0f, diretor.calcularSalario());
    }

}