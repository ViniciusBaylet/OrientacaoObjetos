package ExContasBancarias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    ContaPoupança contaPoupanca;

    @BeforeEach
    void setUp(){
        contaPoupanca = new ContaPoupança();
    }

    @Test
    void deveRetornarSaldoSuficiente(){
        contaPoupanca.setTitularConta("Joseli Martinez");
        contaPoupanca.setNumeroConta(469925);
        contaPoupanca.setSaldoConta(10000.0f);
        contaPoupanca.setDepositar(0.0f);
        contaPoupanca.setSacar(800.0f);
        contaPoupanca.setTaxaJurosFixa(0.00005f);
        assertEquals(9199.5f, contaPoupanca.novoSaldo());

    }

    @Test
    void deveRetornarErroSacarAlemDoQueTemNaConta(){
        try {
            contaPoupanca.setTitularConta("Joseli Martinez");
            contaPoupanca.setNumeroConta(469925);
            contaPoupanca.setSaldoConta(2.0f);
            contaPoupanca.setDepositar(0.0f);
            contaPoupanca.setSacar(500.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }

}