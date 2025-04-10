package Enum.WangChoBo;

public class EnumTest2_01 {

    // 🔸 1. enum으로 계절 정의
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        // 🔸 2. 현재 계절을 SPRING으로 설정
        Season now = Season.SPRING;

        // 🔸 3. 출력
        System.out.println("지금은 " + now);
    }
}
