//Stream<T> sorted()	기본 정렬 (오름차순, Comparable 기반)

package Stream.Sorted;

import java.util.*;
import java.util.stream.*;

public class SortedExample1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 1, 4, 2);

        nums.stream()
                .sorted()
                .forEach(System.out::println); // 👉 출력: 1, 2, 3, 4, 5
    }
}
// 숫자, 문자열 등 기본적으로 정렬이 가능한 타입이면 sorted()만으로 정렬 가능!
