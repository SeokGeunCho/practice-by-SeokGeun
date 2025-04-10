package Enum.Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 주문 시스템 클래스
public class OrderSystem {

    // 1. 메뉴 enum 정의 (이름 + 가격)
    enum Menu {
        COFFEE(3000), TEA(2500), JUICE(4000);

        private final int price;

        Menu(int price) {
            this.price = price;
        }
        // getter
        public int getPrice() {
            return price;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Menu> orderList = new ArrayList<>(); // 주문 목록 저장용 리스트

            System.out.println("주문 시스템에 오신 걸 환영합니다!");
            System.out.println("'종료'를 입력하면 주문을 마칩니다.");

            while (true) {
                // 2. 메뉴 목록 출력
                System.out.println("\n 메뉴판:");
                for (Menu menu : Menu.values()) {
                    System.out.println("- " + menu.name() + " ( " + menu.getPrice() + ")" + "원");
                }

                // 3. 사용자 입력 받기
                System.out.println("주문할 메뉴 입력: ");
                String input = sc.nextLine().toUpperCase();

                // 4. 종료 조건
                if (input.equals("종료")) {
                    break;
                }

                // 5. 입력값을 enum으로 변환
                try {
                    Menu selectedMenu = Menu.valueOf(input);
                    orderList.add(selectedMenu); // 주문 목록에 추가
                    System.out.println(selectedMenu + " 주문이 추가되었습니다");
                } catch (IllegalArgumentException e) {
                    System.out.println(" 존재하지 않는 메뉴입니다.");
                }
            }

            sc.close();

            // 6. 주문 결과 출력
            if (orderList.isEmpty()) {
                System.out.println("주문 내역이 없습니다.");
                return;
            }
            System.out.println("\n 주문 내역:");
            int total = 0;
            for (Menu menu : orderList) {
                System.out.println("- " + menu.name() + " ( " + menu.getPrice() + "원)");
                total += menu.getPrice(); // 총합 계산
            }
            System.out.println(" 총 결제 금액: " + total + "원");
        }

        // 주문 내역을 파일로 저장하는 메서드
        private static void saveOrderToFile(List<Menu> orderList, int total) {
            File file = new File("orders.txt"); // 현재 프로젝트 폴더에 저장됨

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("주문 내역\n");
                for (Menu menu : orderList) {
                    writer.write("- " + menu.name() + " (" + menu.getPrice() + "원)\n");
                }
                writer.write("총 결제 금액: " + total + "원\n");
                System.out.println("주문 내역이 'order.txt' 파일에 저장되었습니다.");
            } catch (IOException e) {
                System.out.println("파일 저장 중 오류: " + e.getMessage());
            }
        }
    }
}
