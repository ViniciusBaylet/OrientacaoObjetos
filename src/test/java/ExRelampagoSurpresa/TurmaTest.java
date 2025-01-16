package ExRelampagoSurpresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    Turma turma;
    Aluno aluno1;
    Aluno aluno2;
    Professor professor;

    @BeforeEach
    void setUp(){
       turma = new Turma(new Disciplina("Matemática"));
       aluno1 = new Aluno("Vinicius");
       aluno2 = new Aluno("Marcos");
       professor = new Professor("Marco Antônio");
    }

    @Test
    void deveCriarDisciplina(){
        assertEquals("Matemática", turma.nomeDisciplina());
    }
    @Test
    void deveRetornarErroCriarDisciplina(){
        try{
            turma = new Turma(null);
            //fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Disciplina inválida", e.getMessage());
        }
    }
    @Test
    void deveMatricularAluno(){
      turma.matricular(aluno1);
      assertEquals(1, turma.getNumeroAlunos());
      assertTrue(turma.verificarMatricula(aluno1));
    }
    @Test
    void deveDesmatricularAluno() {
        turma.matricular(aluno1);
        turma.desmatricular(aluno1);
        assertEquals(0, turma.getNumeroAlunos());
        assertFalse(turma.verificarMatricula(aluno1));
    }

    @Test
    void deveMatricularDoisAlunos() {
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        assertEquals(2, turma.getNumeroAlunos());
    }
    @Test
    void deveDesmatricularDoisAlunos() {
        turma.desmatricular(aluno1);
        turma.desmatricular(aluno2);
        assertEquals(0, turma.getNumeroAlunos());
    }
    @Test
    void deveVerificarMatricula(){
        turma.matricular(aluno1);
        turma.verificarMatricula(aluno1);
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Vinicius"));
        assertEquals(lista, turma.listaAlunos());
        turma.desmatricular(aluno1);
     }
    @Test
    void deveRetornarNumeroAlunos(){
        turma.matricular(aluno1);
        assertEquals(1, turma.getNumeroAlunos());
        turma.desmatricular(aluno1);
    }
    @Test
    void deveRetornarNomeAluno(){
        turma.setAluno(aluno1);
        assertEquals("Vinicius", turma.nomeAluno());
    }
    @Test
    void deveRetornarTurmaSemAluno(){
        turma.setAluno(null);
        assertEquals("Turma sem aluno.",turma.nomeAluno());
    }
    @Test
    void deveRetornarNomeDisciplina(){
        assertEquals("Matemática", turma.nomeDisciplina());
    }
    @Test
    void deveRetornarTurmaSemDisciplina() {
        try {
            turma.setDisciplina(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Turma sem disciplina", e.getMessage());

        }
    }
    @Test
    void deveRetornarNomeProfessor(){
       turma.setProfessor(professor);
       assertEquals("Marco Antônio", turma.nomeProfessor());
    }
    @Test
    void deveRetornarTurmaSemProfessor(){
        assertEquals("Turma sem professor.", turma.nomeProfessor());
    }
    @Test
    void deveRetornarListaAlunos(){
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Vinicius", "Marcos"));
        assertEquals(lista, turma.listaAlunos());
    }
    @Test
    void deveRetornarListaAlunosVazia(){
        turma.matricular(aluno1);
        turma.desmatricular(aluno1);
        ArrayList<String> lista = new ArrayList<>();
        assertEquals(lista,turma.listaAlunos());
    }

}