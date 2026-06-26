package Task2_NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
       
         System.out.println("==========Number Guessing Game==========");
         System.out.println("Guess a number between 1 to 1000");

         Scanner input = new Scanner(System.in);
         int guess = input.nextInt();

         System.out.println("This is your guess:" + guess);

         Random random = new Random();
         int min = 1 , max = 1000;
         int randomNumber = min + random.nextInt(max);

         //check generated number for testing
         //NB: to be removed

         System.out.println("Generated number:" + randomNumber);
 }

   


    
}
