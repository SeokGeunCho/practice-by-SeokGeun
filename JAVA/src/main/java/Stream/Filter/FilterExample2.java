package Stream.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "apple", "hello", "cat");

        words.stream()
                .filter(word -> word.length() >= 5)
                .forEach(System.out::println); // 👉 출력: apple, hello
    }
}

// ✅ 한 줄 요약
//filter()는 조건에 맞는 데이터만 추려내는 메서드예요!
//boolean 조건식을 쓰는 Predicate와 함께 사용되죠. 🎯