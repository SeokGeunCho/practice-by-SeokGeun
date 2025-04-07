package Application_Programming_Interface.Concept.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample_0 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 현재 날짜와 시간

        // 날짜 형식 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 출력 형식을 지정
        String fomatted = now.format(formatter); // LocalDateTime을 문자열로 변환

        System.out.println("현재 시각: " + fomatted);
    }
}
