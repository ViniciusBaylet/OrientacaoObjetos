package ExRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretorEscola(){
        Professor diretor = new Professor(new Escolaridade("Mestrado"));
        Escola escola = new Escola(diretor);
        assertEquals("Mestrado", escola.getEscolaridadeDiretorEscola());
    }
    @Test
    void deveRetornarErroEscolaridadeDiretorEscola(){
        try {
            Escola escola = new Escola(null);
            escola.getEscolaridadeDiretorEscola();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Escola sem diretor.", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoEscola(){
        Professor diretor = new Professor(new Escolaridade("Mestrado"));
        Estado estado = new Estado("Minas Gerais");
        Escola escola = new Escola(diretor);
        escola.setEstado(estado);
        assertEquals("Minas Gerais", escola.getEstadoEscola());
    }
    @Test
    void deveRetornarErroEstadoEscola(){
        try{
            Professor diretor = new Professor(new Escolaridade("Mestrado"));
            Escola escola = new Escola(diretor);
            escola.getEstadoEscola();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Escola sem estado.", e.getMessage());
        }
    }

}