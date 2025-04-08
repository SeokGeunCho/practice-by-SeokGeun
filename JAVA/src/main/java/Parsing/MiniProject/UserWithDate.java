package Parsing.MiniProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class UserWithDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        System.out.println("사용자 3명의 정보를 입력하세요.");

        for(int i = 1; i <= 3; i++) {
            System.out.println("\n[" + i + "번째 사용자");
            int age = 0;
            double height = 0.0;
            boolean isAdult = false;
            // 🔸 나이 입력
            while (true) {
                System.out.print("나이: ");
                String input = sc.nextLine();
                try {
                    age = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("❌ 숫자로 다시 입력해주세요.");
                }
            }

            // 🔸 키 입력
            while (true) {
                System.out.print("키(cm): ");
                String input = sc.nextLine();
                try {
                    height = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("❌ 숫자로 다시 입력해주세요.");
                }
            }

            // 🔸 성인 여부 입력
            while (true) {
                System.out.print("성인인가요? (true/false): ");
                String input = sc.nextLine().toLowerCase();
                if (input.equals("true")) {
                    isAdult = true;
                    break;
                } else if (input.equals("false")) {
                    isAdult = false;
                    break;
                } else {
                    System.out.println("❌ 'true' 또는 'false'로 입력해주세요.");
                }
            }

            // 🔸 현재 시간 저장
            LocalDateTime now = LocalDateTime.now();

            // 🔸 사용자 추가
            users.add(new User(age, height, isAdult, now));
        }

        // 🔸 사용자 전체 출력
        System.out.println("\n✅ 입력한 사용자 정보 목록 (등록일 포함):");
        for (User user : users) {
            user.printInfo();
            System.out.println(); // 줄 바꿈
        }

        sc.close();
    }
}