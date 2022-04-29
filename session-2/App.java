/**
 * 
 * topics:
 * - standard features
 * - functions
 * - data types
 * - objects
 * - jar
 * 
 */

public class App {

    /**
     * 
     * Below is a function
     * functions allow you to encapsulate
     * and reuse blocks of code  
     * 
     */
    public static void printHello() {
        System.out.println("Hello from a function!");
    }

    public static int addTwoNumbers(int x, int y) {
        return x + y; 
    }





    public static void main(String[] args) {

        // var myString = "hello"; 
        String myString = "hello"; 
        char myChar = 'h'; 
        int myInt = 5; 
        long myLong = 50000000;
        float myFloat = 2.5f; 
        double myDouble = 2.5; 

        printHello();
        System.out.println(addTwoNumbers(5, 10));

        /**
         * 
         * Java supports standard programming features such as
         * arithmetic, flow control, and error handling 
         * 
         * While these are important, 
         * they wont be the focus of this course 
         * 
         */


        /**
         * 
         * An array, or collection, of numbers
         * 
         */
        int[] numArr = {1,2,3,4,5}; 

        /**
         * 
         * Standard for loop
         * read it like so:
         * "for every number in my number Array...
         * ...print out that number's value"
         * 
         * 
         */
        // for (int num : numArr) {
        //     System.out.println(num);
        // }


        /**
         * 
         * Below we are _instatiating_ an Animal, 
         * thus creating an Animal _instance_
         * 
         * notice how we used "Animal" in place of "var"
         * this is its _type_
         * 
         * there are many different types in the Java ecosystem,
         * in truth countless. The reason? Every class defines a type. 
         * 
         */
        // Animal myAnimal = new Animal(); 
        // myAnimal.speak(); 

        Animal myAnimal = new Animal(); 
        myAnimal.speak(); 

    }

}



/**
 * 
 *  https://www.baeldung.com/java-run-jar-with-arguments
 * 
 */
