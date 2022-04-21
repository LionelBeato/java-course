import java.util.Optional;

/**
 * 
 * In the world of Java, everything lives inside a class
 * 
 */

 public class Main {
    // ... is the rest operator (varargs), allowing our main function to take in
    // an indefinite amount of arguments
    public static void main(String... args) {
    
        System.out.println("Hello world!"); 


        for (String arg : args) {
            System.out.println("Hello " + arg); 
        }

    }
 }