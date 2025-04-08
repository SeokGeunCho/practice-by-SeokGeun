package Parsing.MiniProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class UserSaveToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        // 🔸 사용자 3명 입력
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n[" + i + "번째 사용자]");
            int age = 0;
            double height = 0.0;
            boolean isAdult = false;

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

            LocalDateTime now = LocalDateTime.now();
            users.add(new User(age, height, isAdult, now));
        }

        // ✅ 파일로 저장
        String fileName = "users.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
                writer.write(user.toFileString()); // 한 줄씩 저장
                writer.newLine(); // 줄 바꿈
            }
            System.out.println("\n✅ 사용자 정보를 '" + fileName + "' 파일에 저장했습니다.");
        } catch (IOException e) {
            System.out.println("❌ 파일 저장 중 오류 발생: " + e.getMessage());
        }

        sc.close();
    }
}
