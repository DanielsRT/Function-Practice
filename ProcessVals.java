import java.util.*;
public class ProcessVals {
    
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){
        
        processIndefiniteNumberOfValues();
        
    }
    static void processIndefiniteNumberOfValues() {
        int count = 0;
        System.out.println("Enter values:");
        int value = keyb.nextInt();     
        while (value >= 0) {
            count++;
            value = keyb.nextInt();
        }
        System.out.println("You entered " + count + " values");
    }
}