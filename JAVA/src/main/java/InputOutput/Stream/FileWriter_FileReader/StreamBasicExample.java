package InputOutput.Stream.FileWriter_FileReader;

import java.io.FileReader; // FileReader: 텍스트 파일을 읽을 때 사용.
import java.io.FileWriter; // FileWriter: 텍스트 파일에 쓸 때 사용.
import java.io.IOException; // IOException: 입출력 작업 중 오류가 발생할 수 있으므로 예외 처리를 위해 사용합니다.

public class StreamBasicExample {
    public static void main(String[] args) {

        // 파일에 문자열 쓰기
        try (FileWriter writer = new FileWriter("testing.txt")) {
            writer.write("안녕하세요\n자바 스트림 배우는 중입니다.");
            System.out.println("파일 쓰기 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 파일에 문자열 읽기
        try (FileReader reader = new FileReader("testing.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);    // 읽은 문자를 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//🔸 설명
// FileWriter는 문자를 파일에 출력(쓰기)
// FileReader는 파일에서 문자를 입력(읽기)
// read()는 한 글자씩 읽으며, 더 이상 읽을 게 없으면 -1 반환
// try-with-resources는 파일, 스트림처럼 닫아줘야 하는 자원을
// 자동으로 close()해주는 깔끔하고 안전한 방식입니다.
// 📦 장점 요약
// 장점	설명
// 자동 자원 해제	close() 자동 호출, 실수 방지
// 코드 간결함	finally 생략 가능
// 예외 처리 편리	catch만 작성하면 됨
