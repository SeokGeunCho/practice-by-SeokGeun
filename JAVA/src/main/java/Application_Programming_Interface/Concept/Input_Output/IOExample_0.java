package Application_Programming_Interface.Concept.Input_Output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExample_0 {
    public static void main(String[] args) {
        // 파일에 쓰기
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("안녕하세요, 자바 파일 입출력입니다!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 파일에서 읽기
        try {
            FileReader reader = new FileReader("sample.txt");
            int ch;
            while((ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// 해설:
// FileWriter로 문자열을 파일에 저장하고,
// FileReader로 파일 내용을 한 글자씩 읽어옴
// 입출력 시에는 예외 처리를 반드시 해야 함 (try-catch)