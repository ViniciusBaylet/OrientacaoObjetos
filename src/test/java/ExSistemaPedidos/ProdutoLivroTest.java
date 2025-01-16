package ExSistemaPedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPreco(){
        ProdutoLivro produtoLivro = new ProdutoLivro();
        produtoLivro.setNome("As Crônicas de Nárnia");
        produtoLivro.setPrecoBase(70.0f);
        produtoLivro.setDesconto(10.0f);
        assertEquals(63.0f, produtoLivro.calcularPrecoDesconto());
    }

}