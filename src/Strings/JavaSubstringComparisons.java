package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = Integer.parseInt(scan.nextLine());
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i <= s.length()-k; i++) {
            substrings.add(s.substring(i,i+k));
        }
        Collections.sort(substrings);
        System.out.println(substrings.get(0));
        System.out.println(substrings.get(substrings.size()-1));
    }
}
