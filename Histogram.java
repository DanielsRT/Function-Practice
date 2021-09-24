import java.util.*;
public class Histogram {   
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Welcome to Histogram!");
        
        System.out.print("Enter the numbers of A's,B's,C's,D's, and F's: ");
        int num_a = keyb.nextInt();
        int num_b = keyb.nextInt();
        int num_c = keyb.nextInt();
        int num_d = keyb.nextInt();
        int num_f = keyb.nextInt();
        
        printLine(num_a,'A'); // Call statement with two arguments
        printLine(num_b,'B');
        printLine(num_c,'C');
        printLine(num_d,'D');
        printLine(num_f,'F');
    }
    static void printLine(int num,char symbol) { // function "header"
        for (int n = 1; n <= num; n++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}