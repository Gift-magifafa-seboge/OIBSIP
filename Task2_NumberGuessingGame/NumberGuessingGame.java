package Task2_NumberGuessingGame;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
       
         System.out.println("==========Number Guessing Game==========");
         System.out.println("Guess a number between 1 to 1000");

         Scanner input = new Scanner(System.in);
         int guess = input.nextInt();

         System.out.println("This is your guess:" + guess);
 }

   


    
}
