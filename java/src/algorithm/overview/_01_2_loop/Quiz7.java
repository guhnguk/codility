package algorithm.overview._01_2_loop;

import java.util.Scanner;

// N = 7 일 때,
// 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 출력
public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(i + " + ");
            sum += i;
        }
        int length = sb.toString().length();
        String substring = sb.toString().substring(0, length - 3);
        System.out.println(substring + " = " + sum);

        int sum2 = 0;
        for (int i = 1; i <= N; i++) {
            if (i < N) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
            sum2 += i;
        }
        System.out.println(" = " + sum2);
    }
}
