package InputOutput;

import java.io.*; // java.io 패키지는 입출력(IO) 관련 클래스를 모아놓은 곳,
                  // BufferedWriter, FileWriter, BufferedReader, FileReader 등이 있다

public class IOExample_00 {
    public static void main(String[] args) throws IOException { // throws IOException은 파일을 다룰 때 오류가 생길 수 있기 때문에
                                                                // 꼭 붙여줘야 한다. 예: 파일이 없거나, 권한이 없거나, 저장 실패 시
        // 파일에 쓰기

        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        //FileWriter("test.txt") test.txt라는 이름의 파일을 열거나, 없으면 새로 만든다.
        // BufferedWriter는 데이터를 빠르게 쓰기 위해 사용하는 "버퍼 기능이 있는" 쓰기 도구야. FileWriter를 감싸서 효율적으로 글자를 씀.

        writer.write("안녕하세요"); // 파일에 "안녕하세요"라는 내용을 씀.
        writer.close(); // 파일을 닫아줘야 저장이 완료됨!,  닫지 않으면 파일이 손상되거나 안 써질 수 있음.

        // 파일에서 읽기

        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        //  FileReader("test.txt") → test.txt 파일을 읽기 모드로 연다.
        // BufferedReader → 텍스트 파일을 한 줄씩 효율적으로 읽을 수 있게 도와준다.

        String line = reader.readLine(); // reader.readLine() → 파일의 첫 줄을 읽어서 line 변수에 저장한다.
        System.out.println("파일 내용: " + line); // System.out.println("파일 내용: " + line); → 콘솔에 읽어온 내용을 출력해.
        reader.close(); // reader.close(); → 파일을 닫아서 메모리를 정리해줘야 해.
    }
}
