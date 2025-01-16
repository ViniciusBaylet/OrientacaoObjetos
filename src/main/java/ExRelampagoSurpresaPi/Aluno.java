package ExRelampagoSurpresaPi;

public class Aluno extends Pessoa{

    private Estado estado;
    private Curso curso;


    public Aluno(Escolaridade escolaridade){
        super(escolaridade);
    }
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    //letra d
    public String EstadoNaturalidadeAluno(){
        if(this.estado == null){
            throw new IllegalArgumentException("Aluno sem estado de naturalidade");
        }
        return estado.getNome();
    }

}
