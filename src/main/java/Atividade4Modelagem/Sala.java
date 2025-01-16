package Atividade4Modelagem;

public class Sala {

    private int numeroSala;
    private String nomeSala;
    private int capacidade;


    public Sala(int numeroSala, String nomeSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.nomeSala = nomeSala;
        this.capacidade = capacidade;
    }
    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
