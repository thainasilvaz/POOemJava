import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme(); //um objeto é uma instância de uma classe. a classe serve para padronizar os objetos. nessa linha estou criando um objeto do tipo br.com.alura.screenmatch.modelos.Filme que está sendo armazenado na variável meuFilme
        meuFilme.setNome("Monster");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(125);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Project Hail Mary");
        outroFilme.setAnoDeLancamento(2026);
        outroFilme.setDuracaoEmMinutos(125);
        outroFilme.setIncluidoNoPlano(true);

        //meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.pegaMedia());

        Serie TBBT = new Serie();
        TBBT.setNome("The Big Bang Theory");
        TBBT.setTemporadas(12);
        TBBT.setAtiva(false);
        TBBT.setEpisodiosPorTemporada(10);
        TBBT.setMinutosPorEpisodio(23);
        TBBT.exibeFichaTecnica();

        System.out.println("Duração para maratonar TBBT: " + TBBT.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(TBBT);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(TBBT);
        episodio.setTotalVisualizacoes(10000);
        filtro.filtra(episodio);

    }
}