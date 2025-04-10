package Enum.WangChoBo;

public class EnumTest2WithValues_04 {

    // 🔸 1. enum으로 계절 정의
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        // 🔸 2. values()로 모든 enum 값 가져오기
        for (Season seasons : Season.values()) {
            // 3. 하나씩 출력
            System.out.println("계절: " + seasons);
        }
    }
}
