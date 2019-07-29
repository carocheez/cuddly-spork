
/**
Plan of attack
1. create an array of words 
2. generate random word from array with corresponding number of blanks presented to user
3. user guesses a letter. if word contains letter, fill in the letters in the blanks. if word does not contain letter, tell user to guess again. user cannot guess the same letter twice.
4. user guesses until all word s
**/
import java.util.*;
import java.util.Random;
import java.io.*; 

class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String [] words = {"knife", "spork", "fiesta"}; 
    int rand_word = (int)(Math.random()*2); 
    
    String word = words[rand_word];  
    System.out.println(word);

    StringBuffer s = new StringBuffer(""); 
    for (int i = 0; i < word.length(); i++) {
      s.append("*"); 
    }  
    System.out.println(s);
    System.out.println("Guess a letter!");
    
    String user_guess = in.nextLine(); 

    System.out.println(user_guess);
    
    int num = word.indexOf(user_guess);

    if (num > -1) {
      s.replace(num, num+1, user_guess); 
    }
    
    System.out.println(s);


    //StringBuffer replace(int startIndex, int endIndex, String str)

/**
    word = spork
    you guess "s"
    word.indexOf("s") ==> 0
    num = 0
    Before: s was *****
    s.replace(0, 1, "s")
    After: s is s****
**/
    
  
    
    
    
  }

}

