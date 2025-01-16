package ExRelampagoSurpresa9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarPaisAlocacao(){
        Departamento departamento = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais pais = new Pais();
        Funcionario chefe = new Funcionario();
        pais.setNome("Brasil");
        grupo.setSede(pais);
        empresa.setGrupo(grupo);
        departamento.setEmpresa(empresa);
        departamento.setChefe(chefe);
        assertEquals("Brasil", departamento.getPaisAlocacao());
    }
    @Test
    void deveRetornarErroPaisAlocacao(){
        try {
            Departamento departamento = new Departamento();
            Empresa empresa = new Empresa();
            departamento.setEmpresa(null);
            departamento.getPaisAlocacao();
            fail();
        } catch (NullPointerException e){
            assertEquals("Departamento sem empresa.", e.getMessage());
        }
    }
    @Test
    void deveRetornarEscolaridadeChefeDepartamento(){
        Departamento departamento = new Departamento();
        Escolaridade escolaridade = new Escolaridade();
        Funcionario chefe = new Funcionario();
        escolaridade.setNivel("Doutorado");
        departamento.setChefe(chefe);
        chefe.setEscolaridade(escolaridade);
        assertEquals("Doutorado", departamento.getEscolaridadeChefeDepartamento());
    }
    @Test
    void deveRetornarErroEscolaridadeChefeDepartamento(){
        try{
            Departamento departamento = new Departamento();
            Escolaridade escolaridade = new Escolaridade();
            Funcionario chefe = new Funcionario();
            departamento.setChefe(null);
            departamento.getEscolaridadeChefeDepartamento();
            fail();
        } catch (NullPointerException e){
            assertEquals("Departamento sem chefe.", e.getMessage());
        }
    }

}