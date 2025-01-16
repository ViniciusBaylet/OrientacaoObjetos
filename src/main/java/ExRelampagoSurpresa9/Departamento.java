package ExRelampagoSurpresa9;

public class Departamento {

    private Empresa empresa;
    private Funcionario chefe;


    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
    public String getPaisAlocacao(){
        if(this.empresa == null){
            throw new NullPointerException("Departamento sem empresa.");
        }
        return empresa.getPaisEmpresa();
    }
    //numero 4
    public String getEscolaridadeChefeDepartamento(){
        if(this.chefe == null){
            throw new NullPointerException("Departamento sem chefe.");
        }
        return chefe.getNivelEscolaridade();
    }
}
