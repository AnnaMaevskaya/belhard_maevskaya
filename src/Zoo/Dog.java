package Zoo;

public class Dog extends Animals implements IAnimal {
    public Dog(int footCount, String name) {
        super(footCount, name);
    }

    @Override
    public String move() {
        return "Я бегу лапками";
    }

    @Override
    public void breathe() {
        System.out.println("Я дышу ртом");
    }
}
