package com.pluralsight;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*
        System.out.print("Hello ");
        System.out.println("Raymond");  // when use print without ln it stays on same line
        System.out.println("===========================================");

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println(totalDue);


        // 1 - we create the formatted String
        String formattedTotalDue = String.format("%.2f", totalDue);
        // 2 - we print it
        System.out.println("Total due is: " + formattedTotalDue);
        System.out.println("============================================");

        // 1 - We format the string and we print it immediatiely
        System.out.printf("Total due is: $%.2f", totalDue);
        System.out.println();
        System.out.println("==================================");

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.779f;

        System.out.printf("%s (id:%d) $%.2f", name , id, pay);

         */

        /*
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name: ");
        String name = myScanner.nextLine();

        System.out.println("Hello Everyone, I am " + name + " and I love Potatoes!");

        System.out.println("==================================");

        System.out.println("Please Enter a Number: ");
        int firstNumber = myScanner.nextInt();
        firstNumber++;
        System.out.println("The updated number is: " + firstNumber);

         */

        /*
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = myScanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = myScanner.nextInt();
        myScanner.nextLine(); // Consume the extra space in the memory

        int result = firstNumber + secondNumber;
        System.out.println("The result is: " + result);

        System.out.println("Which operation would you like to do next?");
        String operation = myScanner.nextLine();

        System.out.println("The new operation is: " + operation);

        myScanner.close();

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        /*
        if (age > 25) {
            System.out.println("You are allowed to drink!");
        } else {
            System.out.println("You are not allowed to drink!");
        }

         */

        /*
        double price;

        if (age <= 18) {
            price = 22.50;
        } else if (age <= 65) {
            price = 30.50;
        } else {
            price = 25.00;

        }

        System.out.println("The price is: " + price);
        */

        /*
        double price;
        if (age < 18 || age >= 65) {
            price = 18.00;
        } else {
            price = 25.00;
        }

        System.out.println("The price is: " + price);

         */

        /*
        double price = (age < 18) ? 22.50 : 25.00;

        System.out.println("The price is: " + price);

         */

        /*
        if (name.equals("Raymond")) {
            System.out.println("I love Potatoes!");
        } else {
            System.out.println("I don't love Potatoes!");

         */
        }
    }
}
