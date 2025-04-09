package Generics.Practice;

import Generics.Box;

// 🔍 제너릭 유틸리티 클래스
class Printer {
    // 어떤 타입이든 출력하는 제너릭 메서드
    public static <T> void printBox(Box<T> box) {

        System.out.println("박스 내용: " + box.get());
    }
}
