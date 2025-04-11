//메서드 형태	설명
//Optional<T> reduce(BinaryOperator<T> accumulator)	초기값 없이 누적.
// 값이 없을 수도 있어서 Optional로 반환됨

package Stream.Reduce;

import java.util.*;

public class Optianal_ReduceExample1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sum = nums.stream()
                .reduce((a, b) -> a + b);

        sum.ifPresent(result -> System.out.println("총합: " + result)); // 👉 출력: 총합: 15
    }
}
//a + b로 누적
//Optional이라서 ifPresent()로 꺼냄

