package Stream.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterExample3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "javascript");

        names.stream()
                .filter(name -> name.contains("java"))
                .forEach(System.out::println); // 👉 출력: java, javascript
    }
}

//✅ 한 줄 요약
//filter()는 조건에 맞는 데이터만 추려내는 메서드예요!
//boolean 조건식을 쓰는 Predicate와 함께 사용되죠. 🎯
