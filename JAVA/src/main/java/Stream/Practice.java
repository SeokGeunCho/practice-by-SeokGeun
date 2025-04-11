package Stream;

import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
//   =======================================================
//  1.filter() + forEach()
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // list 변수 (List 객체)

        list.stream()
                .filter(n -> n % 2 == 0) // n : 파라미터(각 요소를 받아오는 임시 변수), n % 2 == 0	조건 (람다식 내부에서 사용하는 표현)
                .forEach(System.out::println); // 👉 2, 4

//   ========================================================

//  예제 2: .map() – 값 변환
        list.stream()
                .map(n -> n * 2)  // n	파라미터 (stream에서 꺼낸 원소를 받음) , n * 2	반환값 (변환된 새로운 값)
                .forEach(System.out::println); // 👉 출력: 2, 4, 6, 8, 10

//   ========================================================

//  3. sorted() → 정렬
        List<String> fruits = Arrays.asList("banana", "apple", "cherry");

        List<String> sorted = fruits.stream()
                .sorted()
                .toList();

        System.out.println(sorted); // 👉 [apple, banana, cherry]
//   ========================================================

//  4. distinct() + limit()
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 5);

        nums.stream()
                .distinct()   // 👉 [1, 2, 3, 4, 5]
                .limit(3)     // 👉 앞에서 3개
                .forEach(System.out::println); // 👉 1, 2, 3

//   ========================================================





    }
}