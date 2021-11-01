package Zoo;

public class Carp extends Fish implements IAnimal {


    public Carp(String scale, int finsCount, String typeName) {
        super(scale, finsCount, typeName);
    }

    @Override
    public String move() {
        return "Я плыву по-рыбьи";
    }

    @Override
    public void breathe() {
        System.out.println("Я дышу жабрами");
    }
}
