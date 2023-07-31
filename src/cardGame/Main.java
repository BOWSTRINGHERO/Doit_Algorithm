package cardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int cardArr[][] = new int[n][m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int rowMin = 10001;

            for (int j = 0; j < m; j++) {
                cardArr[i][j] = scanner.nextInt();

                if (cardArr[i][j] < rowMin) {
                    rowMin = cardArr[i][j];
                }
            }
            if (max < rowMin) {
                max = rowMin;
            }
        }
        System.out.println("result = " + max);
    }
}
