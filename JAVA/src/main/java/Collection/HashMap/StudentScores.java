package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();    // Map<String, Integer>	이름(문자열) → 점수(정수) 매핑
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 학생 성적표 등록 시스템 ===");

        while (true) {
            System.out.print("학생 이름 입력 (종료: '끝'): ");
            String name = sc.nextLine();

            if (name.equals("끝")) break;

            System.out.print(name + "의 점수를 입력하세요: ");
            String input = sc.nextLine();

            try {
                int score = Integer.parseInt(input); // 문자열을 정수로 형변환
                scoreMap.put(name, score); // scoreMap.put(name, score)	이름-점수를 Map에 저장
                System.out.println("성적 등록 완료!");
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닌 값을 입력했어요. 다시 시도해주세요.");
            }
        }
        // 전체 성적 출력
        System.out.println("\n 학생 성적표 목록:");
        for (String student : scoreMap.keySet()) {
            System.out.println("- " + student + ": " + scoreMap.get(student) + "점"); // scoreMap.get(name)	이름으로 점수 불러오기
        }
        sc.close(); // Scanner 닫기
    }
}
