package bjo.biginteger._10827;

import java.math.BigDecimal;
import java.util.Scanner;

// a^b
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        int b = sc.nextInt();

        BigDecimal c = a.pow(b);
        System.out.println(c.toPlainString()); // 매우 주의 해야 한다. toPlainString 메소드 사용해야 한다.
    }
}
