package greedy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int minCoinCnt = 0;
        int coins[] = {500, 100, 50, 10};

        for (int coin : coins) {
            minCoinCnt += (total / coin);
            total %= coin;
        }
        System.out.println("result = " + minCoinCnt);
    }
}
