// Import the ArrayList CLASS
// (from the java.util PACKAGE)
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // DECLARE an ArrayList object
      // <Type> is required, each ArrayList can hold one type of object
      ArrayList<String> buzzwords;

      // DECLARE & CREATE an ArrayList
      // by calling the CONSTRUCTOR
      ArrayList<String> shoppingList = new ArrayList<String>();

      // ArrayLists can ONLY STORE OBJECTS!
      // so for int and double (primitive types)
      // you must use their WRAPPER CLASSES
      // Integer and Double "wrap" primitives into OBJECTS
      // objects have methods, primitives don't
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Double> testScores = new ArrayList<Double>();
      // Java will handle the "wrapping" for you
      // this is called AUTOBOXING

      // Use the .add( obj ) METHOD to populate/fill list
      testScores.add(40.00); // double gets wrapped into Double
      System.out.println(testScores); // prints [40.0]
   }
}
