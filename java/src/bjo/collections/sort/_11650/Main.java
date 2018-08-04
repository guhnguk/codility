package bjo.collections.sort._11650;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// compare 는 클래스 내부에서 선언 되어야 한다.
// compare 식의 조건
// ---------------------------------------------
// sgn 은 부호를 의미
// sgn(x.compareTo(y)) == -sgn(y.compareTo(x))
// ==> x, y 바꿔서 부호가 같아야 함.

// x.compareTo(y) > 0 && y.compareTo(z) > 0 implies x.compareTo(z) > 0
// x, y 비교해서 양수이고, y, z 비교해서 양수이면, x, z 비교해서도 반드시 0이 나와야 함

// x.compareTo(y) == 0 implies that sgn(x.compareTo(z)) == sgn(y.compareTo(z))
// x, y 비교해서 0과 같다면, x, z 비교한 부호와 y, z 비교한 부호화 같아야 한다.
class Point implements Comparable<Point> {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 부등호가 혼동 될 때가 있는데,
    // 이때 that 을 왼쪽으로 넘기면 된다.
    // this - that < 0 이면, 음수이므로 ==> -1
    // this - that > 0 이면, 양수이므로 ==> 1
    @Override
    public int compareTo(Point that) {
        if (this.x < that.x) {
            return -1;
        } else if (this.x == that.x) {
            if (this.y < that.y) {
                return -1;
            } else if (this.y == that.y) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}

// 성능은 둘다 같음
// Comparable 은 compareTo 를 구현하는데, natural 순서를 정의한다.
// 예를 들면, 문자열의 natural 순서는 사전순
// Comparator 는 다른 순서로 정렬하고 싶을 때 사용한다.
// 예를 들면, 문자열을 길이 순으로 정렬하고 싶을 때

public class Main {
    // (x, y)가 여러 개 있을 때, x가 증가하는 순으로, 같으면 y가 증가하는 순서로 정렬하는 문제
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

        // Comparable 이용하여 compareTo 사용할 경우
        // ------------------------------------------------
        // a 라는 array 를 sort 메소드 안에 주면 알아서 정렬한다.
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for (Point p : a) {
            sb.append(p.x + " " + p.y + "\n");
        }
        System.out.println(sb);

        // Comparator 이용할 경우
        // ------------------------------------------------
        Arrays.sort(a, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.compareTo(p2);
            }
        });

        StringBuilder sb2 = new StringBuilder();
        for (Point p : a) {
            sb2.append(p.x + " " + p.y + "\n");
        }
        System.out.println(sb2);
    }
}
