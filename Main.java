// Import the ArrayList CLASS
// (from the java.util PACKAGE)
import java.util.ArrayList;

public class Main {

   // Return index of target
   public static int binarySearch(ArrayList<Integer> list, int target) {
      // Set up "search area" bounds
      int left = 0;
      int right = list.size() - 1;

      while (left <= right) {
         // Set up a new "middle" each iteration
         int middle = (left + right) / 2;
         // Compare middle to target
         if (target < list.get(middle)) {
            right = middle - 1;
         }
         else if (target > list.get(middle)) {
            left = middle + 1;
         }
         else {
            return middle; // found target
         }
      }

      // Return -1 if target is not found in list
      return -1;
   }

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
      toBuy.add("pomegranate seeds");
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

      // .set(int index, obj) REPLACES element at that index with the new obj
      // returns the replaced element (same type as the list holds)
      String replacedElement = toBuy.set(1, "face cream");
      System.out.println(toBuy);
      // Often, you won't need to store the return output
      toBuy.set(2, "pomegranate"); // like calling a VOID method
      System.out.println(toBuy);

      // .remove(int index) DELETES element at that index
      // returns the removed object (same type as the list holds)
      String removedElement = toBuy.remove(0);
      System.out.println(toBuy);
      System.out.println("Moved to shopping cart: " + removedElement);
      // ALSO shifts all remaining elements to the left (lower index)
      // often, you won't need to actually store the removed item
      toBuy.remove(3);
      System.out.println(toBuy);
      System.out.println("---");
      // 7.3 Traversing with Loops
      ArrayList<Integer> bingoNumbers = new ArrayList<Integer>();
      bingoNumbers.add(99);
      bingoNumbers.add(29);
      bingoNumbers.add(77);
      bingoNumbers.add(13);

      // FOR-EACH LOOP
      int total = 0;
      int product = 1;
      for (Integer num : bingoNumbers) {
         total = total + num; // same as total += num
         product *= num; // same as product = product * num
      }
      System.out.println("Sum of bingo numbers: " + total);
      System.out.println("Product of bingo numbers: " + product);

      // STANDARD FOR-LOOP (indexed)
      int sum = 0;
      // DIFFERENT from Arrays:
      // 1. use ArrayList.size() instead of Array.length
      // 2. use ArrayList.get(i) instead of Array[i]
      for (int i=0; i < bingoNumbers.size(); i++) {
         sum = sum + bingoNumbers.get(i);
      }
      System.out.println(sum);

      // WHILE LOOPS (for conditionals, when you don't know exactly how many times to loop)
      ArrayList<String> watchList = new ArrayList<String>();
      watchList.add("Traitors");
      watchList.add("Dexter");
      watchList.add("You");
      watchList.add("OBX");

      // Example: search & remove
      boolean found = false; // haven't searched yet
      int index = 0;
      String watchedShow = "You";
      // loop while current index is still less than list size
      while (index < watchList.size()) {
         if (watchedShow.equals(watchList.get(index))) {
            watchList.remove(index);
            found = true;
         }
         else {
            index++;
         }
      }
      System.out.println(watchList);




      System.out.println("---");

      // Testing BINARY SEARCH method on a SORTED list
      ArrayList<Integer> gradeLevels = new ArrayList<Integer>();
      // Populate a list using a loop
      for (int i = 0; i <= 12; i++) {
         gradeLevels.add(i);
      }
      System.out.println("Grade Levels: " + gradeLevels);
      int indexOfTarget = binarySearch(gradeLevels, 11);
      System.out.println("Index of Target: " + indexOfTarget);








      /*
      // PRACTICE: Translate Array actions to ArrayList actions
      ArrayList<String> toDoList = new ArrayList<String>();
      toDoList.add("Do homework");
      toDoList.add("Help make dinner");
      toDoList.add("Call grandma");
      System.out.println(toDoList);
      toDoList.set(1, "Order pizza");
      System.out.println(toDoList);
      System.out.println(toDoList.size() + " things to do!");
      System.out.println("First thing to do: " + toDoList.get(0));
      toDoList.remove(0);
      System.out.println(toDoList);
      */

   }
}
