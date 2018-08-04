package bjo.collections.sort._2750;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // collections.sort 를 이용하는 방법
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            a.add(temp);
        }

        Collections.sort(a);
        for (int x : a) {
            System.out.println(x);
        }

        // array 를 이용하는 방법
        int[] aa = new int[n];
        for (int i = 0; i < n; i++) {
            aa[i] = sc.nextInt();
        }

        Arrays.sort(aa);
        for (int x : aa) {
            System.out.println(x);
        }
    }
}
