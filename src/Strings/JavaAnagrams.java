package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String[] arr = a.toLowerCase().split("");
        b = b.toLowerCase();
        for (int i = 0; i < arr.length; i++) {
            String current = arr[i];
            if (b.contains(current)) {
                b = b.replaceFirst(arr[i], "");
            }
        }
        return b.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        boolean result = isAnagram(a, b);
        System.out.println((result) ? "Anagrams" : "Not Anagrams");
    }
}

