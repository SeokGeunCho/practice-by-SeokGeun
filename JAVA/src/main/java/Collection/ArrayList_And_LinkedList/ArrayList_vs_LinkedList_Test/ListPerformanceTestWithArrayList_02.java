package Collection.ArrayList_And_LinkedList.ArrayList_vs_LinkedList_Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTestWithArrayList_02 {
    private static final int DATA_SIZE = 100_000;         // DATA_SIZE = 100_000 → 10만 개의 데이터를 삽입

    public static void main(String[] args) {

        // ArrayList 테스트
        List<Integer> arrayList = new ArrayList<>();
        long arrayStart = System.nanoTime();

        for (int i = 0; i < DATA_SIZE; i++) {
            arrayList.add(arrayList.size()/2, i);  // add(size()/2, i) → 항상 리스트의 중간에 삽입
        }
        long arrayEnd = System.nanoTime();  // System.nanoTime() → 코드 실행 시간 측정
        System.out.println("ArrayList 중간 삽입 시간: " + (arrayEnd - arrayStart) / 1_000_000 + " ms");

        // LinkedList 테스트
        List<Integer> linkedList = new LinkedList<>();
        long linkedStart = System.nanoTime(); // System.nanoTime() → 코드 실행 시간 측정

        for (int i = 0; i < DATA_SIZE; i++) {
            linkedList.add(linkedList.size() /2, i);    // add(size()/2, i) → 항상 리스트의 중간에 삽입
        }
        long linkedEnd = System.nanoTime();
        System.out.println("LinkedList 중간 삽입 시간: " + (linkedEnd - linkedStart) / 1_000_000 + " ms");
    }
}
// ✅ 정리
// 테스트	        빠른 쪽	               이유
// 중간 삽입	      ✅ LinkedList     	연결 구조로 복사 없이 삽입 가능
// 전체 순회/조회	  ✅ ArrayList	        인덱스 기반 접근이 빠름