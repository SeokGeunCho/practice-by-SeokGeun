// 🎯 실습 문제: 비밀번호 재시도 로그인 시스템 만들기

// 🔧 문제 설명:
// 사용자가 아이디와 비밀번호를 입력한다.
// 아이디는 "admin"이고, 비밀번호는 "1234"일 때만 로그인 성공.
// 로그인에 실패하면 다시 시도할 수 있게 하고,
// 총 5번 실패하면 프로그램 종료.
// 로그인 성공 시 환영 메시지를 출력하고 종료.

// ✨ 추가 조건:
// 로그인 성공 후 3회에 걸쳐 메뉴를 출력:
// 내 정보 보기
// 로그아웃
// 종료

package Multiple_Conditional_Statements.LoginSystem;

import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 가져오기

public class LoginSystem { // 클래스 선언
    public static void main(String[] args) { // 메인 메서드 (프로그램 시작점)
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성 (입력 받기용)

        String correctId = "admin";     // 정답 아이디
        String correctPw = "1234";      // 정답 비밀번호

        int attempt = 0;                // 로그인 시도 횟수 저장용
        boolean loggedIn = false;       // 로그인 성공 여부 저장 변수

        // 최대 5번까지 로그인 시도 가능
        do {
            System.out.print("아이디 입력: ");
            String inputId = scanner.nextLine(); // 아이디 입력 받기

            System.out.print("비밀번호 입력: ");
            String inputPw = scanner.nextLine(); // 비밀번호 입력 받기

            // 아이디와 비밀번호가 둘 다 일치하는지 확인
            if (inputId.equals(correctId) && inputPw.equals(correctPw)) {
                System.out.println("로그인 성공!");
                loggedIn = true;   // 로그인 성공 표시
                break;             // 반복문 탈출 (더 이상 시도 안함)
            } else {
                attempt++; // 실패 시 시도 횟수 1 증가
                System.out.println("로그인 실패 (" + attempt + "/5)");
            }

        } while (attempt < 5); // 시도 횟수가 5보다 작을 동안 계속

        // 로그인 성공한 경우만 아래 메뉴 출력
        if (loggedIn) {
            for (int i = 0; i < 3; i++) { // 최대 3번까지 메뉴 반복
                System.out.println("\n[메뉴 선택]");
                System.out.println("1. 내 정보 보기");
                System.out.println("2. 로그아웃");
                System.out.println("3. 종료");

                System.out.print("선택: ");
                String choice = scanner.nextLine(); // 메뉴 번호 입력

                if (choice.equals("1")) { // 1번 선택: 내 정보 보기
                    System.out.println("[내 정보] 아이디: " + correctId);
                } else if (choice.equals("2")) { // 2번 선택: 로그아웃
                    System.out.println("로그아웃 되었습니다.");
                    break; // 메뉴 반복 종료
                } else if (choice.equals("3")) { // 3번 선택: 종료
                    System.out.println("프로그램 종료합니다.");
                    break; // 반복 종료
                } else {
                    System.out.println("잘못된 선택입니다."); // 잘못된 번호
                }
            }
        } else {
            // 로그인 실패한 경우 (5번 모두 실패)
            System.out.println("5회 이상 로그인 실패. 프로그램 종료.");
        }

        scanner.close(); // Scanner 닫기 (자원 해제)
    }
}

