package bjo.biginteger._10826;


import java.math.BigInteger;
import java.util.Scanner;

// 피보나치 4번
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger[] d = new BigInteger[Math.max(n+1, 2)];
        d[0] = BigInteger.ZERO;
        d[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            d[i] = d[i-1].add(d[i-2]);
        }
        System.out.println(d[n]);


        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;
        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
