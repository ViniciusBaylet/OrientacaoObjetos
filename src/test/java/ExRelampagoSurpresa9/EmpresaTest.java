package ExRelampagoSurpresa9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarPaisEmpresa(){
        Pais pais = new Pais();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        grupo.setSede(pais);
        empresa.setGrupo(grupo);
        pais.setNome("Brasil");
        assertEquals("Brasil", empresa.getPaisEmpresa());
    }
    @Test
    void deveRetornarErroPaisEmpresa(){
        try{
            Empresa empresa = new Empresa();
            empresa.setGrupo(null);
            empresa.getPaisEmpresa();
            fail();
        } catch (NullPointerException e){
            assertEquals("Empresa sem grupo.", e.getMessage());
        }
    }
    @Test
    void deveRetornarNomeDiretorEmpresa(){
        Empresa empresa = new Empresa();
        Funcionario diretor = new Funcionario();
        empresa.setDiretor(diretor);
        diretor.setNome("Cláudio");
        assertEquals("Cláudio", empresa.getNomeDiretor());
    }
    @Test
    void deveRetornarErroNomeDiretorEmpresa(){
        try {
            Empresa empresa = new Empresa();
            empresa.setDiretor(null);
            empresa.getNomeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Empresa sem diretor.", e.getMessage());
        }
    }

}