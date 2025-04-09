package Multiple_Conditional_Statements.ATMApp;

import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        int balance = 100000; // 초기 잔액
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("\n[ATM 메뉴]");
            System.out.println("1. 잔액 조회");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt(); // 메뉴 번호 입력

            switch (choice) {
                case 1:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 2:
                    System.out.print("입금할 금액을 입력하세요: ");
                    int deposit = scanner.nextInt();
                    if (deposit <= 0) {
                        System.out.println("올바른 금액을 입력해주세요.");
                    } else {
                        balance += deposit;
                        System.out.println(deposit + "원이 입금되었습니다.");
                    }
                    break;
                case 3:
                    System.out.print("출금할 금액을 입력하세요: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= 0) {
                        System.out.println("올바른 금액을 입력해주세요.");
                    } else if (withdraw > balance) {
                        System.out.println("잔액이 부족합니다.");
                    } else {
                        balance -= withdraw;
                        System.out.println(withdraw + "원이 출금되었습니다.");
                    }
                    break;
                case 4:
                    System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다.");
                    scanner.close();
                    return; // main 종료
                default:  // 사용자가 입력한 값이 switch의 어떤 case에도 해당되지 않을 경우 실행되는 **"예외 처리" or "기본 동작"**
                    System.out.println("올바른 메뉴 번호를 선택해주세요.");
            }
        }
    }
}

