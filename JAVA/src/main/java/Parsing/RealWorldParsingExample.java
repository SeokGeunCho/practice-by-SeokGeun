package Parsing;

import java.util.Scanner;

public class RealWorldParsingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        double height = 0.0;
        boolean isAudlt = false;

        // 나이 입력(int)
        while (true) {
            System.out.print("나이를 숫자로 입력하세요: ");
            String input = sc.nextLine();
            try {
                age = Integer.parseInt(input);  // 문자열 -> 정수로 변환
                break;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력! 숫자로 다시 입력해주세요.");
            }
        }
        // 키 입력 (double)
        while (true) {
            System.out.print("키를 입력하세요(cm): ");
            String input = sc.nextLine();
            try {
                height = Double.parseDouble(input); // 문자열 -> 실수로 변환
                break;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력! 숫자(소수 포함)로 다시 입력해주세요.");
            }
        }
        // 성인 여부 입력 (boolean)
        while (true) {
            System.out.print("성인입니까? (true/false): ");
            String input = sc.nextLine().toLowerCase(); // 대소문자 구분 없이 처리
            if (input.equals("true")) {
                isAudlt = true;
                break;
            } else if (input.equals("false")) {
                isAudlt = false;
                break;
            } else {
                System.out.println("'true' 또는 'false'만 입력해주세요.");
            }
        }
        System.out.println("\n입력 정보 확인:");
        System.out.println("나이: " + age + "살");
        System.out.println("키: " + height + "cm");
        System.out.println("성인 여부: " + (isAudlt ? "성인" : "미성년자"));

        sc.close();
    }
}
