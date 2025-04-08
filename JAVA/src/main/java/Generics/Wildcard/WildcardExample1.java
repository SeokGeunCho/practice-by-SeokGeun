package Generics.Wildcard;
import java.util.Arrays;
import java.util.List;

//✅ 예제 1. <?> — 어떤 타입이든 다 받아주는 와일드카드

public class WildcardExample1 {
    // 어떤 타입이든 받을 수 있는 메서드 (<?>)
    public static void printList(List<?> list) {
        // 리스트 안의 모든 아이템을 반복하면서
        for (Object item : list) {
            // 아이템을 출력한다
            System.out.println("아이템: " + item);
        }
    }
    public static void main(String[] args) {
        // 문자열 리스트 생성 (이름 리스트)
        List<String> names = Arrays.asList("철수", "영희");
        // 정수 리스트 생성
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        printList(names);
        // 문자열 리스트 출력
        printList(numbers);
        // 숫자 리스트 출력
    }
}
// 💬 포인트 정리
// List<?>는 모든 타입의 리스트를 받을 수 있어 (String, Integer 등).
// 다만 읽기만 가능, list.add() 같은 건 불가능!