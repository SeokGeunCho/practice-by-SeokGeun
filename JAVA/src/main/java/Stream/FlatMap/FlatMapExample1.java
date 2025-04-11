// ✅ flatMap() 사용 예제
// 예제 1 – 2차원 리스트를 하나의 스트림으로 만들기
// 메서드 형태	설명
// Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
// 중첩된 컬렉션을 하나의 스트림으로 평탄화(flatten)시켜줌

package Stream.FlatMap;

import java.util.*;
import java.util.stream.*;

public class FlatMapExample1 {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E")
        );

        list.stream()
                .flatMap(subList -> subList.stream())
                .forEach(System.out::println);  // 👉 출력: A, B, C, D, E
    }
}

// flatMap()은 각 요소를 Stream으로 바꾸고, 이걸 전부 합쳐서 하나의 스트림으로 만들어줌!
//즉, 중첩된 구조를 "펼쳐서" 처리할 때 쓰는 도구!