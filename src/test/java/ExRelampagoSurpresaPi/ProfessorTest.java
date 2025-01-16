package ExRelampagoSurpresaPi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {


    @Test
    void deveRetornarCidadeNascimentoProfessor(){
        Professor professor = new Professor(new Escolaridade("Doutorado"));
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("Minas Gerais"));
        professor.setCidade(cidade);
        assertEquals("Juiz de Fora", professor.cidadeNascimentoProfessor());
    }
    @Test
    void deveRetornarErroCidadeNascimentoProfessor(){
        try {
            Professor professor = new Professor(new Escolaridade("Doutorado"));
            professor.setCidade(null);
            professor.cidadeNascimentoProfessor();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Professor sem cidade de nascimento.", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoEnsinoContratacao(){
        Professor professor = new Professor(new Escolaridade("Doutorado"));
        Curso curso = new Curso(professor);
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Fundamental");
        curso.setTipoEnsino(tipoEnsino);
        assertEquals("Ensino Fundamental", curso.tipoEnsinoContratacao());
    }
    @Test
    void deveRetornarErroTipoEnsinoContratacao(){
        try{
            Professor professor = new Professor(new Escolaridade("Doutorado"));
            professor.setContratacao(null);
            professor.tipoEnsinoContratacao();
            fail();
            } catch (IllegalArgumentException e){
            assertEquals("Professor sem contratação.", e.getMessage());
        }
    }

    @Test
    void deveRetornarDiretorProfessor(){
      Professor diretor = new Professor(new Escolaridade("Mestrado"));
      Professor professor = new Professor(new Escolaridade("Doutorado"));
      Curso curso = new Curso(professor);
      Escola escola = new Escola(diretor);
      professor.setEscola(escola);
      professor.setContratacao(curso);
      diretor.setNome("Marco Antônio");
      assertEquals("Marco Antônio", professor.diretorProfessor());
    }
    @Test
    void deveRetornarErroDiretorProfessor(){
        try{
            Professor professor = new Professor(new Escolaridade("Doutorado"));
            professor.diretorProfessor();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Professor sem contratação.", e.getMessage());
        }
    }

    @Test
    void deveRetornarCoordenadorProfessor(){
        Professor coordenador = new Professor(new Escolaridade("Mestrado"));
        Professor professor = new Professor(new Escolaridade("Doutorado"));
        Curso curso = new Curso(professor);
        Escola escola = new Escola(coordenador);
        professor.setEscola(escola);
        professor.setContratacao(curso);
        coordenador.setNome("Marco Antônio");
        curso.setCoordenador(coordenador);
        assertEquals("Marco Antônio", professor.coordenadorProfessor());
    }
    @Test
    void deveRetornarErroCoordenadorProfessor(){
        try{
            Professor professor = new Professor(new Escolaridade("Doutorado"));
            professor.coordenadorProfessor();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Professor sem contratação.", e.getMessage());
        }
    }

}