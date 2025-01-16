package ExRelampagoSurpresaPi;

public class Professor extends Pessoa {


    private Cidade cidade;
    private Curso contratacao;
    private Escola escola;

    public Professor(Escolaridade escolaridade) {
        super(escolaridade);
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    //letra e
    public String cidadeNascimentoProfessor(){
        if(this.cidade == null){
            throw new IllegalArgumentException("Professor sem cidade de nascimento.");
        }
        return cidade.getNome();
    }
    //letra g
    public String tipoEnsinoContratacao(){
        if(this.contratacao == null){
            throw new IllegalArgumentException("Professor sem contratação.");
        }
        return contratacao.tipoEnsinoContratacao();
    }
    //letra i
    public String diretorProfessor(){
        if(this.contratacao == null){
            throw new IllegalArgumentException("Professor sem contratação.");
        }
        return escola.getNomeDiretor();
    }
    //letra j
    public String coordenadorProfessor(){
        if(this.contratacao == null){
            throw new IllegalArgumentException("Professor sem contratação.");
        }
        return contratacao.nomeCoordenadorCurso();
    }
}

