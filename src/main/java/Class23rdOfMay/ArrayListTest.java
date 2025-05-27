package Class23rdOfMay;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); //dynamic
        int[] numbers2 = new int[10]; // classic array

        numbers.add(10); // this is how to add stuff to an ArrayList
        numbers2[0] = 10; // this is how to add stuff to a classic Array. Works because it's a generic datatype.

        for (int i = 0; i < numbers.size(); i++) { // ArrayLists don't use .length -- they use .size!
            System.out.println(numbers.get(i)); // using get, since the ArrayList uses a wrapper class. Not generic.
        }
        System.out.println(numbers.remove(4)); // remember to make sure to check whether you're -
                                                        // removing an object or an integer.

        List<Integer> nums = new ArrayList<>(); // komt veel voor, is een List<Integer> is een generiekere versie, is flexibeler

        ArrayList<ArrayList<Integer>> dimensie2 = new ArrayList<>(); // also possible, to make a 2nd dimension etc.
    }
}
