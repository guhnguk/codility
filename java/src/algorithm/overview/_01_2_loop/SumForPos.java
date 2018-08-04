package algorithm.overview._01_2_loop;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 N까지 합을 구합니다. ");
        int N;

        do {
            System.out.print("N의 값: ");
            N = sc.nextInt();
        } while (N <= 0);

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");
    }
}
