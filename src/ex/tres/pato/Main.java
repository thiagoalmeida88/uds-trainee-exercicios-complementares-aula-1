package ex.tres.pato;

public class Main {
    public static void main(String[] args){

        Pato pato = new PatoDeCabecaVermelha();
        Pato patoCiber = new PatoCibernetico();

        pato.voar();
        patoCiber.voar();
    }
}
