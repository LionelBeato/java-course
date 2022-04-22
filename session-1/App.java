// topics covered:
// - writing a java file
// - writing a java class
// - writing the main function
// compiling
// running the code


// this is a class
// a class represents a discrete bundle of code
// there's  more to classes than that, but for right now that's how we'll think of it
public class App {

    // this is the entrypoint
    // this is where java starts our program
    public static void main(String... args) {

        // below is a variable
        // it's a construct that holds a value
        // greeting is the "name" of the variable, I call it a reference
        // "Hello Sebastian!" is the value of the variable
        var greeting = "Hello Sebastian!"; 
        System.out.println(greeting);        
    }
}

// use the command "javac App.java" to compile
// the previous command generates a file called App.class
// use the command "java App" to run the program