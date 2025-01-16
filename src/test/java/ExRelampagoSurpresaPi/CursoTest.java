package ExRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarEscolaridadeCoordenadorCurso(){
        Professor coordenador = new Professor(new Escolaridade("Doutorado"));
        Curso curso = new Curso(coordenador);
        assertEquals("Doutorado", curso.getEscolaridadeCoordenadorCurso());
    }
    @Test
    void deveRetornarErroEscolaridadeCoordenadorCurso(){
        try {
            Curso curso = new Curso(null);
            curso.getEscolaridadeCoordenadorCurso();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Curso sem coordenador.", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeCoordenadorCurso(){
        Professor coordenador = new Professor(new Escolaridade("Doutorado"));
        coordenador.setNome("Marco Antônio");
        Curso curso = new Curso(coordenador);
        assertEquals("Marco Antônio", curso.nomeCoordenadorCurso());
    }
    @Test
    void deveRetornarErroNomeCoordenadorCurso(){
        try{
            Curso curso = new Curso(null);
            curso.nomeCoordenadorCurso();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Curso sem coordenador", e.getMessage());
        }
    }

}