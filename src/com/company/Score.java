package com.company;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        System.out.println("Please enter your score");
        int score = new Scanner(System.in).nextInt();
        while (score > 100 || score < 0) {
            System.out.println("Enter another number");
            score = new Scanner(System.in).nextInt();
        }
        if (score >= 70) {
            System.out.println("Congratulations!");

        } else
            System.out.println("Not passed");
    }
}


