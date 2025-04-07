package Application_Programming_Interface.Concept.Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysExample_00 {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "딸기"};

        // 배열을 리스트로 변환
        List<String> fruitList = Arrays.asList(fruits);

        // 리스트 출력
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
