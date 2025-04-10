package Enum.WangChoBo;

public class EnumTest1 {

    // 요일을 enum으로 정함 (고정된 값)
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        // 2. enum 값을 변수에 저장

        Day today = Day.THURSDAY;  // 오늘 요일을 '목요일'로 설정

        // 3. 출력
        System.out.println("오늘은 " + today); // 결과: 오늘은 THURSDAY
    }
}
