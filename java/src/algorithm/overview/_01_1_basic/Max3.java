package algorithm.overview._01_1_basic;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대 값을 구합니다.");
        System.out.print("a의 값: "); int a = sc.nextInt();
        System.out.print("b의 값: "); int b = sc.nextInt();
        System.out.print("c의 값: "); int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최대값은 " + max + "입니다.");

        System.out.println("max(1, 3, 2) => " + max(1, 3, 2));
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }
}
