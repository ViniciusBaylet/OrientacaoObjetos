package ExRelampagoSurpresa;

import java.util.ArrayList;
import java.util.List;
public class Turma {

    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private Aluno aluno;

    public Turma(Disciplina disciplina) {
        this.alunos = new ArrayList<Aluno>();
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {

        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("Turma sem disciplina");
        }
        this.disciplina = disciplina;
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }
    //QUESTÃO 10
    public void desmatricular(Aluno aluno) {
        this.alunos.remove(aluno);
    }
    //QUESTÃO 7
    public boolean verificarMatricula(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public int getNumeroAlunos() {
        return this.alunos.size();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String nomeAluno(){
        if(this.aluno == null){
            return "Turma sem aluno.";
        }
        return this.aluno.getNome();
    }
    public String nomeDisciplina(){
        if(this.disciplina == null){
            return "Turma sem disciplina.";
        }
        return this.disciplina.getNome();
    }
    //QUESTÃO 1
    public String nomeProfessor(){
        if(this.professor == null){
           return "Turma sem professor.";
        }
        return this.professor.getNome();
    }
    //QUESTÃO2
    public ArrayList<String> listaAlunos(){
        ArrayList<String> lista = new ArrayList<String>();
        for(Aluno aluno : this.alunos){
            lista.add(aluno.getNome());
        }
        return lista;
    }

}
