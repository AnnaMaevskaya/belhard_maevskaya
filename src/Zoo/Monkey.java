package Zoo;

public class Monkey extends Animals implements IAnimal {

    public Monkey(int footCount, String name) {
        super(footCount, name);
    }

    @Override
    public String move() {
        return "Я лазаю по деревьям";
    }

    @Override
    public void breathe() {
        System.out.println("Я дышу носом и ртом");
    }
}
