package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String enterData = new String();
        String exit = "Exit";
        while (!enterData.equalsIgnoreCase(exit)) {
            System.out.println("Please enter something");
            enterData = console.nextLine();
        }
    }
}
