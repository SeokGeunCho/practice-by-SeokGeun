package A_TheWorkingCode.Practice001;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    // 사원 리스트 저장용 ArrayList
    static ArrayList<Employee> empList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n📋 메뉴: 1. 사원 추가  2. 전체 출력  3. ID 검색  0. 종료");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();
            sc.nextLine(); // 개행 제거

            if (choice == 1) {
                addEmployee(); // 사원 추가
            } else if (choice == 2) {
                printAll(); // 전체 출력
            } else if (choice == 3) {
                searchById(); // ID로 검색
            } else if (choice == 0) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }

    // 1. 사원 추가 메서드
    public static void addEmployee() {
        System.out.print("사원 ID: ");
        String id = sc.nextLine();
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("부서: ");
        String dept = sc.nextLine();

        empList.add(new Employee(id, name, dept)); // 리스트에 추가
        System.out.println("✅ 사원 정보가 저장되었습니다.");
    }

    // 2. 전체 사원 출력
    public static void printAll() {
        System.out.println("\n📂 전체 사원 목록");
        for (Employee e : empList) {
            System.out.println(e); // toString() 출력
        }
    }

    // 3. ID로 사원 검색
    public static void searchById() {
        System.out.print("검색할 사원 ID: ");
        String searchId = sc.nextLine();
        boolean found = false;

        for (Employee e : empList) {
            if (e.getId().equals(searchId)) {
                System.out.println("🔍 검색 결과: " + e);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ 해당 ID의 사원이 존재하지 않습니다.");
        }
    }
}
