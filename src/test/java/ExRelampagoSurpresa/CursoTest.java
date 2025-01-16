package ExRelampagoSurpresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    Curso curso;
    Professor coordenador;
    Professor professor;

    @BeforeEach
    void setUp() {
        curso = new Curso("Ciência da Computação");
        coordenador = new Professor("José Chaves");
        professor = new Professor("Marco Antônio");
    }

    @Test
    void deveRetornarNomeCoordenador() {
        curso.setCoordenador(coordenador);
        assertEquals("José Chaves", curso.getNomeCoordenador());
    }

    @Test
    void deveRetornarCursoSemCoordenador() {
        try {
            curso.setCoordenador(null);
           // fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem coordenador", e.getMessage());
        }

    }
    @Test
    void deveRetornarNomesProfessores(){
     Professor professor2 = new Professor("Cláudio Castro");
     Turma turma1 = new Turma(new Disciplina("Matemática"));
     Turma turma2 = new Turma(new Disciplina("Matemática"));
     turma1.setProfessor(professor);
     turma2.setProfessor(professor2);
     curso.adicionarTurma(turma1);
     curso.adicionarTurma(turma2);
     ArrayList<String> listaProfessores = new ArrayList<>(Arrays.asList("Marco Antônio","Cláudio Castro"));
     assertEquals(listaProfessores, curso.nomesProfessores());
    }
    @Test
    void deveRetornarListaVaziaNomesProfessores(){
        ArrayList<String> lista = new ArrayList<String>();
        assertEquals(lista, curso.nomesProfessores());
    }
    @Test
    void deveRetornarNomeAlunosTurma(){
        Turma turma1 = new Turma(new Disciplina("Matemática"));
        Turma turma2 = new Turma(new Disciplina("Matemática"));
        Aluno aluno1 = new Aluno("Vinicius");
        Aluno aluno2 = new Aluno("Wesley");
        Aluno aluno3 = new Aluno("Marcos");
        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        turma2.matricular(aluno3);
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);
        ArrayList<String> listaAlunos = new ArrayList<>(Arrays.asList("Vinicius","Wesley","Marcos"));
        assertEquals(listaAlunos, curso.nomesAlunosTurma());
    }
    @Test
    void deveRetornarNomeAlunosCurso(){
        Aluno aluno1 = new Aluno("Vinicius");
        Aluno aluno2 = new Aluno("Wesley");
        Aluno aluno3 = new Aluno("Marcos");
        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);
        ArrayList<String> listaAlunos = new ArrayList<>(Arrays.asList("Vinicius", "Wesley", "Marcos"));
        assertEquals(listaAlunos, curso.nomesAlunosCurso());
    }
    @Test
    void deveRetornarListaDisciplinaTurmaCurso(){
       Turma turma = new Turma(new Disciplina("Matemática"));
       curso.adicionarTurma(turma);
       ArrayList<String> listaDisciplinas = new ArrayList<>(Arrays.asList("Matemática"));
       assertEquals(listaDisciplinas,curso.nomeDisciplinasTurmaCurso());
    }
    @Test
    void deveRetornarListaDisciplinasTurmaCurso(){
        Turma turma1 = new Turma(new Disciplina("Matemática"));
        Turma turma2 = new Turma(new Disciplina("Física"));
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);
        ArrayList<String> listaDisciplinas = new ArrayList<>(Arrays.asList("Matemática","Física"));
        assertEquals(listaDisciplinas,curso.nomeDisciplinasTurmaCurso());
    }
    @Test
    void deveRetornarVerdadeiroVerificarMatricula(){
        Aluno aluno = new Aluno("Vinicius");
        curso.adicionarAluno(aluno);
        assertEquals(true,curso.verificarMatricula(aluno));
    }
    @Test
    void deveRetornarFalsoVerificarMatricula(){
        Aluno aluno = new Aluno("Vinicius");
        assertEquals(false,curso.verificarMatricula(aluno));
    }
    @Test
    void deveRetornarVerdadeiroVerificarTurma(){
        Turma turma = new Turma(new Disciplina("Mtemática"));
        curso.adicionarTurma(turma);
        assertEquals(true, curso.verificarTurma(turma));
    }
    @Test
    void deveRetornarFalsoVerificarTurma(){
        Turma turma = new Turma(new Disciplina("Matemática"));
        assertEquals(false,curso.verificarTurma(turma));
    }
    @Test
    void deveRetornarTurmaExcluida(){
        Turma turma = new Turma(new Disciplina("Matemática"));
        curso.adicionarTurma(turma);
        assertEquals(true,curso.excluirTurma(turma));
    }
    @Test
    void deveRetornarTurmaNaoExcluida(){
        Turma turma = new Turma(new Disciplina("Matemática"));
        assertEquals(false,curso.excluirTurma(turma));
    }
    @Test
    void deveDesmatricularAluno(){
        Aluno aluno = new Aluno("Vinicius");
        curso.adicionarAluno(aluno);
        assertEquals(true,curso.desmatricular(aluno));
    }
    @Test
    void NaoDeveDesmatricularAluno(){
        Aluno aluno = new Aluno("Vinicius");
        assertEquals(false,curso.desmatricular(aluno));
    }


}