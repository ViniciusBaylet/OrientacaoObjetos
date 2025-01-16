package Atividade4Modelagem;

public class Producao extends Papel{

    private String papelProducao;

    public Producao(String nomePessoa, String papel, String papelProducao) {
        super(nomePessoa, papel);
        this.papelProducao = papelProducao;
    }
    public String getPapelProducao() {
        return papelProducao;
    }

    public void setPapelProducao(String papelProducao) {
        this.papelProducao = papelProducao;
    }
}
