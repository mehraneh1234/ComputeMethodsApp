
package computemethods.java;
import java.util.Scanner;
/**
 * Mehraneh Hamedani
 * @author 30062786
 * AT2- Activity6
 */
public class ComputeMethodsApp {
      public static void main(String[] args) {
        try{
            // Define an object of scanner to allow users enter keyboard input
            Scanner sc = new Scanner(System.in);
            // Create an object of ComputeMethodsJava class
            ComputeMethodsJava computeMethods = new ComputeMethodsJava();
            // Display "Enter Fareheit: "
            System.out.println("Enter Fareheit: ");
            //Scanner lineSc = new Scanner(sc.next());
            // if type of input is double then
            if (sc.hasNextDouble()){
                // keyboard value assigns to attribute degreesF
                double degreesF = sc.nextDouble();
                // Call methods of other class then assign it to a variable
                double celsius = computeMethods.fToC(degreesF);
            // Display Temp ... (Farenheit) in Celsius is " with 4 decimal point 
            // shows the output of the method fToC with the input of degreesF
                System.out.println("Temp " + String.format("%.1f",
                        degreesF) + " (Farenheit) in Celsius is " 
                        + String.format("%.4f",celsius));
            }
            else{
                // Display "You did not enter a number!"
                System.out.println("You did not enter a number!");
            }
            // Define two variables
            int legA = 0;
            int legB = 0;
            // Display "Enter Width of the triangle: "
            System.out.println("Enter Width of the triangle: ");
           // Scanner lineSc1 = new Scanner(sc.next());
           // if input's type is integer
            if (sc.hasNextInt()){
            // keyboard value assigns to legA
                legA = sc.nextInt();
            }// if input's type is double
            else if (sc.hasNextDouble()){
                // keyboard value assigns to d
                double d = sc.nextDouble();
                // Cast keyboard value to int then assign it to legA
                legA = (int)d;
                // Display "Your number .... is round to ...
                System.out.println("Your number " +d 
                        +" is round to " +legA );
            }
            else{ // If user enters a character or string number
                // Display "You did not enter a number! "
                System.out.println("You did not enter a number!");
            }
            // Display "Enter Height of the triangle: "
            System.out.println("Enter Height of the triangle: ");
            //Scanner lineSc2 = new Scanner(sc.next());
            // If user's input is an integer number
            if (sc.hasNextInt()){
                // keyboard value assigns to legB
                legB = sc.nextInt();
            }// If user's input is a double number
            else if (sc.hasNextDouble()){
                // Assign a keyboard number to a variable
                double d = sc.nextDouble();
                // Cast the variable to int then assign it to other variable
                legB = (int)d;
                // Display Your number ... is round to ...
                System.out.println("Your number " +d 
                        +" is round to " +legB );
            }
            else{// If user's input is not an integer or a double
                // Display "You did not enter a number! "
                System.out.println("You did not enter a number!");
            }// Call a method of other class then assign its value to a variable
            double hypotenuse = computeMethods.hypotenuse(legA, legB);
            // Display the result of the method hypotenuse with two inputs legA 
            // and legB with 15 decimal point.
            System.out.println("Hypotenuse of the triangle is " + 
                    String.format("%.15f", hypotenuse));
            // Call a method of other class then assign its value to a variable
            int sum = computeMethods.roll();
            // Display "The sum of two dices values is ...
            System.out.printf("The sum of two dices values is %d\n", 
                    sum);
            sc.close();

        }
        // If an error occurs displays "Please enter a number!"
        catch(Exception e){
           System.out.println("Please enter a number! ");
        }
        
       
    }
}
