package ExGerenciamentoProdutos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    ProdutoRoupa produtoRoupa;

    @BeforeEach
    void setUp(){
        produtoRoupa = new ProdutoRoupa();
    }

    @Test
    void deveRetornarDescontoInvalido(){
        try {
            produtoRoupa.setDesconto(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Desconto inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarDescontoValido(){
        produtoRoupa.setNome("Camisa");
        produtoRoupa.setPrecoUnitario(50.0f);
        produtoRoupa.setQuantidadeEstoque(50);
        produtoRoupa.setQuantidadeVendida(1);
        produtoRoupa.setDesconto(20.0f);
        assertEquals(40.0f, produtoRoupa.calcularPreco());
    }

}