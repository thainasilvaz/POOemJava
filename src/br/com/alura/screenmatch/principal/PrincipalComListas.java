package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Monster", 2023);
        Filme outroFilme = new Filme("Project Hail Mary", 2026);
        Filme deadPoets = new Filme("Sociedade dos Poetas Mortos", 1989);
        Serie TBBT = new Serie("The Big Bang Theory", 2007 );
        meuFilme.avalia(10);
        outroFilme.avalia(9);
        deadPoets.avalia(10);
        TBBT.avalia(10);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(deadPoets);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(TBBT);

        for (Titulo item: listaDeAssistidos ) {
            System.out.println(item.getNome());
            System.out.println("Classificação: " + item.getClassificacao() + " estrelas");
            System.out.println("");
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Artista aleatório");
        buscaPorArtista.add("Leonardo DiCaprio");
        buscaPorArtista.add("Brad Pitt");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); //o collections.sort ordena listas diretamente na lista original em ordem crescente
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //ordenando por ano de lançamento
        System.out.println(listaDeAssistidos);
    }
}
