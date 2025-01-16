package ExRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarDescricaoEscolaridade(){
        Pessoa pessoa = new Pessoa(new Escolaridade("Doutorado"));
        assertEquals("Doutorado", pessoa.descricaoEscolaridade());
    }
    @Test
    void deveRetornarErroDescricaoEscolaridade(){
        try{
           Pessoa pessoa = new Pessoa(null);
           pessoa.descricaoEscolaridade();
           fail();
        } catch (IllegalArgumentException e){
            assertEquals("Pessoa sem escolaridade.", e.getMessage());
        }
    }

}