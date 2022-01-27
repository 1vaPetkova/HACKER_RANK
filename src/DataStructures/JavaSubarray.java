package DataStructures;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        int countNegative = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] < 0) {
                countNegative++;
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    countNegative++;
                }
            }
        }
        System.out.println(countNegative);
    }
}
