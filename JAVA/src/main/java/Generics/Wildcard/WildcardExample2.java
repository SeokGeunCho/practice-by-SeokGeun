package Generics.Wildcard;

import java.util.Arrays;
import java.util.List;

public class WildcardExample2 {

    // Number를 상속한 타입만 받을 수 있는 메서드
    public static void printNumbers(List<? extends Number> list) {
        // 리스트 안의 숫자들을 하나씩 출력
        for (Number num : list) {
            System.out.println("숫자: " + num);
        }
    }

    public static void main(String[] args) {
        // Integer 리스트 생성
        List<Integer> intList = Arrays.asList(1, 2, 3);

        // Double 리스트 생성
        List<Double> doubleList = Arrays.asList(1.1, 2.2);

        // Integer 리스트 출력
        printNumbers(intList);

        // Double 리스트 출력
        printNumbers(doubleList);
    }
}
// 포인트 정리
// <? extends Number>는 Number와 그 자식 타입만 허용
// Integer, Double, Float, Long 등
// 리스트 내부에서 값을 읽을 수 있음
// 쓰기(add) 는 안 됨 → 타입 안정성 때문에 막혀있음