package ExRelampagoSurpresaPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno(){
        Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
        Estado estado = new Estado("Minas Gerais");
        aluno.setEstado(estado);
        assertEquals("Minas Gerais", aluno.EstadoNaturalidadeAluno());
    }

    @Test
    void deveRetornarErroEstadoNaturalidadeAluno(){
        try {
            Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
            aluno.EstadoNaturalidadeAluno();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Aluno sem estado de naturalidade", e.getMessage());
        }
    }

}