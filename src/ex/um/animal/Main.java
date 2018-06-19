package ex.um.animal;

public class Main {
    public static void main(String[] args) {

        Macaco macaco = new Macaco();

        System.out.println("O que fez o macaco? ");

        macaco.andar();
        System.out.println(" e "+macaco.comerBanana());
    }
}
