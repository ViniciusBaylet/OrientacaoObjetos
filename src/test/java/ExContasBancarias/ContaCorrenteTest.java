package ExContasBancarias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    ContaCorrente contaCorrente;

    @BeforeEach
    void setUp(){
        contaCorrente = new ContaCorrente();
    }

    @Test
    void deveRetornarSaldoInsuficiente(){
        try {
            contaCorrente.setTitularConta("José Carlos Almeida");
            contaCorrente.setNumeroConta(248895);
            contaCorrente.setSaldoConta(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }

    @Test
    void deveRetornarSaldoSuficiente(){
        contaCorrente.setTitularConta("José Carlos Almeida");
        contaCorrente.setNumeroConta(248895);
        contaCorrente.setSaldoConta(10000.0f);
        contaCorrente.setDepositar(500.0f);
        contaCorrente.setSacar(0.0f);
        contaCorrente.setTaxaManutencao(0.001f);
        assertEquals(10499.5f, contaCorrente.novoSaldo());
    }

}