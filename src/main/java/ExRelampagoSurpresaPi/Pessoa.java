package ExRelampagoSurpresaPi;

public class Pessoa {

    private String nome;
    private Escolaridade escolaridade;

    public Pessoa(Escolaridade escolaridade){

        this.escolaridade = escolaridade;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {

        return escolaridade;
    }
    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String descricaoEscolaridade(){
        if(this.escolaridade == null){
            throw new IllegalArgumentException("Pessoa sem escolaridade.");
        }
        return this.escolaridade.getNivel();
    }
}
