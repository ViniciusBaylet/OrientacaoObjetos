package ExGerenciamentoProdutos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    ProdutoEletronico produtoEletronico;

    @BeforeEach
    void setUp() {
        produtoEletronico = new ProdutoEletronico();
    }

    @Test
    void deveRetornarEstoqueInsuficiente1() {
        try {
            produtoEletronico.setNome("Celular");
            produtoEletronico.setPrecoUnitario(2000.0f);
            produtoEletronico.setQuantidadeEstoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }

    }

    @Test
    void deveRetornarEstoqueInsuficiente2() {
        try {
            produtoEletronico.setNome("Celular");
            produtoEletronico.setPrecoUnitario(2000.0f);
            produtoEletronico.setQuantidadeVendida(2);
            produtoEletronico.setQuantidadeEstoque(1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }

    }

    @Test
    void deveRetornarEstoqueSuficiente() {

        produtoEletronico.setNome("Celular");
        produtoEletronico.setPrecoUnitario(2000.0f);
        produtoEletronico.setQuantidadeEstoque(40);
        produtoEletronico.setQuantidadeVendida(1);
        assertEquals(2000.0f, produtoEletronico.calcularPreco());
    }
}