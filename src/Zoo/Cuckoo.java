package Zoo;

public class Cuckoo extends Birds implements IAnimal {

    public Cuckoo(int wingsSize, boolean isBirdSigning, String name) {
        super(wingsSize, isBirdSigning, name);
    }

    @Override
    public String move() {
        return "Я летаю, но не очень быстро";
    }

    @Override
    public void breathe() {
    System.out.println("Я дышу клювом");
    }
}
