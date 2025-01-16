package Atividade4Modelagem;
import java.util.Date;
public class Sessao {

    private Date dataSessao;
    private String horaSessao;
    private String estadoSessao;
    private int ingressosSessao;
    private int ingressosComprados;
    private int ingressosRestantes;
    private Sala sala;
    private Filme filme;


    public Sessao(Date dataSessao, String horaSessao, Sala sala, Filme filme) {
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.sala = sala;
        this.filme = filme;
        this.ingressosSessao = sala.getCapacidade();
        this.ingressosComprados = 0;
        this.ingressosRestantes = ingressosSessao;
        this.estadoSessao = "Aberta";
    }
    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        this.estadoSessao = estadoSessao;
    }

    public int getIngressosSessao() {
        return ingressosSessao;
    }

    public void setIngressosSessao(int ingressosSessao) {
        this.ingressosSessao = ingressosSessao;
    }

    public int getIngressosComprados() {
        return ingressosComprados;
    }

    public void setIngressosComprados(int ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public int getIngressosRestantes() {
        return ingressosRestantes;
    }

    public void setIngressosRestantes(int ingressosRestantes) {
        this.ingressosRestantes = ingressosRestantes;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void venderIngressos(Ingresso ingresso) {
        if (ingressosRestantes > 0) {
            ingressosComprados++;
            ingressosRestantes--;
            System.out.println("Ingresso vendido: " + ingresso.getTipoIngresso());
        } else {
            System.out.println("Não há mais ingressos disponíveis.");
        }
    }

    public void exibirSessao(){
        System.out.println("Sessão do Filme: " + filme.getTitulo());
        System.out.println("Sala: " + sala.getNomeSala());
        System.out.println("Data: " + dataSessao);
        System.out.println("Hora: " + horaSessao);
        System.out.println("Estado: " + estadoSessao);
        System.out.println("Ingressos Disponíveis: " + ingressosRestantes);
    }
}
