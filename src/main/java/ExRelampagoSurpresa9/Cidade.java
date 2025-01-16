package ExRelampagoSurpresa9;

public class Cidade {

    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String getNomeEstado(){
        if(this.estado == null){
            throw new NullPointerException("Cidade sem estado.");
        }
        return estado.getNome();
    }
}
