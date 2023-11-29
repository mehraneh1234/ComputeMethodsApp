
package computemethods.java;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/**
 * Mehraneh Hamedani
 * @author 30062786
 * AT2- Activity5
 */
public class ComputeMethodsJava {

    // Converts Farenheit to Celsius
    public double fToC(double degreesF){
        // Declare and calculate celisius degree
        double degreesC;
        degreesC = 5.0 / 9 *(degreesF - 32);
        // Return the output
        return degreesC;
    }
    // Define hypotenuse method with two parameters as input and return a double 
    // output. Calculate the hypotenuse of a triangle
    public double hypotenuse(int a, int b){
        // Declare and calculate hypotenuse
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        // Return the output
        return c;
        
    }
    // Define roll method without any input but an ouput as int
    public int roll(){
        
        // Declare an integer random number between 1 and 6
        int a = (int) (Math.random()*6) + 1;
        // Declare an object of random class
        //Random rand2 = new Random();
        // Declare an integer random number between 1 and 6
        //int b = rand2.nextInt(6)+1;
        int b = (int) (Math.random() * 6) + 1;
        int sum = a + b;
        // Return output
        return sum;
    }
}
