// 왜 try-catch가 필요할까?
// Integer.parseInt("abc")처럼 숫자로 바꿀 수 없는 문자열이 들어오면
// 자바는 **예외(Exception)**를 발생시켜서 프로그램이 강제로 종료돼.
// 그래서 이런 상황을 미리 예상해서 try-catch로 예외를 처리해야 안전해!

package Parsing;

import java.util.Scanner;

public class ParsingWithRetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0; // 정수형 나이 저장 변수

        while (true) {
            System.out.print("나이를 숫자로 입력하세요: ");
            String input = sc.nextLine(); // 문자열 입력 받기

            try {
                age = Integer.parseInt(input); // 문자열을 정수로 변환 시도
                break; // 변환 성공 시 반복 종료
            } catch (NumberFormatException e) {
                System.out.println("❌ 숫자가 아닌 값을 입력했어요! 숫자로 다시 입력해주세요.");
            }
        }

        System.out.println("입력한 나이는 " + age + "살입니다.");
        sc.close();
    }
}
