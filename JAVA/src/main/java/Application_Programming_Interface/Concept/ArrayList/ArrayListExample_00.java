package Application_Programming_Interface.Concept.ArrayList;

import java.util.ArrayList;

public class ArrayListExample_00 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // 문자열(String)을 여러 개 저장할 수 있는 리스트를 생성

        list.add("사과");   // 리스트에 "사과"라는 항목 추가
        list.add("바나나"); // 리스트에 "바나나"라는 항목 추가
        list.add("포도");   // 리스트에 "포도"라는 항목 추가

        System.out.println(list.get(0)); // 리스트의 첫 번째 항목 가져오기 (index는 0부터 시작) -> 사과

        list.remove("바나나");     // 리스트에서 "바나나"라는 항목 제거

        System.out.println(list);   // 리스트 전체를 출력 → [사과, 포도]
    }
}
