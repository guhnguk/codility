package bjo.io._1000;

import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
