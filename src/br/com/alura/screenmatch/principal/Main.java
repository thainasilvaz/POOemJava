package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Monster", 2023); //um objeto é uma instância de uma classe. a classe serve para padronizar os objetos. nessa linha estou criando um objeto do tipo br.com.alura.screenmatch.modelos.Filme que está sendo armazenado na variável meuFilme
        //meuFilme.setNome("Monster");
        //meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(125);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme("Project Hail Mary", 2026);
        //outroFilme.setNome("Project Hail Mary");
        //outroFilme.setAnoDeLancamento(2026);
        outroFilme.setDuracaoEmMinutos(125);
        outroFilme.setIncluidoNoPlano(true);

        //meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.pegaMedia());

        Serie TBBT = new Serie("The Big Bang Theory", 2007 );
        //TBBT.setNome("The Big Bang Theory");
        //TBBT.setAnoDeLancamento(2007);
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

        Filme deadPoets = new Filme("Sociedade dos Poetas Mortos", 1989);
        //deadPoets.setNome("Sociedade dos Poetas Mortos");
        deadPoets.setIncluidoNoPlano(true);
        deadPoets.setDuracaoEmMinutos(129);
        //deadPoets.setAnoDeLancamento(1989);
        deadPoets.setDiretor("Peter Weir");
        deadPoets.avalia(10);

        //a classe ArrayList é melhor do que um simples array para representar uma coleção de elementos pois os arrays: possuem tamanho fixo (não é possível alterar o tamanho após a sua criação) e não possuem métodos que permitam a inserção, pesquisa ou remoção de elementos de forma eficiente
        ArrayList<Filme> listaDeFilmes = new ArrayList<>(); //criando um objeto (lista): filmes
        listaDeFilmes.add(deadPoets);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println("Filmes da lista: " + listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }
}