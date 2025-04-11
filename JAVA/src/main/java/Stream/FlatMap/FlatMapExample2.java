//메서드 형태	설명
//Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
// 중첩된 컬렉션을 하나의 스트림으로 평탄화(flatten)시켜줌
//map()은 요소 하나당 변환된 요소 하나.

//flatMap()은 요소 하나당 스트림을 반환하고, 그걸 평탄화해서 하나의 스트림으로 만들어 줌.
//예제 2 – 문자열 배열을 쪼개서 하나의 스트림으로
package Stream.FlatMap;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample2 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("hello world", "java stream");

        sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(System.out::println); // 👉 출력: hello, world, java, stream
    }
}

//flatMap()은 각 요소를 Stream으로 바꾸고, 이걸 전부 합쳐서 하나의 스트림으로 만들어줌!
//즉, 중첩된 구조를 "펼쳐서" 처리할 때 쓰는 도구!
