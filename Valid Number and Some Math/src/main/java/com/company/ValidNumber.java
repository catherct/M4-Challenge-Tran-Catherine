package com.company;

import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {

        //call scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        //prompt user to enter number between 1 and 10 + convert string input to integer
        System.out.println("Please enter a number between 1 and 10.");
        String userInput = myScanner.nextLine();
        int numberEntered = Integer.parseInt(userInput);

        //while loop until valid number is entered
        while (numberEntered > 10 || numberEntered <= 0) {
            System.out.println("You must enter a number between 1 and 10. " +
                    "Please try again.");
                userInput = myScanner.nextLine();
                numberEntered = Integer.parseInt(userInput);    /* invalid numbers will keep while loop running,
                                                                    valid numbers will direct user to end message */
        }

        //print number and exit
        System.out.println("You have entered " + numberEntered + ".");

    }
}
