package exe_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Manoj");
        String s2 = new String("Karra");
        // 2 strings created, in Heap
        String s3 = s1;
        // 2 only created as s3 is pointing to s1 in Heap
        System.out.println(s1);
        System.out.println(s3);
    }
}
