package com.company;

import java.util.Scanner;

public class remoteController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] channelNames = {"First Channel", "Second Channel", "Third Channel"};
        System.out.println("Enter channel number: ");
        int channelNumber = scanner.nextInt();
        if (channelNumber == 0) {
            System.out.println("Exit the program");
        } else if (channelNumber > channelNames.length) {
            System.out.println("There is no such channel");
        } else {
            System.out.println(channelNames[channelNumber - 1]);
        }
    }
}
