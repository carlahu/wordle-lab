import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class wordle{
  static Scanner input;
  final String word = blob;
  
  public String userGuess(int guessNumber){
    Scanner input1 = new Scanner(System.in);
        System.out.println("What is your guess?");
        String myAnswer = input1.nextLine();
        return myAnswer;
  }
  
  public Character[] convertAnswer(String s){
    if (s == null) {
        return null;
    }
    Character[] array = new Character[s.length()];
    for (int i = 0; i < s.length(); i++) {
        array[i] = new Character(s.charAt(i));
    }
    return array;
  }
  
  
  public static void main(String [] args){
    List<String> arr = new ArrayList<>();
    arr.add("A");
    arr.add("B");
    arr.add("C");
    arr.add("D");
    arr.add("E");
    arr.add("F");
    arr.add("G");
    arr.add("H");
    arr.add("I");
    arr.add("J");
    arr.add("K");
    arr.add("L");
    arr.add("M");
    arr.add("N");
    arr.add("O");
    arr.add("P");
    arr.add("Q");
    arr.add("R");
    arr.add("S");
    arr.add("T");
    arr.add("U");
    arr.add("V");
    arr.add("W");
    arr.add("X");
    arr.add("Y");
    arr.add("Z");
    
    
  }
}
  
    
    
