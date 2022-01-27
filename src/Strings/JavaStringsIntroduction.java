package Strings;

import java.util.Locale;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();

        System.out.println(A.length() + B.length());
        String result = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(result);

        A = A.substring(0, 1).toUpperCase(Locale.ROOT) + A.substring(1);
        B = B.substring(0, 1).toUpperCase(Locale.ROOT) + B.substring(1);

        System.out.println(A + " " + B);
    }
}
