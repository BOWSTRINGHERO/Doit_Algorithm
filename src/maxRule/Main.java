package maxRule;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int numArr[] = new int[N];

        for (int i = 0; i < N; i++) {
            numArr[i] = scanner.nextInt();
        }

        numArr = Arrays.stream(numArr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        int first = (M / (K + 1) * K) + (M % (K + 1));
        int second = M - first;
        int result = (numArr[0] * first) + (numArr[1] * second);

        System.out.println("result = " + result);
    }
}
