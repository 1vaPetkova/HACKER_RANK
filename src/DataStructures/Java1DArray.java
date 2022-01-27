package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
