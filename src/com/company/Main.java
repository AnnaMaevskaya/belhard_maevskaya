package com.company;

public class Main {

    public static void main(String[] args) {
        Car carBublik = new Car("Седан", "бензин", "красный", "QWE789");
        carBublik.getInfo();
        Car vladCar = new Car("кроссовер", "'электрокар", "желтый", "asd123");
        vladCar.getInfo();
    }

}
