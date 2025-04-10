package Enum.WangChoBo;

import java.util.Scanner;  // 사용자 입력을 받기 위한 클래스

public class EnumTest4 {

    // 1. 요일을 정의하는 enum 생성
    enum Week {
        MONDAY("월요일"),
        TUESDAY("화요일"),
        WEDNESDAY("수요일"),
        THURSDAY("목요일"),
        FRIDAY("금요일"),
        SATURDAY("토요일"),
        SUNDAY("일요일");

        // 각 요일의 한글 이름을 저장할 필드
        private final String korean;

        // enum 생성자: 각 enum 상수마다 한글 이름을 지정하기 위해 사용
        Week(String korean) {
            this.korean = korean;
        }

        // 한글 이름을 외부에서 가져올 수 있도록 getter 메서드 정의
        public String getKorean() {
            return korean;
        }
    }

    public static void main(String[] args) {
        // 2. 사용자로부터 요일 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("요일을 입력하세요 (예: MONDAY, tuesday, SUNDAY): ");
        String input = scanner.nextLine().toUpperCase();  // 대소문자 구분 없이 처리하기 위해 대문자로 변환

        try {
            // 3. 문자열을 enum 상수로 변환
            Week day = Week.valueOf(input);  // 입력값을 enum 타입으로 변환

            // 4. 해당 요일의 한글 이름 출력
            System.out.println(day.name() + "는 " + day.getKorean() + "입니다.");

        } catch (IllegalArgumentException e) {
            // 5. 잘못된 요일을 입력한 경우 예외 처리
            System.out.println("잘못된 요일입니다.");
        }

        // 6. Scanner 자원 반납
        scanner.close();
    }
}
