package ExRelampagoSurpresaSemNumero;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private int quantidadeEstoque;
    private float precoUnitario;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private ArrayList<String> historico = new ArrayList<>();
    private ArrayList<Venda> historicoVenda = new ArrayList<>();
    private ArrayList<Compra> historicoCompra = new ArrayList<>();
    private Venda venda;
    private Compra compra;
    private Transacao transacao;

    public Produto(String nome,  int quantidadeEstoque, float precoUnitario, int estoqueMinimo, int estoqueMaximo){
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoUnitario = precoUnitario;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public ArrayList<Venda> getHistoricoVenda() {
        return historicoVenda;
    }

    public void setHistoricoVenda(ArrayList<Venda> historicoVenda) {
        this.historicoVenda = historicoVenda;
    }

    public ArrayList<Compra> getHistoricoCompra() {
        return historicoCompra;
    }

    public void setHistoricoCompra(ArrayList<Compra> historicoCompra) {
        this.historicoCompra = historicoCompra;
    }
    //letra a
    public void debitarEstoque(int quantidadeVendida){
        this.quantidadeEstoque = this.quantidadeEstoque - quantidadeVendida;
    }
    //letra b
    public void creditarEstoque(int quantidadeComprada){
        this.quantidadeEstoque = this.quantidadeEstoque + quantidadeComprada;
    }
    //letra c
    public boolean verificarEstoqueBaixo(){
        if(this.quantidadeEstoque < this.estoqueMinimo){
            throw new IllegalArgumentException("Estoque baixo.");
        }
        return false;
    }
    //letra d
    public boolean verificarEstoqueInsuficiente(int quantidadeVendida){
        if(quantidadeVendida > this.quantidadeEstoque){
            throw new IllegalArgumentException("Estoque insuficiente.");
        }
        return false;
    }
    //letra e
    public boolean verificarEstoqueExcedente(int quantidadeComprada){
        if(this.quantidadeEstoque + quantidadeComprada > this.estoqueMaximo){
            throw new IllegalArgumentException("Estoque excedente.");
        }
        return false;
    }
    //letra f
    public float calcularValorVenda(int quantidadeComprada){
        return this.precoUnitario * quantidadeComprada;
    }
    //letra g
    public void vender(String dataVenda, Cliente cliente, Produto produto, int quantidadeVendida){
        Venda venda = new Venda(dataVenda, cliente, produto,quantidadeVendida);
        venda.vender(produto, quantidadeVendida);
        if(venda.vender(produto, quantidadeVendida)){
            historicoVenda.add(venda);
        }
    }
    //letra h
    public void comprar(String dataCompra, Produto produto, Fornecedor fornecedor, int quantidadeCompra, float precoUnitario){
        Compra compra = new Compra(dataCompra, produto, fornecedor, quantidadeCompra, precoUnitario);
        compra.comprar(produto, quantidadeCompra);
        if(compra.comprar(produto, quantidadeCompra)){
            historicoCompra.add(compra);
        }
    }
    //letra i
    public void registrarHistorico(String dadosTransacao){
        historico.add(dadosTransacao);
    }
    //letra j
    public ArrayList<String> exibirHistorico(){
        return historico;
    }
}
