package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<List<Integer>> rows = new ArrayList<>();
        while (n-- > 0) {
            List<Integer> cols = new ArrayList<>();
            int numberOfIntegers = scan.nextInt();
            while (numberOfIntegers-- > 0) {
                cols.add(scan.nextInt());
            }
            rows.add(cols);
        }
        int queries = scan.nextInt();
        while (queries-- > 0) {
            int row = scan.nextInt() - 1;
            int col = scan.nextInt() - 1;
            if (row < rows.size() && !rows.get(row).isEmpty() && col < rows.get(row).size()) {
                System.out.println(rows.get(row).get(col));
            } else {
                System.out.println("ERROR!");
            }
        }

    }
}

