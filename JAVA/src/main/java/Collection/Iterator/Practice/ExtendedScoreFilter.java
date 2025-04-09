package Collection.Iterator.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExtendedScoreFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력용 Scanner 생성
        ArrayList<Integer> scores = new ArrayList<>(); // 점수 저장용 리스트

        System.out.println("학생 점수를 입력하세요. (-1 입력 시 종료)");

        // 사용자로부터 점수 입력받기
        while (true) {
            System.out.print("점수 입력: ");
            int input = sc.nextInt();
            if (input == -1) break; // -1 입력 시 입력 종료
            scores.add(input); // 리스트에 점수 추가
        }

        System.out.println("입력된 점수: " + scores);

        // Iterator를 사용하여 불합격 점수 제거
        Iterator<Integer> it = scores.iterator();
        while (it.hasNext()) {
            int score = it.next();
            if (score < 60) {
                it.remove(); // 60점 미만 삭제
            }
        }

        // 합격 점수 출력
        System.out.println("✅ 합격 점수: " + scores);

        // 조건: 합격자가 없을 경우
        if (scores.isEmpty()) {
            System.out.println("😢 합격자가 없습니다.");
        } else {
            // 합격자 수
            int count = scores.size();

            // 평균과 최고점 계산
            int sum = 0;
            int max = scores.get(0); // 가장 첫 점수를 초기값으로 설정

            for (int s : scores) {
                sum += s;
                if (s > max) max = s;
            }

            double average = (double) sum / count;

            // 결과 출력
            System.out.println("🎓 합격자 수: " + count);
            System.out.println("📊 평균 점수: " + average);
            System.out.println("🏆 최고 점수: " + max);
        }

        sc.close(); // Scanner 자원 해제
    }
}