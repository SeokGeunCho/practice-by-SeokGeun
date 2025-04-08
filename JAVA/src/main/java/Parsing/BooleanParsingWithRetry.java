package Parsing;

import java.util.Scanner;

public class BooleanParsingWithRetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAdult = false;

    while (true) {
        System.out.print("성인입니까? (true/false): ");
        String input = sc.nextLine().toLowerCase(); // 소문자로 변환

        if (input.equals("true")) {
            isAdult = true;
            break;
        } else if (input.equals("false")) {
            isAdult = false;
            break;
        } else {
            System.out.println("'ture' 또는 'false'만 입력해주세요!");
        }
    }
        System.out.println("성인 여부: " + (isAdult ? "성인" : "미성년자"));
        sc.close();
    }
}
