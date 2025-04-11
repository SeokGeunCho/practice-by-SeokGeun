package Stream.Reduce;

import java.util.Arrays;
import java.util.List;

public class U_ReduceExample3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("람다", "스트림", "재미있다");

        String result = words.parallelStream()
                .reduce(
                        "",                         // 초기값
                        (a, b) -> a + b,            // 누적 함수
                        (a, b) -> a + b             // 병렬 처리시 합치는 함수
                );

        System.out.println("문자 연결 결과: " + result); // 👉 출력: 람다스트림재미있다
    }
}

//병렬 스트림(parallelStream)에서 쓰기 좋음
//누적 타입을 변경하거나 최적화할 수 있음
