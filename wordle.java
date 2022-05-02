import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class wordle{
  static Scanner input = new Scanner(System.in);
  final static String word_of_day = "blob";
  static String[] solution = new String[] {"_","_","_","_"};
  static final String[] ALPHABET = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
  static final String[] user_ALPHABET = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
  
  
  public static void main(String [] args){
    int guessCount = 0;
    while(guessCount < 6){
      guessCount++;
      String userGuess = guess(guessCount);
      char[] guessAsChar = guessToChar(userGuess);
      evaluateGuess(guessAsChar(userGuess));
      printInfo(solution,user_ALPHABET);
      System.out.println("--------------------");
      
      if(checkSolution()){
       break; 
      }
    }if(checkSolution()){
     System.out.println("Goodjob!"); 
    }else{
      System.out.println("Oh, no, you ran out of guesses");
    }
  }
  public static String guess(int guess){
    System.out.println("Guess Number " + guess);
    String userInput = Input.nextLine();
    while(userInput.length() != 5){
      System.out.println("Error, need 5 letter guesses.");
      userInput = Input.nextLine();
    }
    if(userInput.length() == 5){
     return guess;
    }
    
  }
  
  
}
  
    
    
