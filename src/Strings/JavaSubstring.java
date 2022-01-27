package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        int[] ints = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int start = ints[0];
        int end = ints[1];
        System.out.println(txt.substring(start,end));
    }
}
