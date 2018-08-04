package bjo.io._1000;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        // Scanner 편리하지만 느리다. 그래서 입력을 많이 받을 경우 BufferedReader를 사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String s = sc.nextLine(); wrong

        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(n + "\n" + s);
    }
}
