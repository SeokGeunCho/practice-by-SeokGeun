package Multiple_Conditional_Statements.BreakContinueNested;

public class BreakContinueNested {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            if (dan == 8) {
                System.out.println("[8단에서 출력 중지]");
                break; // 8단부터는 전체 출력 종료
            }

            if (dan % 2 == 0) {
                System.out.println("[" + dan + "단은 건너뜁니다]");
                continue; // 짝수 단은 출력하지 않음
            }

            System.out.println("[" + dan + "단]");

            for (int i = 1; i <= 9; i++) {
                if ((dan * i) % 5 == 0) {
                    continue; // 결과가 5의 배수이면 출력 생략
                }

                System.out.println(dan + " x " + i + " = " + (dan * i));
            }

            System.out.println(); // 단 구분용 줄바꿈
        }
    }
}

