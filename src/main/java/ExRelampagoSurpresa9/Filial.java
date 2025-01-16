package ExRelampagoSurpresa9;

public class Filial {

    private Cidade cidade;
    private Empresa empresa;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getNomeEstadoFilial(){
        if(this.cidade == null){
            throw new NullPointerException("Filial sem cidade.");
        }
        return cidade.getNomeEstado();
    }
    //numero 5
    public String getNomeDiretorEmpresa(){
        if(this.empresa == null){
            throw new NullPointerException("Filial sem empresa.");
        }
        return empresa.getNomeDiretor();
    }
}
