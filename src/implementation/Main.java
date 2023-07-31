package implementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String route = scanner.nextLine().replaceAll(" ", "");

        int X = 1;
        int Y = 1;

        for (char direction : route.toCharArray()) {
            switch (direction) {
                case 'U':
                    X = (X - 1 < 1 ? X : X - 1);
                    break;
                case 'D':
                    X = (X + 1 > N ? X : X + 1);
                    break;
                case 'L':
                    Y = (Y - 1 < 1 ? Y : Y - 1);
                    break;
                case 'R':
                    Y = (Y + 1 > N ? Y : Y + 1);
                    break;
            }
        }
        System.out.println(String.format("result point : (%d, %d)", X, Y));
    }
}
