//메서드	설명
//Stream<T> filter(Predicate<? super T> predicate)	스트림 요소 중 조건을 만족하는 요소만 필터링해서 새로운 스트림 생성
//Predicate<T>는 boolean을 반환하는 조건식
//
//조건에 **참(true)**인 요소만 남기고 나머지는 제외됨

// 예제 1 – 짝수만 필터링
package Stream.Filter;

import java.util.*;
import java.util.stream.*;

public class FilterExample1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); // 👉 출력: 2, 4
    }
}

// ✅ 한 줄 요약
//filter()는 조건에 맞는 데이터만 추려내는 메서드예요!
//boolean 조건식을 쓰는 Predicate와 함께 사용되죠. 🎯