package ExRelampagoSurpresa9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacaoFuncionario(){
        Funcionario funcionario = new Funcionario();
        Pais pais = new Pais();
        Departamento alocacao = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        pais.setNome("Brasil");
        grupo.setSede(pais);
        empresa.setGrupo(grupo);
        alocacao.setEmpresa(empresa);
        funcionario.setAlocacao(alocacao);
        assertEquals("Brasil", funcionario.getPaisAlocacaoFuncionario());
    }
    @Test
    void deveRetornarErroPaisAlocacaoFuncionario(){
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setAlocacao(null);
        } catch (NullPointerException e){
            assertEquals("Funcionário sem alocação.", e.getMessage());
        }
    }
    @Test
    void deveRetornarEstadoFilial(){
        Funcionario funcionario = new Funcionario();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();
        Filial coordenacao = new Filial();
        coordenacao.setCidade(cidade);
        cidade.setEstado(estado);
        estado.setNome("Rio de Janeiro");
        funcionario.setCoordenacao(coordenacao);
        assertEquals("Rio de Janeiro", funcionario.getEstadoFilial());
    }
    @Test
    void deveRetornarErroEstadoFilial(){
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setCoordenacao(null);
        } catch (NullPointerException e){
            assertEquals("Funcionário sem coordenação.", e.getMessage());
        }
    }
    @Test
    void deveRetornarNivelEscolaridade(){
        Funcionario funcionario = new Funcionario();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNivel("Ensino Médio");
        funcionario.setEscolaridade(escolaridade);
        assertEquals("Ensino Médio", funcionario.getNivelEscolaridade());
    }
    @Test
    void deveRetornarErroNivelEscolaridade(){
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setEscolaridade(null);
            funcionario.getNivelEscolaridade();
            fail();
        } catch (NullPointerException e){
            assertEquals("Funcionário sem escolaridade.", e.getMessage());
        }
    }
}