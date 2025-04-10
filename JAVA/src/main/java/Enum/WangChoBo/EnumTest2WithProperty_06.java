package Enum.WangChoBo;

import java.awt.*;

public class EnumTest2WithProperty_06 {

    // 1. 메뉴 enum 정의 (이름, 설명, 가격)
    enum Menu {
        AMERICANO("아메리카노", 3000),
        LATTE("라떼", 3500),
        MOCHA("모카", 4000),
        ESPRESSO("에스프레소", 2500);


        // 속성 필드
        private final String desc;  // 설명
        private final int price;    // 가격

        // 생성자 (enum은 private 생성자만 가능)
        Menu(String desc, int price) {
            this.desc = desc;
            this.price = price;
        }

        // getter 메서드

        public String getDesc() {
            return desc;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        // 2. 전체 메뉴 출력
        for (Menu menu : Menu.values()) {
            System.out.println(menu.name() + " | " + menu.getDesc() + " | " + menu.getPrice() + "원" );
        }
    }
}
