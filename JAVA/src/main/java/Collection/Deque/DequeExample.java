/* 🧊 Deque란?
스택 + 큐의 장점을 합친 구조
앞(front)에서도 넣고 빼고, 뒤(back)에서도 넣고 뺄 수 있음
✅ 즉,
기능	                설명
큐처럼 사용	     앞에서 꺼내고, 뒤에 넣기
스택처럼 사용	     뒤에서 넣고, 뒤에서 꺼내기 */

package Collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // 뒤에 추가 (addLast / offerLast)
        deque.addLast("A");
        deque.addLast("B");

        // 앞에 추가 (addFirst)
        deque.addFirst("C");
        System.out.println("현재 Deque: " + deque); // [C, A, B]

        // 앞에서 꺼내기 (pollFirst)
        System.out.println("앞에서 꺼낸 값: " + deque.pollFirst()); // C

        // 뒤에서 꺼내기 (pollLast)
        System.out.println("뒤에서 꺼낸 값: " + deque.pollLast()); // B

        System.out.println("최종 Deque: 상태: " + deque); // [A]
    }
}
