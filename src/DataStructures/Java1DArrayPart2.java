package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArrayPart2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int q = Integer.parseInt(scan.nextLine());

        while (q-- > 0) {
            String firstLine = scan.nextLine();
            int n = Integer.parseInt(firstLine.split("\\s+")[0]);
            int leap = Integer.parseInt(firstLine.split("\\s+")[1]);
            int[] game = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
    }

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) return false;
        if ((i == game.length - 1) || i + leap >= game.length) return true;
        game[i] = 1;
        return isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1) || isSolvable(leap, game, i + leap);
    }
}
