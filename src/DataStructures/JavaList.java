package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(scan.nextInt());
        }
        scan.nextLine();
        int q = Integer.parseInt(scan.nextLine());
        while (q-- > 0) {
            String command = scan.nextLine();
            int[] nums = Arrays.stream(scan.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            int x = nums[0];
            if (command.equals("Insert")){
                int y = nums[1];
                list.add(x,y);
            } else if (command.equals("Delete")){
               list.remove(x);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
