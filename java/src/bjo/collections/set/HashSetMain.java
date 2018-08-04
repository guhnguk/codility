package bjo.collections.set;

import java.util.HashSet;

// 일반적인 경우에는 HashSet
// 순서가 중요한 경우에는 TreeSet
// 입력으로 넣은 순서가 중요한 경우에는 LinkedHashSet 을 사용한다.

public class HashSetMain {
    // HashSet
    // ------------------------------------------
    // 해시 테이블을 이용해서 구현되어 있다.
    // 삽입/삭제/제거 연산의 시간 복잡도가 O(1)이다.
    // 순서가 보장되지 않는다.
    // 따라서 순서가 중요하지 않고, 무엇이 들어 있는지 무엇이 들어지 있지 않은지 판단할 때 사용한다.

    public static void main(String[] args) {
        HashSet<Integer> d = new HashSet<Integer>();
        for (int i = 10; i >=1; i--) {
            d.add(i);
        }

        for (int x : d) {
            System.out.print(x + " ");
        }
    }
}
