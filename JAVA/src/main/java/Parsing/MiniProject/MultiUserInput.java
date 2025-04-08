package Parsing.MiniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        System.out.println("사용자 3명의 정보를 입력하세요.");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + i + "번째 사용자");

            int age = 0;
            double height = 0.0;
            boolean isAdult = false;

            // 나이 입력
            while (true) {
                System.out.println();
                String input = sc.nextLine();
                try {
                    age = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 다시 입력해주세요.");
                }
            }
            // 키 입력
            while (true) {
                System.out.println("키(cm): ");
                String input = sc.nextLine();
                try {
                    height = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 다시 입력해주세요.");
                }
            }
            // 성인 여부 입력
            while (true) {
                System.out.println("성인인가요? (true/false): ");
                String input = sc.nextLine();
                if (input.equals("true")) {
                    isAdult = true;
                    break;
                } else if (input.equals("false")) {
                    isAdult = false;
                    break;
                } else {
                    System.out.println("'true' 또는 'false'로 입력해주세요.");
                }
            }
        }
        // 저장된 사용자 정보 출력
        System.out.println("\n 입력한 사용자 정보 목록:");
        for (User user : users) {
            user.printInfo();
        }
        sc.close();
    }
}
