package ExRelampagoSurpresa9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarNomeEstadoCidade(){
        Pais pais = new Pais();
        pais.setNome("Brasil");
        Estado estado = new Estado();
        estado.setNome("Minas Gerais");
        Cidade cidade = new Cidade();
        cidade.setEstado(estado);
        assertEquals("Minas Gerais", cidade.getNomeEstado());
    }
    @Test
    void deveRetornarErroNomeEstadoCidade() {
        try {
            Estado estado = new Estado();
            estado.setNome(null);
            Cidade cidade = new Cidade();
            cidade.getNomeEstado();
            fail();
        } catch (NullPointerException e){
            assertEquals("Cidade sem estado.", e.getMessage());
        }
    }
}