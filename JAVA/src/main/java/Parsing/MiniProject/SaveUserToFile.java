package Parsing.MiniProject;

import java.io.FileWriter;
import java.util.Scanner;

public class SaveUserToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        double height = 0.0;
        boolean isAdult = false;

        // 나이 입력
        while (true) {
            System.out.print("나이를 숫자로 입력하세요: ");
            String input = sc.nextLine();
            try {
                age = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("숫자로 다시 입력해주세요!");
            }
    }
        // 키 입력
        while (true) {
            System.out.print("키를 입력하세요(cm): ");
            String input = sc.nextLine();
            try {
                height = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("숫자로 다시 입력해주세요!");
            }
        }
        // 성인 여부 입력
        while (true) {
            System.out.print("성인입니까? (true/false): ");
            String input = sc.nextLine();
            if (input.equals("true")) {
                isAdult = true;
                break;
            } else if (input.equals("false")) {
                isAdult = false;
                break;
            } else {
                System.out.println("'true' 또는 'false'만 입력해주세요.");
            }
        }
        // 파일에 저장하기
        try (FileWriter fw = new FileWriter("user_info.txt",false)) {
            fw.write("사용자 정보\n");
            fw.write("나이: " + age + "살\n");
            fw.write("키: " + height + "cm\n");
            fw.write("성인 여부: " + (isAdult ? "성인" : "미성년자") + "\n");
            System.out.println("정보가 user_info.txt 파일에 저장되었습니다.");
        } catch (Exception e) {
            System.out.println("파일 저장 중 오류가 발생했습니다.");
        }
        sc.close();
    }
}
