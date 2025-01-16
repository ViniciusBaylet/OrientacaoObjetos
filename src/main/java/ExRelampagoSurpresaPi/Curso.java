package ExRelampagoSurpresaPi;

public class Curso {

    private Professor coordenador;
    private Estado estado;
    private TipoEnsino tipoEnsino;

    public Curso(Professor coordenador){
        this.coordenador = coordenador;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    //letra b
    public String getEscolaridadeCoordenadorCurso(){
        if(this.coordenador == null){
            throw new IllegalArgumentException("Curso sem coordenador.");
        }
        return coordenador.descricaoEscolaridade();
    }

    public String tipoEnsinoContratacao(){

        return tipoEnsino.getNome();
    }
    //letra h
    public String nomeCoordenadorCurso(){
        if(this.coordenador == null){
            throw new IllegalArgumentException("Curso sem coordenador");
        }
        return coordenador.getNome();
    }
}
