package bjo.io._2741;

import java.util.Scanner;

public class Main {
//    // solution 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        for (int i = 1; i <=n; i++) {
//            System.out.println(i);
//        }
//
//        // 880ms
//    }


    // solution 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
    // 156ms
}
