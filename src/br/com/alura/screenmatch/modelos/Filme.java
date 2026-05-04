package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //todo Filme possui o que um Titulo tem

    public Filme(String nome, int anoDeLancamento){ //CONSTRUTOR: utilizado para inicializar um objeto no momento de sua criação -> FUNÇÃO: definir valores iniciais para o atributos e preparar o objeto para uso. Possui o mesmo nome da classe e não possui tipo de retorno.
        super(nome, anoDeLancamento);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override //sobrescrevendo o método toString -> o toString é um método que existe na classe pai (Object) e inicialmente retorna o nome da classe, seguido de @ e o código hash (ex: Pessoa@163b91)
    //obs: praticamente todas as classes do java são filhas de Object
    public String toString() { //toString retorna a representação textual de um objeto
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
