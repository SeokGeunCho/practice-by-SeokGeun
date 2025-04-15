//메서드 형태	설명
//Stream<R> map(Function<? super T, ? extends R> mapper)	스트림의 각 요소를 하나씩 변환(map) 해서 새로운 스트림을 생성
//기존 값을 가공해서 새로운 값을 만드는 데 사용
//각 요소는 변환되어 1:1 대응하는 결과를 갖음 (→ flatMap()과 차이)
//✅ map() 사용 예제
//예제 1 – 정수 리스트를 제곱한 리스트로

package Stream.Map;

import java.util.*;
import java.util.stream.*;

public class MapExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);  // 👉 출력: 1, 4, 9, 16
    }
}

// ✅ 한 줄 요약
//map()은 스트림의 요소들을 원하는 방식으로 가공해서 새로운 값으로 바꾸는 데 사용해요!
//1:1로 변환하며, 결과는 새로운 스트림으로 만들어져요. 🎨