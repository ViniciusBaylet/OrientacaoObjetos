package ExRelampagoSurpresa9;

public class Grupo {

    private Pais sede;
    private Funcionario presidente;

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }
    //numero 1
    public String getEscolaridadePresidente(){
        if(this.presidente == null){
            throw new NullPointerException("Grupo sem presidente.");
        }
        return presidente.getNomeEscolaridade();
    }
    public String getPaisGrupo(){
        return sede.getNome();
    }
}
