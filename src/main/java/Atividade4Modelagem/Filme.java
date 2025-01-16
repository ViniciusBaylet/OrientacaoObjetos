package Atividade4Modelagem;

import ExRelampagoSurpresaSemNumero.Produto;

import java.util.ArrayList;

public class Filme {

    private String titulo;
    private int ano;
    private String produtora;
    private String paisOrigem;
    private String duracao;
    private Genero genero;
    private ArrayList<Papel> papeis;
    private Ator ator;
    private Direcao direcao;
    private Producao producao;


    public Filme(String titulo, int ano, String produtora, String paisOrigem, String duracao, Genero genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.produtora = produtora;
        this.paisOrigem = paisOrigem;
        this.duracao = duracao;
        this.genero = genero;
        this.papeis = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(ArrayList<Papel> papeis) {
        this.papeis = papeis;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public Producao getProducao() {
        return producao;
    }

    public void setProducao(Producao producao) {
        this.producao = producao;
    }
}
