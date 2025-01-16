package ExRelampagoSurpresa9;

public class Empresa {

    private Grupo grupo;
    private Funcionario diretor;

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    public String getPaisEmpresa(){
        if(this.grupo == null){
            throw new NullPointerException("Empresa sem grupo.");
        }
        return grupo.getPaisGrupo();
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getNomeDiretor(){
        if(this.diretor == null){
            throw new NullPointerException("Empresa sem diretor.");
        }
        return diretor.getNome();
    }
}
