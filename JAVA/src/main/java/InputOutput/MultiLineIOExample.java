package InputOutput;

import java.io.*;
import java.util.List;

public class MultiLineIOExample {
    public static void main(String[] args) {
        // 여러 줄 데이터를 리스트로 준비
        List<String> linesToWrite = List.of(
                "1. 자바 공부하기",
                "2. 점심 먹기",
                "3. 운동하기",
                "4. 복습하기"
        );
        // 파일에 여러 줄 쓰기
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("todo.txt"))){
            for (String line : linesToWrite) {
                writer.write(line); // 한 줄 쓰기
                writer.newLine();   // 줄바꿈 추가
            }
            System.out.println("파일에 여러 줄 쓰기 완료!");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류: " + e.getMessage());
        }
        System.out.println("\n 파일에서 한 줄씩 읽기: ");

        // 파일에서 여러 줄 일기
        try (BufferedReader reader = new BufferedReader(new FileReader("todo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println("읽은 줄: " + line);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류: " + e.getMessage());
        }
    }
}
