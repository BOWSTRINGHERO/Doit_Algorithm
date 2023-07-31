package time;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 0;

        for (int hour = 0; hour <= N; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                for (int second = 0; second <= 59; second++) {
                    String time = String.valueOf(hour) + minute + second;

                    if (time.indexOf("3") > -1) {
                        result++;
                    }
                }
            }
        }
        System.out.println("result = " + result);
    }
}
