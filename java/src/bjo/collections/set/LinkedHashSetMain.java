package bjo.collections.set;

import java.util.LinkedHashSet;

// 일반적인 경우에는 HashSet
// 순서가 중요한 경우에는 TreeSet
// 입력으로 넣은 순서가 중요한 경우에는 LinkedHashSet 을 사용한다.

public class LinkedHashSetMain {
    // LinkedHashSet
    // ----------------------------------------
    // 해시테이블과 연결리스트를 이용해서 구현되어 있다.
    // 삽입/삭제/제거 연산의 시간 복잡도가 O(1)이다.
    // 추가한 순서가 보장된다.

    public static void main(String[] args) {
        LinkedHashSet<Integer> d = new LinkedHashSet<Integer>();
        for (int i = 10; i >= 1; i--) {
            d.add(i);
        }

        for (int x : d) {
            System.out.print(x + " ");
        }
    }
}
