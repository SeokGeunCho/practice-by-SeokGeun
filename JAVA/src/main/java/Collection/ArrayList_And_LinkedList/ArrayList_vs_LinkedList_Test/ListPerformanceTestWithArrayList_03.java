// ✅ 코드: 앞에 삽입 성능 비교

package Collection.ArrayList_And_LinkedList.ArrayList_vs_LinkedList_Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTestWithArrayList_03 {
    private static final int DATA_SIZE = 100_000;

    public static void main(String[] args) {
        // ArrayList 테스트
        List<Integer> arrayList = new ArrayList<>();
        long arrayStart = System.nanoTime();

        for (int i = 0; i < DATA_SIZE; i++) {
            arrayList.add(0, i);  // 항상 맨 앞에 삽입
        }

        long arrayEnd = System.nanoTime();
        System.out.println("ArrayList 앞 삽입 시간: " + (arrayEnd - arrayStart) / 1_000_000 + " ms");

        // LinkedList 테스트
        List<Integer> linkedList = new LinkedList<>();
        long linkedStart = System.nanoTime();

        for (int i = 0; i < DATA_SIZE; i++) {
            linkedList.add(0, i);  // 항상 맨 앞에 삽입
        }

        long linkedEnd = System.nanoTime();
        System.out.println("LinkedList 앞 삽입 시간: " + (linkedEnd - linkedStart) / 1_000_000 + " ms");
    }
}
// ✅ 정리
// 테스트	        빠른 쪽	               이유
// 중간 삽입	      ✅ LinkedList     	연결 구조로 복사 없이 삽입 가능
// 전체 순회/조회	  ✅ ArrayList	        인덱스 기반 접근이 빠름

// ✅ 왜 이런 차이가 날까?
// 리스트	         구조	                  앞 삽입 시
// ArrayList	  배열 기반	           모든 요소를 한 칸씩 뒤로 밀어야 함 → 느림
// LinkedList	  노드 연결 기반	       앞 노드 연결만 바꾸면 됨 → 빠름

// ✅ 결론
// 삽입 위치	더 빠른 자료구조
// 앞에 계속 추가	✅ LinkedList
// 중간에 자주 추가	보통 LinkedList (하지만 순회가 많으면 느릴 수 있음)
// 끝에 추가	✅ ArrayList
// 조회가 많을 때	✅ ArrayList