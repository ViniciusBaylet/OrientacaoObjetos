package ExRelampagoSurpresa9;

public class Funcionario {


    private String nome;
    private Filial coordenacao;
    private Escolaridade escolaridade;
    private Departamento alocacao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
    public String getNomeEscolaridade(){
        return escolaridade.getNivel();
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    //numero 2
    public String getPaisAlocacaoFuncionario(){
        if(this.alocacao == null){
            throw new NullPointerException("Funcionário sem alocação.");
        }
         return alocacao.getPaisAlocacao();
    }
    //numero 3
    public String getEstadoFilial(){
        if(this.coordenacao == null){
            throw new NullPointerException("Funcionário sem coordenação.");
        }
        return coordenacao.getNomeEstadoFilial();
    }
    public String getNivelEscolaridade(){
        if(this.escolaridade == null){
            throw new NullPointerException("Funcionário sem escolaridade.");
        }
        return escolaridade.getNivel();
    }
}
