package Zoo;

public class Main {
    public static void main(String[] args) {
        Dog pug = new Dog(4, "Мопс");
        Monkey capuchin = new Monkey(2, "Капуцин");
        Carp carp = new Carp("зеленая",3, "Капр Валера");
        Cuckoo cuckoo = new Cuckoo(1, true, "Кукушка");

        System.out.println(pug.name);
        pug.breathe();
        printMove(pug);

        System.out.println(capuchin.name);
        capuchin.breathe();
        printMove(capuchin);

        System.out.println(carp.name);
        carp.breathe();
        printMove(carp);

        System.out.println(cuckoo.name);
        cuckoo.breathe();
        printMove(cuckoo);


    }
    public static void printMove(IAnimal creature){
        System.out.println(creature.move());
       }

}
