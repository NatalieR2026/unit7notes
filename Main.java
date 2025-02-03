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

      // 7.2: ArrayList METHODS
      // after "new", make call to the CONSTRUCTOR
      ArrayList<String> toBuy = new ArrayList<String>();

      // .add(obj) appends obj to END OF LIST
      toBuy.add("apples");
      toBuy.add("pomegranate");
      toBuy.add("dots pretzels");
      toBuy.add("mochi");
      System.out.println("Shopping List: ");
      System.out.println(toBuy);

      // .size() returns int -> number of items
      System.out.println(toBuy.size() + " things left to buy!");

      // .add(int index, obj) -> "INSERT" at index
      toBuy.add(0, "green apples");
      System.out.println(toBuy);
      // ALSO shifts over elements from that index on

      // .get(int index) returns an object of the same type as the list holds
      // like array[int index]
      int lastIndex = toBuy.size() - 1;
      String lastElemenet = toBuy.get(lastIndex);
      System.out.println(lastElemenet);
      System.out.println(toBuy.get(3));

   }
}
