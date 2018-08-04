package bjo.io._10824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// http://www.acmicpc.net/problem/10824
// 네수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        String a = line[0] + line[1];
        String b = line[2] + line[3];

        // 14자리는 Int
        // 그 이하는 Long
        long ans = Long.valueOf(a) + Long.valueOf(b);
        System.out.println(ans);
    }
}
