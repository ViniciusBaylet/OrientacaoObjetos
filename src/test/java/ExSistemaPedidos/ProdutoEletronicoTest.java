package ExSistemaPedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPreco(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setNome("Celular");
        produtoEletronico.setPrecoBase(3000.0f);
        produtoEletronico.setDesconto(20.0f);
        assertEquals(2400.0f, produtoEletronico.calcularPrecoDesconto());
    }

}