package Application_Programming_Interface.Concept.Input_Output;

import java.io.*;

public class IOExampleWithTryCatch {
    public static void main(String[] args) {
        // 파일에 쓰기
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
            writer.write("안녕하세요");
            writer.close(); // 파일 닫기
            System.out.println("파일에 쓰기 성공!");
        } catch (IOException e) {
            // 예외 발생 시 출력
            System.out.println("파일 쓰기 중 오류 발생: " + e.getMessage());
        }

        // 파일에서 읽기
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String line = reader.readLine(); // 한줄 읽기
            System.out.println("파일 내용: " + line);
            reader.close(); // 파일 닫기
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}

/**
 * ☑️ 왜 try-catch를 써야 할까?
 * 파일이 없는 경우
 * 파일이 잠겨 있거나 권한이 없는 경우
 * 디스크가 가득 찬 경우 등등
 * 이런 상황이 생겼을 때 프로그램이 멈추지 않고, "오류를 알려주고 종료되도록" 만들 수 있다.
 */
