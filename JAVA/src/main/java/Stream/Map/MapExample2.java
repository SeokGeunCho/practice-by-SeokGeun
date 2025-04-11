//메서드 형태	설명
//Stream<R> map(Function<? super T, ? extends R> mapper)	스트림의 각 요소를 하나씩 변환(map) 해서 새로운 스트림을 생성
//기존 값을 가공해서 새로운 값을 만드는 데 사용
//
//각 요소는 변환되어 1:1 대응하는 결과를 갖음 (→ flatMap()과 차이)

//예제 2 – 문자열을 대문자로 변환

package Stream.Map;

import java.util.Arrays;
import java.util.List;

public class MapExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");

        list.stream()
                .map(str -> str.toUpperCase())
                .forEach(System.out::println); // 👉 출력: APPLE, BANANA, KIWI
    }
}

// ✅ 한 줄 요약
//map()은 스트림의 요소들을 원하는 방식으로 가공해서 새로운 값으로 바꾸는 데 사용해요!
//1:1로 변환하며, 결과는 새로운 스트림으로 만들어져요. 🎨