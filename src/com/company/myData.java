package com.company;

import java.net.SocketOption;
import java.util.Scanner;

public class myData {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        System.out.println("Какую задачу хочешь посмотреть? Введи число от 1 до 3");
        int taskNumber = concole.nextInt();



        if (taskNumber == 1){
            String firstName = "Anna";
            String surname = "Maevskaya";
            String job = "QA Automation Engineer";
            String fullinfo = String.format("My name is %s %s, I'm working as %s", firstName, surname, job);
            System.out.println(fullinfo);
        }
        if (taskNumber == 2){
            System.out.println("Какие значения хочешь увидеть? Введи min, max или simple.");
            String question = concole.nextLine();

            String minAnswer = "min";
            String maxAnswer = "max";
            String simpleAnswer = "max";
            if (question.equalsIgnoreCase(minAnswer)){
                byte minByte = Byte.MIN_VALUE;
                short minShort = Short.MIN_VALUE;
                long minLong = Long.MIN_VALUE;
                float minFloat = Float.MIN_VALUE;
                char minChar = Character.MIN_VALUE;
                int minInt = Integer.MIN_VALUE;
                double minDouble = Integer.MIN_VALUE;
                System.out.println (minByte);
                System.out.println (minShort);
                System.out.println (minFloat);
                System.out.println (minChar);
                System.out.println (minLong);
                System.out.println (minInt);
                System.out.println (minDouble);
            }
            if (question.equalsIgnoreCase(maxAnswer)){
                byte maxByte = Byte.MAX_VALUE;
                short maxShort = Short.MAX_VALUE;
                long maxLong = Long.MAX_VALUE;
                float maxFloat = Float.MAX_VALUE;
                char maxChar = Character.MAX_VALUE;
                int maxInt = Integer.MAX_VALUE;
                double maxDouble = Integer.MAX_VALUE;
                System.out.println (maxByte);
                System.out.println (maxShort);
                System.out.println (maxLong);
                System.out.println (maxFloat);
                System.out.println (maxChar);
                System.out.println (maxInt);
                System.out.println (maxDouble);
            }
            if (question.equalsIgnoreCase(simpleAnswer)){
                String exampleString = "это строка!";
                boolean exampleBoolean = true;
                System.out.println (exampleString);
                System.out.println (exampleBoolean);
            }
            else {
                System.out.println("Неверный ввод!");
            }

        }
        if (taskNumber == 3){
            String capsule = "This is my string";
            String anotherCapsule = new String();

            String testEmpty = "        ";
            testEmpty.isEmpty();

            String lengthCheck = "This is my string";
            lengthCheck.length();

            String likeChar = "This is my string";
            likeChar.charAt(6);

            String booleanCheck = "This is my string, there are many like it but this one is mine";
            boolean startsWithThis = booleanCheck.startsWith("This");
            boolean startsWithMyOffset8 = booleanCheck.startsWith("my", 8);

            String endString = "This is my string, there are many like it but this one is mine";
            boolean endsWithMine = endString.endsWith("mine");

            String containString = "This is my string, there are many like it but this one is mine";
            boolean containsMany = containString.contains("many");

            String concatString = "This is my string, there are many like it but this one is mine";
            String newString = concatString.concat(". The end");

            String meowString = "This is my string, there are many like it but this one is mine";
            String replaceString = meowString.replace('r', 'a');
            String newerString = meowString.replace("re", "");

            String bigString = "This Is My String, There Are Many Like It But This One Is Mine";
            String myStringInLowerCase = bigString.toLowerCase();
        }


        else {
            System.out.println("Введите другое число");
        }



    }

}
