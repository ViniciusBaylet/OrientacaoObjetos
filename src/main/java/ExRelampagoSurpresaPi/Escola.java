package ExRelampagoSurpresaPi;

public class Escola {

    private Professor diretor;
    private Estado estado;

    public Escola(Professor diretor){
        this.diretor = diretor;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //letra c
    public String getEscolaridadeDiretorEscola(){
        if(this.diretor == null){
            throw new IllegalArgumentException("Escola sem diretor.");
        }
        return this.diretor.descricaoEscolaridade();
    }
    //letra f
    public String getEstadoEscola(){
        if(this.estado == null){
            throw new IllegalArgumentException("Escola sem estado.");
        }
        return estado.getNome();
    }
    public String getNomeDiretor(){
        return diretor.getNome();
    }
}
