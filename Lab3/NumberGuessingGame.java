package Lab3;
/*
 * Number Guessing Game
 * This program can tries to guess number 5 times
 * between number 1 to 20
 * The output is
 * Welcome to a number guessing game!
 * Enter an integer between 1 and 20:
 * 
 * Name: Phornphatsorn Chitladaphorn
 * Student ID: 663040656-7
 * Sec:1
 */


import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min =1 ;
        int max =20;
        int attemps = 0;
        int answer = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("Welcome to a number guessing game!");
        while (attemps < 5) {
            System.out.print("Enter an integer between 1 and 20:");
            int guess = scanner.nextInt();
            attemps = attemps + 1;
            if (guess > answer){
                System.out.println("Try a lower number!");
            } else if (guess < answer){
                System.out.println("Try a higher number!");
            } else if (guess == answer){
                System.out.println("Congratulations!");
           
            if (attemps == 1){
                System.out.println("You have tried "+attemps+" time" );
            } else {
                System.out.println("You have tried "+attemps+" times");
            }
             System.exit(0);
            }
        
        
        }
        scanner.close();
    System.out.println("You have tried 5 times. You ran out of guesses");
    System.out.println("The answer is "+answer);
        
    }
    
}
