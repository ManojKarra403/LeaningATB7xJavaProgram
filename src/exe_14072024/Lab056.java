    package exe_14072024;
    //Implicit Casting & Explicit Casting//
    public class Lab056 {
        public static void main(String[] args) {
            byte b = 10;
            int a = b; //Implicit casting
            int a1 = (int)b; // Explicit Casting
            int age = +65; //here + is faded is it's reduntant
            System.out.println(a1);
    /*
    Examples for both type castings :
    int a = b; --> This is IMPLICIT
    int a1 = (int)b; --> This is EXPLICIT
     */
            //Narrowing
            int val = 300;
            //byte b1 = val; // Invalid Implicit casting
            byte b1 = (byte)val;
            System.out.println(b1);
        }
    }
