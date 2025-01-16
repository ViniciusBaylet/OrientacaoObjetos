package ExRelampagoSurpresaSemNumero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void deveRetornarProdutoEstoque() {
        Produto produto1 = new Produto("caneta", 100, 1.2f, 10, 200);
        Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
        produto1.setQuantidadeEstoque(50);
        assertEquals(produto1, transacao1.getProduto());
    }

    @Test
    void deveRetornarErroProdutoEstoque() {
        try {
            Produto produto1 = new Produto("caneta", 100, 1.2f, 10, 200);
            Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
            produto1.setQuantidadeEstoque(0);
            transacao1.setProduto(produto1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não há o produto no estoque.", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroProdutoEstoqueNegativo() {
        try {
            Produto produto1 = new Produto("caneta", 100, 1.2f, 10, 200);
            Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
            produto1.setQuantidadeEstoque(-1);
            transacao1.setProduto(produto1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não há o produto no estoque.", e.getMessage());
        }

    }
}