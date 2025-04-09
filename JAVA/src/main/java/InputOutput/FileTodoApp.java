package InputOutput;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileTodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받는 도구

        System.out.print("할 일을 입력하세요: ");
        String userInput = scanner.nextLine(); // 한 줄 입력 받기

        // 현재 날짜/시간 구하기 ( 아래 포맷으로 외우길 )
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDate = now.format(formatter);

        // 입력과 날짜를 한 줄로 합치기
        String lineToAdd = formattedDate + " - " + userInput;

        // 🔹 파일에 입력 내용 추가 (append 모드 true!)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("todo.txt", true))) {
        //두 번째 파라미터 true는 append(덧붙이기) 기존 내용은 유지되고, 새로운 줄만 추가된다.
            writer.write(lineToAdd);
            writer.newLine();
            System.out.println("✅ 할 일이 저장되었습니다!");
        } catch (IOException e) {
            System.out.println("파일 저장 오류: " + e.getMessage());
        }

        // 🔍 검색 기능
        System.out.print("\n검색할 키워드를 입력하세요: ");
        String keyword = scanner.nextLine();

        System.out.println("\n🔍 검색 결과:");
        try (BufferedReader reader = new BufferedReader(new FileReader("todo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) { // 파일에서 한 줄씩 읽으며, 입력한 keyword가 들어있는 줄만 출력
                    System.out.println("📌 " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }

        scanner.close(); // 입력 도구 닫기
    }
}
