package exe_14072024;

import java.sql.SQLOutput;
import java.util.SplittableRandom;

public class Lab074 {
    public static void main(String[] args) {
        String name = "Testing Academy"; // SCP
        String name1 = "Testing Academy";// SCP
        //Both name and name1 are pointing to a single string value in SCP
        // SCP contains unique value data.
        String name2 = new String("Testing Academy");
        //System.out.println(name == name1); // == checks for the referencing
        //System.out.println(name.equals(name1)); // equals checks for the content/values inside strings

        System.out.println(name1 == name2); //checks for reference one is in SCP and one is in Heap
        System.out.println(name1.equals(name2)); // checks for content
    }
}
