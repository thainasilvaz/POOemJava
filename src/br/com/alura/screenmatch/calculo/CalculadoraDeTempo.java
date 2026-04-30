package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo
{
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal = tempoTotal + f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal = tempoTotal + s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal = tempoTotal + titulo.getDuracaoEmMinutos();
    }
}
