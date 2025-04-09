package Collection.ArrayList_And_LinkedList.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceList {
    public static void main(String[] args) {
       ArrayList<String> students = new ArrayList<>(); // ArrayList<String> students 출석한 학생들 이름 저장할 리스트
       Scanner sc = new Scanner(System.in);

       System.out.println("=== 출석부 등록 시스템 ===");
       while (true) {                                               // while (true)	이름을 계속 입력 받기 위한 반복문
           System.out.print("이름을 입력하세요 (종료하려면 '끝' 입력): ");
           String name = sc.nextLine();                             // 사용자로부터 이름 입력받기

           if (name.equals("끝")) {
               break;                                              // '끝을 입력하면 반복종료
           }
           students.add(name);                             // students.add(name) 입력한 이름을 리스트에 추가
           System.out.println(name + " 출석 완료!");
       }

       // 전체 출석 학생 출력
        System.out.println("\n 오늘 출석한 학생 명단:");
       for (String student : students) {
           System.out.println("- " + student);
       }
       sc.close(); // Scanner 닫기
    }
}
