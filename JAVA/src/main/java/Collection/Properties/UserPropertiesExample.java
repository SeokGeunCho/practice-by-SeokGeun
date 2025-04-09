package Collection.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class UserPropertiesExample {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성
        Properties userProps = new Properties(); // 사용자 정보를 저장할 Properties 객체 생성

        // 사용자 입력 받기
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        String age = sc.nextLine();  // 숫자도 문자열로 저장

        System.out.print("이메일을 입력하세요: ");
        String email = sc.nextLine();

        // Properties에 사용자 정보 저장 (key-value 형태)
        userProps.setProperty("name", name);
        userProps.setProperty("age", age);
        userProps.setProperty("email", email);

        // 1. user.properties 파일로 저장
        FileOutputStream fos = new FileOutputStream("user.properties");
        userProps.store(fos, "User Information"); // 파일로 저장하며 주석도 함께 기록됨
        fos.close(); // 파일 스트림 닫기

        System.out.println("\n✅ 사용자 정보가 파일에 저장되었습니다.");

        // 2. user.properties 파일에서 다시 불러오기
        Properties loadedProps = new Properties(); // 읽어올 Properties 객체 새로 생성
        FileInputStream fis = new FileInputStream("user.properties");
        loadedProps.load(fis); // 파일로부터 Properties 로딩
        fis.close();

        // 3. 저장된 정보 출력
        System.out.println("\n📄 파일에서 불러온 사용자 정보:");
        System.out.println("이름: " + loadedProps.getProperty("name"));
        System.out.println("나이: " + loadedProps.getProperty("age"));
        System.out.println("이메일: " + loadedProps.getProperty("email"));

        sc.close(); // Scanner 닫기
    }
}

