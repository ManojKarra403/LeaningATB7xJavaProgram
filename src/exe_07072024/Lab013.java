package exe_07072024;

public class Lab013 {
    // Question : Can we run witout a main() method?

    public static void main(String[] args) {
        System.out.println("This should only run");
        //you can even write like static public void main() instead of psvm()
        //Only void should be used for main(), otherwise JVM won't get it.....!
    }

    public static void main() {
        System.out.println("Manojjjjj");
        /*Now we have 2 main() functions in this code.
        * But JVM considers only the FIRST main()
        * Other main() methods won't be part of execution even when ran*/


    }
}
