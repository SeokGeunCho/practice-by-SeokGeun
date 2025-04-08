package Parsing.MiniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UserFilterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        // 사용자 3명 입력받기 (이전과 동일)
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n[" + i + "번째 사용자]");
            int age = 0;
            double height = 0;
            boolean isAdult = false;

            while (true) {
                System.out.print("나이: ");
                String input = sc.nextLine();
                try {
                    age = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 다시 입력해주세요.");
                }
            }
            while (true) {
                System.out.print("키(cm): ");
                String input = sc.nextLine();
                try {
                    height = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 다시 입력해주세요.");
                }
            }

            while (true) {
                System.out.print("성인인가요? (true/false):");
                String input = sc.nextLine().toLowerCase();
                if (input.equals("true")) {
                    isAdult = true;
                    break;
                } else if (input.equals("false")) {
                    isAdult = false;
                    break;
                } else {
                    System.out.println("'ture' 또는 'false'로 입력해주새요.");
                }
            }
        }
        System.out.println("\n[전체 사용자 목록]");
        for (User user : users) {
            user.printInfo();
        }
        // 성인만 출력
        System.out.println("\n[성인 사용자 목록]");
        for (User user : users) {
            if (user.isAdult) {
                user.printInfo();
            }
        }
        // 키가 170이상인 사용자 출력
        System.out.println("\n[키가 170cm이상인 사용자 목록]");
        for (User user : users) {
            if (user.height >= 170) {
                user.printInfo();
            }
        }
        // 나이가 20~30세인 사용자 출력
        System.out.println("\n[20~30살 사이 사용자 목록]");
        for (User user : users) {
            if (user.age >= 20 && user.age <= 30) {
                user.printInfo();
            }
        }
        sc.close();
    }
}