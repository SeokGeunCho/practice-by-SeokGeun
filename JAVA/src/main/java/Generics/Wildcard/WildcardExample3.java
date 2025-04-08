package Generics.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample3 {

    // Integer의 부모 타입만 허용 (ex: Number, Object)
    public static void addIntegers(List<? super Integer> list) {
        // 안전하게 Integer 값을 추가할 수 있음!
        list.add(10);
        list.add(20);

        // 리스트 내용 출력
        System.out.println("추가 완료: " + list);
    }

    public static void main(String[] args) {
        // Object 리스트 생성 (Integer의 상위 타입)
        List<Object> objList = new ArrayList<>();

        // Number 리스트 생성 (Integer의 상위 타입)
        List<Number> numList = new ArrayList<>();

        // Object 타입 리스트에 Integer 추가
        addIntegers(objList);

        // Number 타입 리스트에 Integer 추가
        addIntegers(numList);
    }
}
// 💬 포인트 정리
// <? super Integer>는 Integer의 상위 타입만 허용
// Object, Number 등
// 리스트에 Integer 값을 안전하게 추가 가능
// 단, 읽을 땐 정확한 타입을 모르기 때문에 Object로 처리