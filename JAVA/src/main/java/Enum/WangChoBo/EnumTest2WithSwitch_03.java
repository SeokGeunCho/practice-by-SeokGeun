package Enum.WangChoBo;

public class EnumTest2WithSwitch_03 {

    // 🔸 1. enum으로 계절 정의
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        // 🔸 2. 현재 계절을 SPRING으로 설정
        Season now = Season.SPRING;

        // 🔸 3. Switch문으로 계절별 출력
        switch (now) {
            case SPRING:
                System.out.println("봄이 왔어요!");
                break;
            case SUMMER:
                System.out.println("여름엔 바다죠!");
                break;
            case FALL:
                System.out.println("가을은 단풍의 계절!");
                break;
            case WINTER:
                System.out.println("겨울엔 눈이 와요!");
                break;
        }

    }
}
