//the Number Guessing Game

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int guess, attempts = 5, tens;

        int RandomNum = random.nextInt(100) + 1;
        tens = (RandomNum / 10) * 10;
        System.out.println("Welcome to The Guessing Game!!!");
        System.out.println("You have 5 attempts to guess the number,....");
        System.out.println();
        for (int iteration = 5; iteration >= 1; iteration--) {
            attempts--;
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            int guessTens = (guess / 10) * 10;

            if (guessTens < tens) {
                System.out.println("Your number is smaller..... you have " + attempts + " attempts left");
                if (attempts == 0) {
                    break;
                }
                System.out.print("Do you want any hint (attmpts?? (yes/no): ");
                String choice = input.next().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.println("The number lies in " + tens + " 's..");
                    attempts = attempts - 1;
                    System.out.println("Now you have " + attempts + " left....");
                    continue;
                } else {
                    System.out.println("Okay try to think much greater number.. you have " + attempts + " attempts");
                    System.out.println();
                }
            }

            else if (guessTens > tens) {
                System.out.println("Your number is greater..... you have " + attempts + " attempts left");
                if (attempts == 0) {
                    break;
                }
                System.out.print("Do you want any hint (attmpts?? (yes/no): ");
                String choice = input.next().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.println("The number lies in " + tens + " 's..");
                    attempts = attempts - 1;
                    System.out.println("Now you have " + attempts + " left....");
                } else {
                    System.out.println("Okay try to think much smaller number.. you have " + attempts + " attempts");
                    System.out.println();
                }
            }

            else if (guessTens == tens) {
                if (attempts == 0) {
                    break;
                }
                if (guess < RandomNum) {
                    System.out.println(
                            "You are too close think some greater one......you have " + attempts + " attempts left");
                    System.out.println();
                } else if (guess > RandomNum) {
                    System.out.println(
                            "You are too close think some smaller one......you have " + attempts + " attempts left");
                    System.out.println();
                } else {
                    System.out.println("Congratulations!! You have Guessed the Number....");
                    break;
                }
            }

        }
        if (attempts == 0) {
            System.out.println("You lose.... The actual number was : " + RandomNum);
        }
    }
}
