package Strings;

import java.util.Arrays;
import java.util.Scanner;


public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine().trim();
        scan.close();
        if (line.length() == 0) {
            System.out.println(0);
        } else {
            String[] arr = line.split("[ !,?._'@]+");
            System.out.println(arr.length);
            Arrays.stream(arr).forEach(System.out::println);
        }
    }
}
