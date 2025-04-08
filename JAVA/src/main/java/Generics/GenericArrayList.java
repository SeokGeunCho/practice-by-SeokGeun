package Generics;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // 문자열만 저장 가능
        list.add("사과");
        list.add("바나나");

        for (String fruit : list) {
            System.out.println("과일: " + fruit);
        }
    }
}
// 핵심 정리
// 개념	                예시
// 제너릭 클래스	   class Box<T> {...}
// 제너릭 메서드	   public <T> void print(T item)
// 실사용	       ArrayList<String>, HashMap<String, Integer> 등
