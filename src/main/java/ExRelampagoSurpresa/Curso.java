package ExRelampagoSurpresa;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {
    private String nome;
    private Professor coordenador;
    private final ArrayList<Turma> turmas;
    private final ArrayList<Aluno> alunos;


    public Curso(String nome){
        this.setNome(nome);
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String getNomeCoordenador() {
        if (this.coordenador == null) {
            throw new NullPointerException("Curso sem coordenador");
        }
        return this.coordenador.getNome();
    }
    //QUESTÃO 3
    public ArrayList<String> nomesProfessores(){
        ArrayList<String> listaProfessores = new ArrayList<String>();
        for(Turma turma : this.turmas){
            if(turma.nomeProfessor() != null){
                listaProfessores.add(turma.nomeProfessor());
            }
        }
        return listaProfessores;
    }
    //QUESTÃO 4
    public ArrayList<String> nomesAlunosTurma(){
        ArrayList<String> listaAlunos = new ArrayList<String>();
        for(Turma turma : this.turmas){
                listaAlunos.addAll(turma.listaAlunos());
            }
        return listaAlunos;
        }
    //QUESTÃO 5
    public ArrayList<String> nomesAlunosCurso(){
        ArrayList<String> listaAlunos = new ArrayList<String>();
        for(Aluno aluno : this.alunos){
            listaAlunos.add(aluno.getNome());
        }
        return listaAlunos;
    }
    //QUESTÃO 6
    public ArrayList<String> nomeDisciplinasTurmaCurso(){
        ArrayList<String> listaDisciplinas = new ArrayList<String>();
        for(Turma turma : this.turmas){
            listaDisciplinas.add(turma.nomeDisciplina());
        }
        return listaDisciplinas;
    }
    //QUESTÃO 8
    public boolean verificarMatricula(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
    //QUESTÃO 9
    public boolean verificarTurma(Turma turma){
        return this.turmas.contains(turma);
    }
    //EX.EXTRA
    public void adicionarTurma(Turma turma){

        this.turmas.add(turma);
    }
    //QUESTÃO 11
    public boolean excluirTurma(Turma turma) {
       return this.turmas.remove(turma);
    }
    //QUESTÃO 12
    public boolean desmatricular(Aluno aluno) {
        return this.alunos.remove(aluno);
    }
}
