package Enum.WangChoBo;

import java.util.Scanner;

public class EnumTest2WithScanner_05 {

    // 🔸 1. enum으로 계절 정의
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력 도구 준비

        System.out.println("계절을 입력하세요 (예: SPRING, SUMMER, FALL, WINTER):");
        String input = scanner.nextLine().toUpperCase(); // 입력값을 대문자로 변환

        try {
            // 2. 문자열 -> enum 값으로 변환
            Season season = Season.valueOf(input);

            // 3. switch문으로 처리
            switch (season) {
                case SPRING:
                    System.out.println("봄은 따뜻해요!");
                    break;
                case SUMMER:
                    System.out.println("여름엔 아이스커피!");
                    break;
                case FALL:
                    System.out.println("가을엔 단풍구경~");
                    break;
                case WINTER:
                    System.out.println("겨울엔 눈싸움!");
                    break;
            }

        } catch (IllegalArgumentException e) {
            // 4. 잘못 입력한 경우 처리
            System.out.println("잘못된 계절입니다! ((SPRING, SUMMER, FALL, WINTER 중 하나 입력)");
        }

        scanner.close(); // 입력 도구 닫기
    }
}
