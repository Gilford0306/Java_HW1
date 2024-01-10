import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задание 1

        System.out.println("Your time is limited, so");
        System.out.println("don’t waste it living someone else’s life");
        System.out.println("Steve Jobs ");
        // Задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double numb = scanner.nextDouble();
        System.out.println("\"Enter percentage ");
        double perc = scanner.nextDouble();
        double res = (perc/100)*numb;
        System.out.println("Result: " + res+"%");
        // Задание 3


        System.out.print("Enter the first digit: ");
        int digit1 = scanner.nextInt();
        System.out.print("Enter the second digit: ");
        int digit2 = scanner.nextInt();
        System.out.print("Enter the third digit: ");
        int digit3 = scanner.nextInt();
        int combinedNumber = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("Generated number:" + combinedNumber);

        // Задание 4

        System.out.print("Enter a six-digit number:");
        int number = scanner.nextInt();
        if (number < 100000 || number > 999999) {
            System.out.println("Error: Enter a six-digit number.");
        } else {
            digit1 = number / 100000;
            digit2 = (number / 10000) % 10;
            digit3 = (number / 1000) % 10;
            int digit4 = (number / 100) % 10;
            int digit5 = (number / 10) % 10;
            int digit6 = number % 10;

            int temp = digit1;
            digit1 = digit6;
            digit6 = temp;

            temp = digit2;
            digit2 = digit5;
            digit5 = temp;

            int resultNumber = digit1 * 100000 + digit2 * 10000 + digit3 * 1000
                    + digit4 * 100 + digit5 * 10 + digit6;
            System.out.println("Generated number:" + resultNumber);
        }



        // Задание 5
        System.out.print("\"Enter the month number (from 1 to 12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Error: Enter a month number from 1 to 12.");
        } else {
            String season;
            if (month >= 1 && month <= 2 || month == 12) {
                season = "Winter";
            } else if (month >= 3 && month <= 5) {
                season = "Spring";
            } else if (month >= 6 && month <= 8) {
                season = "Summer";
            } else {
                season = "Autumn";
            }

            System.out.println("Seazon: " + season);
        }
        // Задание 6
        System.out.print("Enter the number of meters:");
        double meters = scanner.nextDouble();
        System.out.println("Select the unit of measurement to convert:");
        System.out.println("1. Miles");
        System.out.println("2. Inches");
        System.out.println("3. Yards");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                double miles = meters * 0.000621371;
                System.out.println("Result of conversion in miles: " + miles );
                break;
            case 2:
                double inches = meters * 39.3701;
                System.out.println("Result of conversion to inches: " + inches );
                break;
            case 3:
                double yards = meters * 1.09361;
                System.out.println("Result of conversion to yards: " + yards );
                break;
            default:
                System.out.println("Error: Incorrect unit selection");
        }


        // Задание 7
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);
        System.out.println("Odd numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Задание 8
        System.out.print("Enter the beginning of the range: ");
        start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        end = scanner.nextInt();

        if (start > end) {
            System.out.println("Error: Start of range is greater than end of range.");
        } else {
            for (int i = 1; i <= 10; i++) {
                for (int j = start; j <= end; j++) {
                    System.out.print(j + "*" + i + " = " + (j * i) + "\t");
                }
                System.out.println();
            }
        }

    }
    }

