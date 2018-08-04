package bjo.collections.sort._11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// (x, y)가 여러 개 있을 대, y가 증가하는 순으로, 같으면 x가 증가하는 순서로 정렬하는 문제
// 이 문제는 Comparator 로 푸는 것을 권장함.

class Point { //implements Comparable<Point> {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 성능은 둘다 같음
// Comparable 은 compareTo 를 구현하는데, natural 순서를 정의한다.
// 예를 들면, 문자열의 natural 순서는 사전순
// Comparator 는 다른 순서로 정렬하고 싶을 때 사용한다.
// 예를 들면, 문자열을 길이 순으로 정렬하고 싶을 때

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        Point[] a = new Point[n];
        for (int i = 0; i < n; i++) {
            String[] temp = bf.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            a[i] = new Point(x, y);
        }

        // Comparator 이용할 경우
        // ------------------------------------------------
        Arrays.sort(a, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.y < p2.y) {
                    return -1;
                } else if (p1.y == p2.y) {
                    if (p1.x < p2.x) {
                        return -1;
                    } else if (p1.x == p2.x) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            }
        });

        StringBuilder sb2 = new StringBuilder();
        for (Point p : a) {
            sb2.append(p.x + " " + p.y + "\n");
        }
        System.out.println(sb2);
    }
}
