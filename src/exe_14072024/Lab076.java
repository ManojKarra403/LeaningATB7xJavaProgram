package exe_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        //String s1 = "p r a m o d";
        // /0/1/2/3/4/5/
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat(" Dutta"); // concatenated and pointing to same string inside the SCP Pool
        System.out.println(s1);
    }
}
