package ExSistemaPassagem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveRetornarPrecoViagem(){
        VooDomestico vooDomestico = new VooDomestico();
        vooDomestico.setOrigem("Rio de Janeiro");
        vooDomestico.setDestino("São Paulo");
        vooDomestico.setData("22/11/2023");
        vooDomestico.setDistancia(200.0f);
        vooDomestico.setFatorPreco(0.4f);
        assertEquals(80.0f, vooDomestico.calcularPrecoViagem());
    }

}