import java.util.*;
public class MoreFunctionPractice {
    
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){
        /*
         * #1 name to initials
         */ 
        String initials = nameToInitials("Robert", "Daniels");
        String email = initials + "@xula.edu";
        System.out.println("email is " + email);
        
        /*
         * #2 graph a percentage
         * i.e. show what 40% of 60 looks like
         *      or 25% of 40
         */
        graphAPercent(40,60);
        graphAPercent(25,40);
        graphAPercent(75,60);
        graphAPercent(100,60);
         
    }
    
    static String nameToInitials(String firstName, String lastName) {
        String firstInitial = "";
        firstInitial = firstInitial + firstName.charAt(0);
        String secondInitial = "";
        secondInitial = secondInitial + lastName.charAt(0);
        return firstInitial + secondInitial;
    }
    
    static void graphAPercent(int percent, int value) {
        int numStars = (int)(percent / 100.0 * value); // typecast
        int numDashes = value - numStars;
        for (int n = 1; n <= numStars; n++) {
            System.out.print("*");
        }
        for (int n = 1; n <= numDashes; n++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
}