//Stream<T> sorted(Comparator<? super T> comparator)	사용자 정의 정렬 방식 적용 (내림차순 등 가능)

package Stream.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향");

        names.stream()
                .sorted(Comparator.reverseOrder()) // 👉 내림차순 정렬
                .forEach(System.out::println);     // 👉 출력: 홍길동, 이몽룡, 성춘향 (역순)
    }
}
//또는 길이 기준으로 정렬하고 싶다면:
//names.stream()
//     .sorted((a, b) -> a.length() - b.length()) // 👉 문자열 길이 오름차순
//     .forEach(System.out::println);
