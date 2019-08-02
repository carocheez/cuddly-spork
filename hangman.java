
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
    String [] words = {"mime", "cuddly", "spork" , "library" , "park" , "bagel"}; 
    int rand_word = (int)(Math.random()*2); 
    
    String word = words[rand_word];  
    System.out.println(word);

    StringBuffer s = new StringBuffer(""); 

    for (int i = 0; i < word.length(); i++) {
      s.append("*"); 
    }  
    System.out.println(s);

  int lives = 5;
  while (lives > 0) {

    if (s.indexOf("*") != -1) {
  
    System.out.println("Guess a letter!");
    
    String user_guess = in.nextLine(); 

    // System.out.println(user_guess);
    
    /**
    word: mime
    if user guesses m 
    arrayList: [0, 2]
    word: spork
    guesses s
    arrayList: [0]

    empty ArrayList --> guess is wrong

    **/

    ArrayList <Integer> indices = new ArrayList<Integer>(); 

    int index = word.indexOf(user_guess);
    while (index >= 0) {
      indices.add(index); 
      index = word.indexOf(user_guess, index + 1);
    }
    //mime, user guesses m
    //indices = [0, 2]
    //s.get()
    if (indices.isEmpty()){
      System.out.println("Incorrect guess");
      lives -= 1; 
      System.out.println("You have " + lives + " remaining lives."); 
      if (lives == 0) {
        System.out.println("Game over!");
        System.out.println("The word was " + word + "!");
      }
    }
    else {
      for (int i = 0; i < indices.size(); i++) {
        s.replace(indices.get(i), indices.get(i) + 1, user_guess); 
      }
    }
    
    System.out.println(s);

    } // end of the if loop
    else {
      System.out.println("You won!!!");
      lives = 0;
    }
    
 }
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

