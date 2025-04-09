package Multiple_Conditional_Statements.NumberGuessGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int answer = rand.nextInt(100) + 1; // 1 ~ 100 랜덤 숫자 생성
        Scanner scanner = new Scanner(System.in);

        int tryCount = 0; // 시도 횟수 저장용

        System.out.println("[숫자 맞추기 게임 시작!]\n1~100 사이 숫자를 맞춰보세요 (0 입력 시 종료)");
    //    System.out.println("1~100 사이 숫자를 맞춰보세요 (0 입력 시 종료)");

        while (true) {
            System.out.print("숫자 입력: ");
            int userInput = scanner.nextInt(); // 사용자 숫자 입력

            if (userInput == 0) {
                System.out.println("게임을 포기하셨습니다.");
                break; // 게임 종료
            }

            tryCount++; // 시도 횟수 증가

            if (userInput < answer) {
                System.out.println("더 큰 숫자!");
            } else if (userInput > answer) {
                System.out.println("더 작은 숫자!");
            } else {
                System.out.println("정답입니다! 총 " + tryCount + "번 만에 맞췄어요!");
                break; // 정답이면 게임 종료
            }
        }

        scanner.close();
    }
}

