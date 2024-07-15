package exe_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("Manoj"); // stores in Heap
        String s2 = new String("Manoj"); // stores in Heap
        String s3 = new String("Manoj"); // stores in Heap

        System.out.println(s1 == s2); // checks for ref
        System.out.println(s2 == s3); // checks for ref
        System.out.println(s1.equals(s2)); //checks for content/value
        System.out.println(s2.equals(s3)); //checks for content/value

    }
}
