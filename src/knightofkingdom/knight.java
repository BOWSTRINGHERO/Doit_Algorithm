package knightofkingdom;

import java.util.Scanner;

public class knight {
    public static void main(String[] args) {
        final int MAP_SIZE = 8;

        Scanner scanner = new Scanner(System.in);

        String position = scanner.next();
        int cases = 0;
        int X = Character.getNumericValue(position.charAt(1));
        int Y = Integer.valueOf(position.charAt(0) - ('a' - 1));

        if (Y - 2 >= 1) {
            cases += (X == 1 || X == MAP_SIZE) ? 1 : 2;
        }
        if (Y + 2 <= MAP_SIZE) {
            cases += (X == 1 || X == MAP_SIZE) ? 1 : 2;
        }
        if (X - 2 >= 1) {
            cases += (Y == 1 || Y == MAP_SIZE) ? 1 : 2;
        }
        if (X + 2 <= MAP_SIZE) {
            cases += (Y == 1 || Y == MAP_SIZE) ? 1 : 2;
        }
        System.out.println("result = " + cases);
    }
}
