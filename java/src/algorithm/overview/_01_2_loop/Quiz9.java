package algorithm.overview._01_2_loop;

import java.util.Scanner;

// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하는 함수
// a, b 대소관계 상관 없음
// a=3, b=5 ==> 3+4+5=12
// a=6, b=4 ==> 6+5+4=15
public class Quiz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = betweenTwoNumber(a, b);
        System.out.println("두 정수 " + a + " 와 " + b + " 간의 합은 " + sum + "입니다.");
    }

    private static int betweenTwoNumber(int a, int b) {
        int min = a;
        int max = b;
        if ((a-b) > 0) {
            min = b;
            max = a;
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return  sum;
    }
}
