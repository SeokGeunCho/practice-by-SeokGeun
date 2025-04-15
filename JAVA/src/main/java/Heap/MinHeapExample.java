package Heap;

import java.util.PriorityQueue; // 우선순위 큐(PriorityQueue)를 사용하기 위한 import

public class MinHeapExample {
    public static void main(String[] args) {
        // PriorityQueue는 기본적으로 최소 힙(Min Heap)으로 동작
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 값들을 힙에 추가 (자동으로 정렬됨)
        minHeap.offer(30);  // 30 추가
        minHeap.offer(10);  // 10 추가 → 현재 힙 루트가 됨
        minHeap.offer(20);  // 20 추가

        // 가장 작은 값을 꺼냄 (루트)
        System.out.println("최소값 꺼내기: " + minHeap.poll());  // 10

        // 그 다음 작은 값 출력
        System.out.println("다음 최소값: " + minHeap.poll());   // 20

        // 마지막 값 출력
        System.out.println("마지막 값: " + minHeap.poll());     // 30
    }
}
