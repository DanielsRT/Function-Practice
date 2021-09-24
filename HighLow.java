import java.util.*;
public class HighLow {
    
        /*
     * Hi-Lo Game Subtasks
    •	Repetition 2: repeat as long as the guess isn't right
     */
    
    static Scanner keyb = new Scanner(System.in);
    static Random rand = new Random();
    
    public static void main(String[] args){
        System.out.println("Welcome to the High Low game!");
        
        String again = "";
        do {
            playOnce();
            
            System.out.print("Do you want to play again? ");
            again = keyb.nextLine();
        } while (!again.equals("no"));
        
        
        System.out.println("Thanks for playing the High Low game!");
    }
    
    static int collectUserGuess() {
        System.out.print("Guess a number between 1 - 100: ");
        int userGuess = keyb.nextInt();
        keyb.nextLine(); // consume the trailing newline
        //int userGuess = Integer.parseInt(keyb.nextLine());
        return userGuess;
    }
    
    static void playOnce() {
        int target = makeNewTarget();
        // System.out.println("Target is " + target); // temporary
        int userGuess = 0;
        int guessCount = 0;
        while (userGuess != target) {
          guessCount++;
          userGuess = collectUserGuess();
          tellHigherOrLower(userGuess,target);  
        }
        System.out.println("You needed " + guessCount + " guesses.");
    }
    
    static void tellHigherOrLower(int userGuess, int target) {
        if (userGuess < target) {
            System.out.println("Target is higher");
        } else if (userGuess > target) {
            System.out.println("Target is lower");
        } else if (userGuess == target) {
            System.out.println("Correct!");
        }
    }
    
    static int makeNewTarget() {
        return rand.nextInt(100) + 1;
    }
      
}