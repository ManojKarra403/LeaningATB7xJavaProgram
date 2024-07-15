        package exe_14072024;
        //Real example of Data loss
        public class Lab058 {
            public static void main(String[] args) {
                int course = 100;
                float gst = 18.45f;
                //int total_price = course + gst; //Implicit Narrowing
                int total_price = course + (int)gst; //Explicit Narrowing 45ps is lost here in conversion
                System.out.println(total_price);
            }
        }
