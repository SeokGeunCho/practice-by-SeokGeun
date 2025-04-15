package Collection.Queue.Practice;

import java.util.LinkedList; // Queue 자료구조를 위해 LinkedList 사용
import java.util.Queue;
import java.util.Scanner;

public class CustomerQueueApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);             // 입력을 위한 Scanner
        Queue<String> customerQueue = new LinkedList<>(); // 고객 대기열 (FIFO 구조)

        while (true) {
            System.out.println("\n1. 고객 추가 | 2. 고객 처리 | 3. 대기열 보기 | 0. 종료");
            System.out.print("메뉴 선택: ");
            int menu = Integer.parseInt(sc.nextLine()); // 숫자 메뉴 입력

            if (menu == 1) {
                // 고객 추가
                System.out.print("고객 이름 입력: ");
                String name = sc.nextLine();
                customerQueue.offer(name); // 큐에 추가 (enqueue)
                System.out.println(name + " 님이 대기열에 추가되었습니다.");
            } else if (menu == 2) {
                // 고객 처리
                if (!customerQueue.isEmpty()) {
                    String next = customerQueue.poll(); // 큐에서 제거하며 가져옴 (dequeue)
                    System.out.println(next + " 님을 처리했습니다.");
                } else {
                    System.out.println("처리할 고객이 없습니다.");
                }
            } else if (menu == 3) {
                // 대기열 출력
                System.out.println("\n[현재 대기열]");
                if (customerQueue.isEmpty()) {
                    System.out.println("대기 중인 고객이 없습니다.");
                } else {
                    for (String customer : customerQueue) {
                        System.out.println("- " + customer);
                    }
                }
            } else if (menu == 0) {
                // 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }

        sc.close(); // Scanner 자원 정리
    }
}

