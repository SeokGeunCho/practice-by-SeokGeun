//   ✅ 2단계: 컬렉션 + 람다식 활용 문법
//   ✨ 자주 쓰는 패턴
//   메서드	설명
//   forEach()	각 요소를 하나씩 처리
//   removeIf()	조건에 맞는 요소 삭제
//   sort()	정렬
//   replaceAll()	요소 일괄 변경
//   stream().filter()	조건에 맞는 요소만 추림
//   stream().map()	값 변환
//   stream().collect()	다시 리스트 등으로 수집

package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LambdaWithCollections {
    public static void main(String[] args) {

    // 🔹 List + forEach + 람다
    List<String> names = Arrays.asList("홍길동", "김철수", "이영희");
    // 각 요소 출력
    names.forEach(name -> System.out.println("이름: " + name)); // -> 이름: 홍길동, 이름: 김철수 이름:

    // 🔹 List + removeIf (조건에 맞는 요소 삭제)
    List<String> namess = new ArrayList<>(Arrays.asList("홍길동", "김말자", "이순신"));
    namess.removeIf(name -> name.startsWith("김"));  // "김"으로 시작하는 이름 삭제
    System.out.println(namess); // 👉 [홍길동, 이순신]

    //🔹 List + sort (람다로 정렬)
    List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
    words.sort((a, b) -> a.compareTo(b)); // 오름차순
    System.out.println(words); // 👉 [apple, banana, cherry]

    // 🔹 List + stream().filter()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n % 2 == 0)  // 짝수만 필터링
        .forEach(System.out::println); // 👉 2 4

    //🔹 List + stream().map() → 변환
        List<String> namesss = Arrays.asList("kim", "lee", "park");
        List<String> upperNames = namesss.stream()
                .map(name -> name.toUpperCase()) // 모두 대문자로
                .toList();
        System.out.println(upperNames); // 👉 [KIM, LEE, PARK]

    //🔹 Map + forEach
        Map<String, Integer> scores = Map.of("수학", 90, "영어", 85, "국어", 95);

        scores.forEach((subject, score) -> {
            System.out.println(subject + ": " + score + "점");
        });

    }
}
//   ✅ 4단계: 마무리 요약
//   패턴	             예시
//   요소 반복	    forEach(elem -> ...)
//   조건 필터	    removeIf(elem -> 조건)
//   정렬	        list.sort((a, b) -> ...)
//   변환	        map(elem -> 새로운값)
//   조건 걸러내기  	filter(elem -> 조건)