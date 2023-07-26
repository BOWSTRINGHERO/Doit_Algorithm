package debugging;

import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int answer = 0;
        int A[] = new int[100001];
        int S[] = new int[100001];

        for (int i = 0; i < 10000; i++) {
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i - 1] + A[i];
        }
        for (int i = 0; i < testcase; i++) {
            int query = sc.nextInt();
            for (int j = 0; j < query; j++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += S[end] - S[start - 1];
                System.out.println(testcase + " " + answer);
            }
        }
    }
}
