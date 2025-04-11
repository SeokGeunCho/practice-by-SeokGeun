package Stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LambdaStreamPractice {
    public static void main(String[] args) {

        // 1. Consumer 예제 - 문자열 출력
        // sayHello: 함수형 인터페이스 변수
        // name: 파라미터 (함수 안에서 입력값을 받는 변수)
        Consumer<String> sayHello = name -> System.out.println("안녕, " + name);
        sayHello.accept("홍길동"); // 👉 "홍길동"이 name에 들어가 출력됨

        // 2. Supplier 예제 - 랜덤 숫자 생성
        // randomSupplier: 함수형 인터페이스 변수
        // () -> : 파라미터가 없음
        Supplier<Double> randomSupplier = () -> Math.random(); // Math.random() 결과를 반환
        System.out.println("랜덤값: " + randomSupplier.get()); // 👉 get()으로 결과 출력

        // 3. Function 예제 - 정수 → 문자열
        // toWon: 함수형 인터페이스 변수
        // i: 파라미터 (정수 입력)
        Function<Integer, String> toWon = i -> i + "원";
        System.out.println(toWon.apply(1000)); // 👉 "1000원" 출력

        // 4. Predicate 예제 - 짝수 여부 판별
        // isEven: 함수형 인터페이스 변수
        // i: 파라미터
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println("짝수인가요? " + isEven.test(4)); // 👉 true

        // 5. BiFunction 예제 - 문자열 두 개 비교
        // sameText: 함수형 인터페이스 변수
        // a, b: 두 개의 파라미터
        BiFunction<String, String, Boolean> sameText = (a, b) -> a.equals(b);
        System.out.println("같은 문자열? " + sameText.apply("java", "java")); // 👉 true

        // 6. 스트림 - 숫자 리스트 중 짝수만 출력
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // numbers: 변수
        // n: 파라미터 (스트림 안에서 각 요소를 의미)
        numbers.stream()
                .filter(n -> n % 2 == 0)       // 👉 n이 짝수인 것만 통과
                .forEach(System.out::println); // 👉 결과: 2, 4

        // 7. 스트림 - 문자열 길이 구하기
        List<String> words = Arrays.asList("apple", "banana", "kiwi");
        // word: 스트림 내 요소를 담는 파라미터
        words.stream()
                .map(word -> word.length())   // 👉 각 단어의 길이로 바꿈
                .forEach(System.out::println); // 👉 출력: 5, 6, 4

        // 8. 스트림 - 대문자로 바꾸기
        // str: 파라미터
        words.stream()
                .map(str -> str.toUpperCase()) // 👉 각 단어를 대문자로 변환
                .forEach(System.out::println); // 👉 출력: APPLE, BANANA, KIWI

        // 9. 스트림 - "a"를 포함한 단어만 출력
        // str: 파라미터
        words.stream()
                .filter(str -> str.contains("a")) // 👉 "a" 포함한 단어만 필터링
                .forEach(System.out::println);    // 👉 출력: apple, banana

        // 10. 스트림 - 숫자 총합 구하기
        // i: 파라미터
        int sum = numbers.stream().mapToInt(i -> i).sum(); // 각 요소를 int로 바꿔 총합 계산
        System.out.println("총합: " + sum); // 👉 출력: 15

    }
}

