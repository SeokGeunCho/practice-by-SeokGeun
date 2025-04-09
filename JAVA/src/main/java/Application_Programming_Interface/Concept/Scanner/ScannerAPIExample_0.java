package Application_Programming_Interface.Concept.Scanner;

import java.util.Scanner;

public class ScannerAPIExample_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 키보드 입력을 받을 수 있는 Scanner 객체 생성

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();   // 사용자가 입력한 한 줄을 문자열로 읽어옴

        System.out.println("안녕하세요, " + name + "님!"); // 입력받은 값을 출력문에 같이 넣어서 인사 출력
    }
}
