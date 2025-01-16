package ExRelampagoSurpresa9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarNomeEstadoFilial(){
        Filial filial = new Filial();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();
        estado.setNome("Minas Gerais");
        cidade.setEstado(estado);
        filial.setCidade(cidade);
        assertEquals("Minas Gerais", filial.getNomeEstadoFilial());
    }
    @Test
    void deveRetornarErroNomeEstadoFilial(){
        try {
            Filial filial = new Filial();
            filial.setCidade(null);
            filial.getNomeEstadoFilial();
            fail();
        } catch (NullPointerException e){
            assertEquals("Filial sem cidade.", e.getMessage());
        }
    }
    @Test
    void deveRetornarNomeDiretorEmpresa(){
        Filial filial = new Filial();
        Empresa empresa = new Empresa();
        Funcionario diretor = new Funcionario();
        filial.setEmpresa(empresa);
        diretor.setNome("Vinicius");
        empresa.setDiretor(diretor);
        assertEquals("Vinicius", filial.getNomeDiretorEmpresa());
    }
    @Test
    void deveRetornarErroNomeDiretorEmpresa(){
        try {
            Filial filial = new Filial();
            filial.setEmpresa(null);
            filial.getNomeDiretorEmpresa();
            fail();
        } catch (NullPointerException e){
            assertEquals("Filial sem empresa.", e.getMessage());
        }
    }


}