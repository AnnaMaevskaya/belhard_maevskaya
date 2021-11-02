package com.company;

public class Car {
    String carType;
    final int wheelsCount = 4;
    String fuelType;
    String color;
    private String secretCode;
    public String getSecretCode() {
        return secretCode;
    }
    public void setSecretCode(String newSecretcode) {
        secretCode = newSecretcode;
    }
    public Car (String carType, String fuelType, String color, String secretCode){
        this.carType = carType;
        this.fuelType = fuelType;
        this.color = color;
        this.secretCode = secretCode;

    }
    public void getInfo () {
        System.out.println("Тип машины: " + this.carType);
        System.out.println("Тип топлива: " + this.fuelType);
        System.out.println("Цвет: " + this.color);
        System.out.println("Секретный код: " + this.secretCode);
    }
}


