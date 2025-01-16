package ExRelampagoSurpresa9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridadePresidente(){
        Grupo grupo = new Grupo();
        Escolaridade escolaridade = new Escolaridade();
        Funcionario presidente = new Funcionario();
        escolaridade.setNivel("Pós-graduação");
        presidente.setEscolaridade(escolaridade);
        grupo.setPresidente(presidente);
        assertEquals("Pós-graduação", grupo.getEscolaridadePresidente());
    }
    @Test
    void deveRetornarErroEscolaridadePresidente(){
        try {
            Grupo grupo = new Grupo();
            grupo.setPresidente(null);
            grupo.getEscolaridadePresidente();
            fail();
        } catch (NullPointerException e){
            assertEquals("Grupo sem presidente.", e.getMessage());
        }
    }

}