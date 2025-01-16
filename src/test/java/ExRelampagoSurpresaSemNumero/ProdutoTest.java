package ExRelampagoSurpresaSemNumero;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveVerificarEstoqueBaixo(){
        Cliente cliente1 = new Cliente("Marco", "123");
        Produto produto1 = new Produto("caneta", 11, 1.2f, 10, 200);
        Fornecedor fornecedor1 = new Fornecedor("Antônio", "456");
        Venda venda1 = new Venda("26/07/2021", cliente1, produto1, 95);
        Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
        ArrayList<String> historico = new ArrayList<String>();
        Compra compra1 = new Compra("26/07/2021", produto1, fornecedor1, 40, 1.2f);
        String dadosTransacao = "Valor venda = 48.0f, Estoque baixo, Venda do produto caneta, Compra do produto caneta";
        produto1.setVenda(venda1);
        produto1.setHistorico(historico);
        produto1.setCompra(compra1);
        transacao1.setProduto(produto1);
        transacao1.setQuantidade(40);
        transacao1.setDataTransacao("26/07/2021");
        compra1.setProduto(produto1);
        venda1.setProduto(produto1);
        produto1.setTransacao(transacao1);
        assertEquals(false, produto1.verificarEstoqueBaixo());
    }

    @Test
    void deveRetornarErroVerificarEstoqueBaixo(){
        try {
            Cliente cliente1 = new Cliente("Marco", "123");
            Produto produto1 = new Produto("caneta", 9, 1.2f, 10, 200);
            Fornecedor fornecedor1 = new Fornecedor("Antônio", "456");
            Venda venda1 = new Venda("26/07/2021", cliente1, produto1, 95);
            Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
            ArrayList<String> historico = new ArrayList<String>();
            Compra compra1 = new Compra("26/07/2021", produto1, fornecedor1, 40, 1.2f);
            String dadosTransacao = "Valor venda = 48.0f, Estoque baixo, Venda do produto caneta, Compra do produto caneta";
            produto1.setVenda(venda1);
            produto1.setHistorico(historico);
            produto1.setCompra(compra1);
            transacao1.setProduto(produto1);
            transacao1.setQuantidade(40);
            transacao1.setDataTransacao("26/07/2021");
            compra1.setProduto(produto1);
            venda1.setProduto(produto1);
            produto1.setTransacao(transacao1);
            produto1.verificarEstoqueBaixo();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Estoque baixo.", e.getMessage());
        }
    }


    @Test
    void deveVerificarEstoqueInsuficiente(){
        Cliente cliente1 = new Cliente("Marco", "123");
        Produto produto1 = new Produto("caneta", 100, 1.2f, 10, 200);
        Fornecedor fornecedor1 = new Fornecedor("Antônio", "456");
        Venda venda1 = new Venda("26/07/2021", cliente1, produto1, 95);
        Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
        ArrayList<String> historico = new ArrayList<String>();
        Compra compra1 = new Compra("26/07/2021", produto1, fornecedor1, 40, 1.2f);
        String dadosTransacao = "Valor venda = 48.0f, Estoque baixo, Venda do produto caneta, Compra do produto caneta";
        produto1.setVenda(venda1);
        produto1.setHistorico(historico);
        produto1.setCompra(compra1);
        transacao1.setProduto(produto1);
        transacao1.setQuantidade(40);
        transacao1.setDataTransacao("26/07/2021");
        compra1.setProduto(produto1);
        venda1.setProduto(produto1);
        produto1.setTransacao(transacao1);
        assertEquals(false, produto1.verificarEstoqueInsuficiente(95));
    }
    @Test
    void deveRetornarErroVerificarEstoqueInsuficiente(){
        try{
            Cliente cliente1 = new Cliente("Marco", "123");
            Produto produto1 = new Produto("caneta", 100, 1.2f, 10, 200);
            Fornecedor fornecedor1 = new Fornecedor("Antônio", "456");
            Venda venda1 = new Venda("26/07/2021", cliente1, produto1, 200);
            Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
            ArrayList<String> historico = new ArrayList<String>();
            Compra compra1 = new Compra("26/07/2021", produto1, fornecedor1, 40, 1.2f);
            String dadosTransacao = "Valor venda = 48.0f, Estoque baixo, Venda do produto caneta, Compra do produto caneta";
            produto1.setVenda(venda1);
            produto1.setHistorico(historico);
            produto1.setCompra(compra1);
            transacao1.setProduto(produto1);
            transacao1.setQuantidade(40);
            transacao1.setDataTransacao("26/07/2021");
            compra1.setProduto(produto1);
            venda1.setProduto(produto1);
            produto1.setTransacao(transacao1);
            produto1.verificarEstoqueInsuficiente(200);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Estoque insuficiente.", e.getMessage());
        }
    }

    @Test
    void deveVerificarEstoqueExcedente(){
        Cliente cliente1 = new Cliente("Marco", "123");
        Produto produto1 = new Produto("caneta", 150, 1.2f, 10, 200);
        Fornecedor fornecedor1 = new Fornecedor("Antônio", "456");
        Venda venda1 = new Venda("26/07/2021", cliente1, produto1, 95);
        Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
        ArrayList<String> historico = new ArrayList<String>();
        Compra compra1 = new Compra("26/07/2021", produto1, fornecedor1, 40, 1.2f);
        String dadosTransacao = "Valor venda = 48.0f, Estoque baixo, Venda do produto caneta, Compra do produto caneta";
        produto1.setVenda(venda1);
        produto1.setHistorico(historico);
        produto1.setCompra(compra1);
        transacao1.setProduto(produto1);
        transacao1.setQuantidade(40);
        transacao1.setDataTransacao("26/07/2021");
        compra1.setProduto(produto1);
        venda1.setProduto(produto1);
        produto1.setTransacao(transacao1);
        assertEquals(false, produto1.verificarEstoqueExcedente(40));
    }
    @Test
    void deveRetornarErroVerificarEstoqueExcedente(){
        try {
            Cliente cliente1 = new Cliente("Marco", "123");
            Produto produto1 = new Produto("caneta", 150, 1.2f, 10, 200);
            Fornecedor fornecedor1 = new Fornecedor("Antônio", "456");
            Venda venda1 = new Venda("26/07/2021", cliente1, produto1, 95);
            Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
            ArrayList<String> historico = new ArrayList<String>();
            Compra compra1 = new Compra("26/07/2021", produto1, fornecedor1, 40, 1.2f);
            String dadosTransacao = "Valor venda = 48.0f, Estoque baixo, Venda do produto caneta, Compra do produto caneta";
            produto1.setVenda(venda1);
            produto1.setHistorico(historico);
            produto1.setCompra(compra1);
            transacao1.setProduto(produto1);
            transacao1.setQuantidade(40);
            transacao1.setDataTransacao("26/07/2021");
            compra1.setProduto(produto1);
            venda1.setProduto(produto1);
            produto1.setTransacao(transacao1);
            produto1.verificarEstoqueExcedente(60);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Estoque excedente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarProdutoVendido(){
        Cliente cliente1 = new Cliente("Marco", "123");
        Produto produto1 = new Produto("caneta", 100, 1.2f, 10, 200);
        Fornecedor fornecedor1 = new Fornecedor("Antônio", "456");
        Venda venda1 = new Venda("26/07/2021", cliente1, produto1, 95);
        Transacao transacao1 = new Transacao("26/07/2021", produto1, 95);
        ArrayList<String> historico = new ArrayList<String>();
        Compra compra1 = new Compra("26/07/2021", produto1, fornecedor1, 40, 1.2f);
        String dadosTransacao = "Valor venda = 48.0f, Estoque baixo, Venda do produto caneta, Compra do produto caneta";
        produto1.setVenda(venda1);
        produto1.setHistorico(historico);
        produto1.setCompra(compra1);
        transacao1.setProduto(produto1);
        transacao1.setQuantidade(40);
        transacao1.setDataTransacao("26/07/2021");
        compra1.setProduto(produto1);
        venda1.setProduto(produto1);
        produto1.setTransacao(transacao1);
        produto1.vender("26/07/2021", cliente1, produto1, 40);
        produto1.comprar("26/07/2021",produto1, fornecedor1, 50, 1.2f);
        produto1.registrarHistorico(dadosTransacao);
        assertEquals(historico, produto1.exibirHistorico());
    }

}