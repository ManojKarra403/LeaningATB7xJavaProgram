package exe_14072024;

public class Lab069 {
    public static void main(String[] args) {
        String s1 = "Manoj";
        // 1 , SCP
        s1 = "Kumar";
        // 2, SCP
        s1 = "Reddy";
        // 3, SCP
        s1 = "Manoj";
        //3 strings in total as Manoj is already available in SCP and we are re using the same and woukld be pointing to s1
        System.out.println(s1);
        // Immutability : Strings values would not change, if same reference is used, new sring would be created and existing would become a constant and keep floating n the Pool (SCP)

    }
}
