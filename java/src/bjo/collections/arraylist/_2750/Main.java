package bjo.collections.arraylist._2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 수 정렬하기
// N개의 수 오름차순으로 정렬하는 문제
// O(n)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int temp  = sc.nextInt();
            a.add(temp);
        }

        Collections.sort(a);
        for (int x : a) {
            System.out.println(x);
        }

        System.out.println();
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
