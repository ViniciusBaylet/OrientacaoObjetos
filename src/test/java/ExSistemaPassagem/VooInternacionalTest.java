package ExSistemaPassagem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void deveRetornarPrecoViagem() {
        VooInternacional vooInternacional = new VooInternacional();
        vooInternacional.setOrigem("Rio de Janeiro");
        vooInternacional.setDestino("Madrid");
        vooInternacional.setData("27/12/2023");
        vooInternacional.setDistancia(10000.0f);
        vooInternacional.setFatorPreco(0.2f);
        vooInternacional.setTaxaConversao(5.0f);
        assertEquals(10000.0f, vooInternacional.calcularPrecoViagem());
    }
}
