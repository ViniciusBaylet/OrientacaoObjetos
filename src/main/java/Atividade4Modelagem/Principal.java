package Atividade4Modelagem;
import java.util.Date;
public class Principal {

    public static void main(String[] args) {
        // Criando o objeto de Gênero do filme
        Genero genero = new Genero("Ação");

        // Criando os objetos de Ator
        Ator ator1 = new Ator("Kurt Weller", "Protagonista", 35, 'M', "Americana");
        Ator ator2 = new Ator("Jane Doe", "Coadjuvante", 28, 'F', "Britânica");

        // Criando o objeto de Direção
        Direcao direcao = new Direcao("Michael Kale", "Diretor", "Diretor Principal");

        // Criando os objetos de Produção
        Producao producao1 = new Producao("Emma Producer", "Produtora", "Produtora Executiva");
        Producao producao2 = new Producao("Lucas Producer", "Produtor", "Produtor Associado");

        // Criando o objeto de Filme
        Filme filme = new Filme("A Grande Aventura", 2024, "Cinema Studios", "EUA", "120 min", genero);
        filme.setAtor(ator1);
        filme.setAtor(ator2);
        filme.setDirecao(direcao);
        filme.setProducao(producao1);
        filme.setProducao(producao2);

        // Criando o objeto de Sala
        Sala sala = new Sala(1, "Sala VIP", 50);

        // Criando o objeto de Sessão
        Sessao sessao = new Sessao(new Date(), "20:00", sala, filme);

        // Criando os objetos de Ingresso
        Ingresso ingresso1 = new Ingresso(1, 10, "Inteira", 20.00f, "12/08/2024 15:00");
        Ingresso ingresso2 = new Ingresso(2, 11, "Meia-entrada", 10.00f, "12/08/2024 15:05");

        // Exibindo os dados da Sessão antes da venda de ingressos
        System.out.println("Dados da Sessão Antes da Venda de Ingressos:");
        sessao.exibirSessao();

        // Vendendo os ingressos
        System.out.println("\nVendendo Ingressos...");
        sessao.venderIngressos(ingresso1);
        sessao.venderIngressos(ingresso2);

        // Exibindo os dados da Sessão depois da venda de ingressos
        System.out.println("\nDados da Sessão Depois da Venda de Ingressos:");
        sessao.exibirSessao();

        // Exibindo os dados dos ingressos vendidos
        System.out.println("\nIngressos Vendidos:");
        imprimirIngresso(ingresso1);
        imprimirIngresso(ingresso2);
    }

    private static void imprimirIngresso(Ingresso ingresso) {
        System.out.println("Número do Ingresso: " + ingresso.getNumeroIngresso());
        System.out.println("Assento: " + ingresso.getAssentoIngresso());
        System.out.println("Tipo: " + ingresso.getTipoIngresso());
        System.out.println("Valor: R$" + ingresso.getValorIngresso());
        System.out.println("Data/Hora da Compra: " + ingresso.getDataHoraComprada());
    }
}
