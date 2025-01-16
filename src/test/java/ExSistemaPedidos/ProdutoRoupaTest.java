package ExSistemaPedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPreco(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setNome("Camisa Nike");
        produtoRoupa.setPrecoBase(200.0f);
        produtoRoupa.setDesconto(30.0f);
        assertEquals(140.0f, produtoRoupa.calcularPrecoDesconto());
    }

}