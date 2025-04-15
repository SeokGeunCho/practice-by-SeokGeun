package Heap;

import java.util.PriorityQueue; // 우선순위 큐 사용
import java.util.Collections;   // 역순 정렬을 위한 Collections 클래스

public class MaxHeapExample {
    public static void main(String[] args) {
        // PriorityQueue에 Collections.reverseOrder()를 넘기면 최대 힙(Max Heap)으로 동작
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 값들을 힙에 추가 (큰 값이 위로 올라감)
        maxHeap.offer(30); // 30 추가
        maxHeap.offer(10); // 10 추가
        maxHeap.offer(20); // 20 추가

        // 가장 큰 값 꺼내기 (루트)
        System.out.println("최대값 꺼내기: " + maxHeap.poll());  // 30

        // 다음 큰 값
        System.out.println("다음 최대값: " + maxHeap.poll());   // 20

        // 마지막 값
        System.out.println("마지막 값: " + maxHeap.poll());     // 10
    }
}

