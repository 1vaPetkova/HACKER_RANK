package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String txt = scan.nextLine();
            try {
                Pattern pattern  = Pattern.compile(txt);
                System.out.println("Valid");
            } catch (Exception e ){
                System.out.println("Invalid");
            }
        }
    }
}
