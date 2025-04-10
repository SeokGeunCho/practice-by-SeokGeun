package Enum.WangChoBo;

public class EnumTest2WithIf_02 {

    // 🔸 1. enum으로 계절 정의
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        // 🔸 2. 현재 계절을 SPRING으로 설정
        Season now = Season.SUMMER;
        
        // 🔸 3. if문으로 계절 확인
        if (now == Season.SPRING) {
            System.out.println("봄이 최고지!");
        } else {
            System.out.println("지금은 봄이 아니야!");
        }
    }
}
