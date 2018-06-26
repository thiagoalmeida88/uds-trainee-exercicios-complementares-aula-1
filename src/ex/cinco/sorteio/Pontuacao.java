package ex.cinco.sorteio;

import java.util.ArrayList;
import java.util.Random;

public class Pontuacao {

    private Integer total;
    private Integer numeroSorteio = 100;
    private Integer acerto = 10;
    private Integer erro = -10;
    private Integer soma;

    private ArrayList<Jogada> jogadas = new ArrayList<>();
    private Jogada jogada;


    public Integer sortearNumero(Jogada jogada){

        Random random = new Random();

        Integer numeroSorteado = random.nextInt(numeroSorteio);

        if((jogada.getEntrada() % 2) == 0 && (numeroSorteado % 2) == 0) {

            jogada.setPontuacao(acerto);
            return numeroSorteado;
        }

        if((jogada.getEntrada() % 2) == 1 && (numeroSorteado % 2) == 1) {

            jogada.setPontuacao(acerto);
            return numeroSorteado;

        }

        jogada.setPontuacao(erro);

        adicionarJogada(jogada);
        return numeroSorteado;

    }

    public void adicionarJogada(Jogada jogada){

        this.jogadas.add(jogada);

    }


}
