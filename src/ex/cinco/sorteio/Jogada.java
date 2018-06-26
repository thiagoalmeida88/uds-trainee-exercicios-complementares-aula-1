package ex.cinco.sorteio;

public class Jogada {

    private Integer entrada;
    private Integer pontuacao = 100;

    public Jogada(Integer entrada){
        this.entrada = entrada;
    }

    public Integer getEntrada(){
        return this.entrada;
    }
    public Integer getPontuacao() { return this.pontuacao; }

    public void setPontuacao(Integer valor){

        this.pontuacao += valor;
    }

}
