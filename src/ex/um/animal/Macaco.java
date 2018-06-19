package ex.um.animal;

public class Macaco extends Animal {

    public String comerBanana(){
        return "comeu banana";
    }

    @Override
    public void andar() {
        System.out.println("Macaco andou ");
    }
}


