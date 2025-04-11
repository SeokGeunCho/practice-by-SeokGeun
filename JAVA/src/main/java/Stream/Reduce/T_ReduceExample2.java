// T reduce(T identity, BinaryOperator<T> accumulator)
// 초기값(identity)을 설정하고 누적

package Stream.Reduce;

import java.util.Arrays;
import java.util.List;

public class T_ReduceExample2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        int total = nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("총합: " + total); // 👉 출력: 총합: 15
    }
}
//0은 누적의 초기값 (identity)
//반환값이 Optional이 아니라 바로 int

