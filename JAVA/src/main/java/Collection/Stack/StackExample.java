/*  🔍 주요 메서드 정리
메서드	        설명
push(E item)	스택에 데이터 추가
pop()	        스택에서 데이터 꺼냄 (삭제)
peek()	        삭제하지 않고 맨 위 데이터 보기
isEmpty()	    스택이 비었는지 확인
size()	        스택 크기                  */

package Collection.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // 스택에 데이터 추가 (push)
        stack.push("사과");
        stack.push("바나나");
        stack.push("딸기");

        // 스택의 현재 상태 출력
        System.out.println("현재 스택: " + stack);

        // 스택의 현재 사이즈 출력
        System.out.println("현재 스택의 사이즈: " + stack.size());

        // 스택에서 데이터 꺼내기 (pop)
        String item = stack.pop();
        System.out.println("꺼낸 값: " + item);
        System.out.println("스택 상태: " + stack);

        // 스택의 현재 사이즈 출력 (size)
        System.out.println("현재 스택의 사이즈: " + stack.size());

        // 스택의 맨 위 값만 보기 (peek)
        System.out.println("맨 위 값: " + stack.peek());

        // 스택이 비었는지 확인 (isEmpty)
        System.out.println("스택이 비었나요? " + stack.isEmpty());
    }
}
