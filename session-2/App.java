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



    public static void main(String[] args) {

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
        for (int num : numArr) {
            System.out.println(num);
        }


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
        Animal myAnimal = new Animal(); 
        myAnimal.speak(); 
    }

}

/**
 * 
 *  https://www.baeldung.com/java-run-jar-with-arguments
 * 
 */
