//           변환 대상	                 사용 메서드
//        String → int	          Integer.parseInt("123")
//        String → double	      Double.parseDouble("3.14")
//        String → boolean	      Boolean.parseBoolean("true")
//        int → String	          String.valueOf(123) 또는 123 + ""
//        double → String         String.valueOf(3.14)
//        boolean → String        String.valueOf(true)

package Parsing;

import java.util.Scanner;

public class ParsingExample_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 정수(int)로 변환
        System.out.print("나이를 입력하세요: ");
        String ageInput = sc.nextLine();         // 사용자 입력은 항상 문자열!
        int age = Integer.parseInt(ageInput);    // 문자열 -> 정수로 형변환
        System.out.println("당신의 나이는 " + age + "살입니다.");

        // 문자열 실수(double)로 변환
        System.out.print("키를 입력하세요(cm): ");
        String heightInput = sc.nextLine();
        double height = Double.parseDouble(heightInput);  // 문자열 -> 실수로 변환
        System.out.println("당신의 키는 " + height + "cm 입니다.");

        // 정수(int) -> 문자열로 변환
        String ageStr = String.valueOf(age);    // 정수 -> 문자열
        System.out.println("나이를 문자열로 변환하면: " + ageStr + " (String)");

        // 문자열을 불린(boolean)으로 변환
        System.out.print("성인이 맞습니까? (true/false): ");
        String isAdultInput = sc.nextLine();
        boolean isAdult = Boolean.parseBoolean(isAdultInput);  // 문자열 -> boolean

        if (isAdult) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("성인이 아닙니다.");
        }
        sc.close();
    }
}
