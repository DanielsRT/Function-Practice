import java.util.*;

public class FunctionPractice { 
        
    public static void main(String[] args){
        System.out.println("Welcome to Function Practice");
        
        // Input Section
        double fahr = getTemperatureInFahrenheit(); // "Call" statement
        
        // Calculations
        double cels = convertToCelsius(fahr); // "Call" statement, with an argument
        
        // Output Section
        showResults(fahr,cels);
        
        System.out.println("Thanks for using Function Practice");
    }
    
    static void showResults(double fahr, double cels) {
        System.out.printf("%.1f degrees F is %.1f degrees C\n",
                         fahr, cels);
    }
    
    static double convertToCelsius(double fahr) { // function with a parameter
        double c_equiv = 5.0/9.0 * (fahr - 32);
        return c_equiv;
    }
    
    static double getTemperatureInFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fahrenheit temp: ");
        double f = sc.nextDouble();
        return f;
    } 
}