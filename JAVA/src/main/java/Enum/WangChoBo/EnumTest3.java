package Enum.WangChoBo;

import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 import

public class EnumTest3 {

    // enum을 사용하는 이유: 메뉴처럼 고정된 값을 이름으로 표현하고, 관련 데이터를 함께 묶어서 쓰기 위함
    enum Menu {
        AMERICANO("아메리카노", 3000), // 각각의 상수에 설명과 가격을 함께 설정
        LATTE("라떼", 3500),
        MOCHA("모카", 4000);

        // enum 상수마다 저장할 속성(필드) 선언
        private final String desc;  // 메뉴 설명
        private final int price;    // 메뉴 가격

        // enum 생성자: enum 상수가 생성될 때 필드를 초기화하기 위해 사용
        Menu(String desc, int price) {
            this.desc = desc;
            this.price = price;
        }

        // 외부에서 설명을 가져갈 수 있도록 getter 메서드 제공
        public String getDesc() {
            return desc;
        }

        // 외부에서 가격을 가져갈 수 있도록 getter 메서드 제공
        public int getPrice() {
            return price;
        }
    }

    // 프로그램 실행의 시작점: main 메서드
    public static void main(String[] args) {

        // 전체 메뉴를 출력하기 전에 제목을 한 번만 출력
        System.out.println("=== 커피 메뉴 ===");

        // Menu.values(): enum에 정의된 모든 상수를 배열로 반환
        // for-each 문을 통해 전체 메뉴를 하나씩 출력
        for (Menu menu : Menu.values()) {
            System.out.println(
                    menu.name() + " | " +  // enum 상수 이름 (영문 대문자)
                            menu.getDesc() + " | " +  // 설명 getter 호출
                            menu.getPrice() + "원"   // 가격 getter 호출
            );
        }

        // 사용자로부터 입력 받기 위해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 메뉴 입력 요청 메시지 출력
        System.out.print("주문할 커피를 입력하세요 (예: AMERICANO, LATTE, MOCHA): ");
        String input = sc.nextLine().toUpperCase(); // 대소문자 구분 없이 처리하기 위해 대문자로 변환

        try {
            // 입력값을 enum 상수로 변환 (문자열 → Menu 타입)
            Menu menu = Menu.valueOf(input);

            // switch문으로 메뉴별 동작 처리 (설명을 나누거나 다양하게 확장 가능)
            switch (menu) {
                case AMERICANO:
                case LATTE:
                case MOCHA:
                    // 메뉴 이름, 설명, 가격 출력
                    System.out.println("[" + menu.name() + "] " + menu.getDesc() + " - " + menu.getPrice() + "원");
                    break;
            }

        } catch (IllegalArgumentException e) {
            // valueOf()에서 존재하지 않는 enum 값을 입력했을 경우 예외 발생
            System.out.println("존재하지 않는 메뉴입니다."); // 예외 메시지를 사용자에게 알려줌
        }

        // Scanner 자원 반납 (메모리 누수 방지)
        sc.close();
    }
}
