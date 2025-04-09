package Collection.HashMap.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class MenuManager {
    public static void main(String[] args) {
        // 메뉴 이름(String)과 가격(Integer)을 저장할 HashMap 생성
        HashMap<String, Integer> menu = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // 사용자에게 기능 선택 메뉴 출력
            System.out.println("\n🍕 메뉴 관리 프로그램");
            System.out.println("1. 전체 메뉴 출력");
            System.out.println("2. 메뉴 추가");
            System.out.println("3. 메뉴 삭제");
            System.out.println("4. 가격 조회");
            System.out.println("5. 가격 수정");
            System.out.println("6. 종료");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine();  // 개행 문자 제거

            switch (choice) {
                case 1:
                    // 전체 메뉴 출력
                    if (menu.isEmpty()) {
                        System.out.println("📂 등록된 메뉴가 없습니다.");
                    } else {
                        System.out.println("📋 메뉴 목록:");
                        for (String name : menu.keySet()) {
                            System.out.println(name + " : " + menu.get(name) + "원");
                        }
                    }
                    break;

                case 2:
                    // 메뉴 추가
                    System.out.print("추가할 메뉴 이름: ");
                    String addName = sc.nextLine();

                    System.out.print("가격 입력: ");
                    int addPrice = sc.nextInt();
                    sc.nextLine();

                    menu.put(addName, addPrice); // 이미 있으면 덮어쓰기
                    System.out.println("✅ 메뉴가 추가되었습니다.");
                    break;

                case 3:
                    // 메뉴 삭제
                    System.out.print("삭제할 메뉴 이름: ");
                    String delName = sc.nextLine();

                    if (menu.containsKey(delName)) {
                        menu.remove(delName);
                        System.out.println("🗑 메뉴가 삭제되었습니다.");
                    } else {
                        System.out.println("❌ 해당 메뉴가 존재하지 않습니다.");
                    }
                    break;

                case 4:
                    // 가격 조회
                    System.out.print("조회할 메뉴 이름: ");
                    String searchName = sc.nextLine();

                    if (menu.containsKey(searchName)) {
                        System.out.println(searchName + "의 가격은 " + menu.get(searchName) + "원입니다.");
                    } else {
                        System.out.println("❌ 해당 메뉴가 존재하지 않습니다.");
                    }
                    break;

                case 5:
                    // 가격 수정
                    System.out.print("수정할 메뉴 이름: ");
                    String updateName = sc.nextLine();

                    if (menu.containsKey(updateName)) {
                        System.out.print("새로운 가격 입력: ");
                        int newPrice = sc.nextInt();
                        sc.nextLine();
                        menu.put(updateName, newPrice); // 값 덮어쓰기
                        System.out.println("💰 가격이 수정되었습니다.");
                    } else {
                        System.out.println("❌ 해당 메뉴가 존재하지 않습니다.");
                    }
                    break;

                case 6:
                    // 종료
                    running = false;
                    System.out.println("👋 프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("⚠ 올바른 메뉴 번호를 입력하세요.");
            }
        }

        sc.close(); // Scanner 자원 해제
    }
}
