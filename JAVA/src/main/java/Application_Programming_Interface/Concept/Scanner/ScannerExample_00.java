package Application_Programming_Interface.Concept.Scanner;

import java.util.Scanner;

public class ScannerExample_00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.println(name + "님의 나이는 " + age + "세입니다.");
    }
}
