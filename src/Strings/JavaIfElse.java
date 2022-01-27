package Strings;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 &&n<=20){
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
