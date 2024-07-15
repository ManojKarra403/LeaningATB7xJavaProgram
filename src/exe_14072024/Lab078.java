package exe_14072024;

import java.util.Locale;

public class Lab078 {
    public static void main(String[] args) {
        String password = "Manoj@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        //pass_u == password
        System.out.println(pass_u == password);//checks ref
        System.out.println(pass_u.equals(password)); //checks conet
        System.out.println(pass_u.equalsIgnoreCase(password));  //checks content ignoring cases
        System.out.println(password.indexOf('j'));
        System.out.println(password.substring(0,6));
        System.out.println(password.length());





    }
}
