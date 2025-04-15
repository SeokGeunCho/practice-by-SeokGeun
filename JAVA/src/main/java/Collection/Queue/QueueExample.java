/*   🚌 Queue란?
FIFO (First In First Out) 구조
→ 먼저 넣은 데이터가 먼저 나옴

🔍 주요 메서드 정리
메서드	          설명
offer(E item)	큐에 데이터 추가
poll()	        큐에서 꺼냄 (삭제)
peek()	        삭제하지 않고 맨 앞 값 보기
isEmpty()	    큐가 비었는지 확인
size()	        큐 크기 확인          */

package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 큐에 데이터 추가 (offer)
        queue.offer("사과");
        queue.offer("바나나");
        queue.offer("딸기");

        // 큐 상태 출력
        System.out.println("현재 큐: " + queue);

        // 큐에서 데이터 꺼내기 (poll)
        String item = queue.poll();
        System.out.println("꺼낸 값: " + item);
        System.out.println("큐 상태: " + queue);

        // 맨 앞에 데이터만 보기 (peek)
        System.out.println("맨 앞 값: " + queue.peek());

        // 큐가 비었는지 확인
        System.out.println("큐가 비었나요? " + queue.isEmpty());
    }
}
