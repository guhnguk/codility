package algorithm.overview._01_2_loop;

import java.util.Scanner;

// 가우스로 합계산
public class Quiz8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = N * (N + 1) / 2;
        System.out.println("1부터 " + N + "까지의 합은 " + sum + "입니다.");

//        int sum2 = sum + (N % 2 == 1 ? (N + 1) /2 : 0);
//        System.out.println("1부터 " + N + "까지의 합은 " + sum2 + "입니다.");
    }
}
