package bjo.biginteger;

import java.math.*;
import java.util.Scanner;

// 자바에만 있는 것이므로, C/C++ 에서는 미리 공부하고 가는 것이 좋다.
public class BitIntegerMain {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000");
        BigInteger b = new BigInteger("1000");
        BigInteger c = a.add(b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("a+b = " + a.add(b));
        System.out.println("a-b = " + a.subtract(b));
        System.out.println("a*b = " + a.multiply(b));
        System.out.println("a/b = " + a.divide(b));
        System.out.println("a%b = " + a.remainder(b));
        System.out.println("gcd(a, b)" + a.gcd(b)); // 최대공약수 구하
        System.out.println("-a" + a.negate());  // 음의 부호 만들기

        System.out.println("ZERO = " + BigInteger.ZERO);
        System.out.println("ONE = " + BigInteger.ONE);
        System.out.println("TEN = " + BigInteger.TEN);
        System.out.println("a^10 =" + a.pow(10));

        Scanner sc = new Scanner(System.in);
        BigInteger m = sc.nextBigInteger();
        BigInteger n = sc.nextBigInteger();

        int o = m.compareTo(n);
        if (o < 0) {
            System.out.println("<");
        } else if (o == 0) {
            System.out.println("==");
        } else {
            System.out.println(">");
        }

        System.out.println("compareTo = " + o);


        boolean e = m.equals(n);
        if (e) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }

        System.out.println("equals = " + e);
    }
}
