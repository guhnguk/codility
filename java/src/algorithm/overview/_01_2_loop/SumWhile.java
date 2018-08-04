package algorithm.overview._01_2_loop;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 N까지 합을 구합니다. ");
        System.out.print("N의 값: ");
        int N = sc.nextInt();

        // for loop
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // while loop
        int i = 1;
        int sum2 = 0;
        while (i <= N) {
            sum2 += i;
            i++;
        }

        if (sum == sum2) {
            System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");
        }


    }
}
