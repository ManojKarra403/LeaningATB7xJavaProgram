package exe_14072024;

import java.util.Scanner;

public class Temporary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the students score");

        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {

            System.out.println("A");

        }

        if (score >= 80 && score <= 90) {

            System.out.println("B");

        }
        if (score >= 70 && score <= 80) {

            System.out.println("C");

        }
        if (score >= 60 && score <= 70) {

            System.out.println("D");

        } else {

            System.out.println("E");

        }


    }
}