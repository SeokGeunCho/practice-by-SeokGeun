package Collection.ArrayList_And_LinkedList.ArrayListPractice;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        while (true) {
            System.out.println("\n[To-Do List 관리 프로그램]");
            System.out.println("1. 할 일 추가 | 2. 삭제 | 3. 수정 | 4. 전체 보기 | 0. 종료");
            System.out.print("메뉴 선택: ");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                System.out.print("할 일 입력: ");
                String task = sc.nextLine();
                todoList.add(task);
                System.out.println("[" + task + "]가 추가되었습니다.");
            } else if (menu == 2) {
                System.out.print("삭제할 항목 입력: ");
                String task = sc.nextLine();
                if (todoList.remove(task)) {
                    System.out.println("[" + task + "]가 삭제되었습니다.");
                } else {
                    System.out.println("해당 항목이 없습니다.");
                }
            } else if (menu == 3) {
                System.out.print("수정할 항목 입력: ");
                String oldTask = sc.nextLine();
                int index = todoList.indexOf(oldTask);
                if (index != -1) {
                    System.out.print("새 항목 입력: ");
                    String newTask = sc.nextLine();
                    todoList.set(index, newTask);
                    System.out.println(oldTask + " → " + newTask + "로 수정되었습니다.");
                } else {
                    System.out.println("해당 항목이 없습니다.");
                }
            } else if (menu == 4) {
                System.out.println("\n현재 할 일 목록:");
                if (todoList.isEmpty()) {
                    System.out.println("할 일이 없습니다.");
                } else {
                    for (int i = 0; i < todoList.size(); i++) {
                        System.out.println((i + 1) + ". " + todoList.get(i));
                    }
                }
            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        }

        sc.close();
    }
}

