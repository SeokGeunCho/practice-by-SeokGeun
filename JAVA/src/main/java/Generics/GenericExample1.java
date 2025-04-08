package Generics;

import Generics.Box;

public class GenericExample1 {
    public static void main(String[] args) {
        // String 타입의 Box
        Box<String> strBox = new Box<>();
        strBox.set("안녕하세요!");
        System.out.println("문자: " + strBox.get());

        // Interger 타입의 Box
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("숫자: " + intBox.get());
    }
}
// 해설
// Box<String> : 문자열 전용 박스
// Box<Integer> : 숫자 전용 박스
// T는 타입이 아니라 타입의 "변수" 야! → 나중에 실제 타입으로 대체됨
