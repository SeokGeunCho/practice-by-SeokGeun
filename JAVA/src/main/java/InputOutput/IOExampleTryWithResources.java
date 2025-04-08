package InputOutput;

import java.io.*;

public class IOExampleTryWithResources {
    public static void main(String[] args) {
        // try-with-resources로 파일 쓰기
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))){
            writer.write("안녕하세요!");
            System.out.println("파일에 쓰기 성공!");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류 발생:" + e.getMessage());
        }

        // try-with-resources로 파일 일기
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
            String line= reader.readLine();
            System.out.println("파일 내용 " + line);
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}
