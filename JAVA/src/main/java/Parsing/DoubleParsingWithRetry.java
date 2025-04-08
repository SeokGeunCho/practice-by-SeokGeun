package Parsing;

import java.util.Scanner;

public class DoubleParsingWithRetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = 0;

        while(true) {
            System.out.print("키를 입력하세요(cm): ");
            String input = sc.nextLine();

            try {
                height = Double.parseDouble(input); // 문자열 -> 실수 변환 시도
                break;  // 성공하면 반복문 종료
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식이 아니에요. 다시 입력해 주세요.");
            }
        }
        System.out.println("당신의 키는 " + height + "cm 입니다.");
        sc.close();
    }
}
