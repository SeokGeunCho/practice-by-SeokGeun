package Collection.ArrayList_And_LinkedList.ArrayListPractice;

import java.util.ArrayList;     // ArrayList 클래스를 사용하기 위해 import
import java.util.Scanner;       // 사용자 입력을 받기 위해 Scanner 클래스 import

public class TodoListApp2 {
    public static void main(String[] args) {

        // ✅ 할 일 목록을 저장할 ArrayList 생성
        ArrayList<String> todos = new ArrayList<>();

        // ✅ 사용자 입력을 받기 위한 Scanner 생성
        Scanner scanner = new Scanner(System.in);

        // ✅ 프로그램 실행 여부를 저장할 변수
        boolean running = true;

        System.out.println("📝 TODO 리스트 프로그램");

        // ✅ 프로그램 실행 반복
        while (running) {
            // 메뉴 출력
            System.out.println("\n1. 할 일 추가");
            System.out.println("2. 할 일 목록 보기");
            System.out.println("3. 할 일 삭제");
            System.out.println("4. 종료");

            // 사용자 선택 받기
            System.out.print("선택 > ");
            int choice = scanner.nextInt();     // 숫자 입력 받음
            scanner.nextLine();                 // 숫자 입력 후 남은 엔터 처리

            // ✅ 사용자의 선택에 따라 기능 실행
            switch (choice) {
                case 1:
                    // 1번 선택: 할 일 추가
                    System.out.print("추가할 할 일 입력: ");
                    String task = scanner.nextLine();  // 문자열로 할 일 입력 받음
                    todos.add(task);                   // 리스트에 추가
                    System.out.println("✅ 추가 완료!");
                    break;

                case 2:
                    // 2번 선택: 전체 할 일 목록 보기
                    System.out.println("📋 현재 할 일 목록:");
                    if (todos.isEmpty()) {
                        // 리스트가 비었는지 확인
                        System.out.println(" - 비어있어요!");
                    } else {
                        // 반복문을 통해 모든 할 일 출력
                        for (int i = 0; i < todos.size(); i++) {
                            System.out.println((i + 1) + ". " + todos.get(i));
                        }
                    }
                    break;

                case 3:
                    // 3번 선택: 할 일 삭제
                    System.out.print("삭제할 번호 입력: ");
                    int index = scanner.nextInt() - 1;  // 사용자 입력은 1부터 시작하므로 -1

                    // 유효한 번호인지 확인 후 삭제
                    if (index >= 0 && index < todos.size()) {
                        String removed = todos.remove(index); // 해당 인덱스의 항목 삭제
                        System.out.println("❌ 삭제됨: " + removed);
                    } else {
                        System.out.println("⚠️ 올바른 번호를 입력해주세요.");
                    }
                    break;

                case 4:
                    // 4번 선택: 프로그램 종료
                    running = false;  // 반복 종료
                    System.out.println("👋 프로그램 종료");
                    break;

                default:
                    // 1~4 외 숫자 입력 시
                    System.out.println("❗ 1~4 중에서 선택해주세요.");
            }
        }

        // ✅ Scanner 자원 해제
        scanner.close();
    }
}

