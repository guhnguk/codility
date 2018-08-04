package bjo.collections.set;

import java.util.TreeSet;

// 일반적인 경우에는 HashSet
// 순서가 중요한 경우에는 TreeSet
// 입력으로 넣은 순서가 중요한 경우에는 LinkedHashSet 을 사용한다.

public class TreeSetMain {
    // TreeSet
    // -------------------------------------------
    // 이진 검색 트리(레드 블랙 트리) 이용해서 구현되어 있다.
    // 삽입/삭제/제거 연산의 시간의 복잡도가 O(logN)이다.
    // 순서가 보장된다.
    // 입력이 아닌, 정해진 순서를 보장한다.
    public static void main(String[] args) {
        TreeSet<Integer> d = new TreeSet<Integer>();
        for (int i = 10; i >= 1; i--) {
            d.add(i);
        }

        for (int x : d){
            System.out.print(x + " ");
        }
    }
}
