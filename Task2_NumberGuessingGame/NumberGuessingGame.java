package Task2_NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
       
        int totalScore = 0;
        char option = ' ';

        Scanner input = new Scanner(System.in);
         System.out.println("==========Number Guessing Game==========");
        

         

         Random random = new Random();
         do{
         int min = 1 , max = 1000, attempts = 0 , maxAttempts = 10;
         int randomNumber = min + random.nextInt(max);

         

         boolean answer = false;

         while(!answer && attempts < maxAttempts)
         {
             System.out.println("Guess a number between 1 to 1000");

         
             int guess = input.nextInt();
            attempts++;
            if(guess > randomNumber)
            {
                System.out.println("Too High. Try Again!!");
            }else if(guess < randomNumber)
            {
                System.out.println("Too Low. Try Again");
            }else{
                System.out.print("Correct!You guessed the number");
                answer = true;
            }
         }
         if(!answer)
         {
            
            System.out.println("Game over!! You have used all your " + maxAttempts + " attempts");
            System.out.println("The correct answer is: " +  randomNumber);
         }else {
            
            System.out.println("You have guessed it in" + attempts + " attempts");

            int score = (maxAttempts - attempts + 1) * 10;
            if(score<0)score = 0;

            totalScore+=score;

            System.out.println("Your score" + score );
         }

         System.out.println("Do you want to play again? Y/N");
         option = input.next().charAt(0);
        }while(Character.toUpperCase(option) == 'Y');

        System.out.println("Thank you for playing!!");
        System.out.println("Your total score is:" + totalScore);


 }

   


    
}
