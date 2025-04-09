package Collection.ArrayList_And_LinkedList.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAndArrayDemo {
    public static void main(String[] args) {
        // List 생성
        List<String> fruits = new ArrayList<>();

        // 1. add() - 요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("초기 리스트: " + fruits); // [Apple, Banana, Cherry]

        // 2. add(index, element) - 특정 위치에 추가
        fruits.add(1, "Blueberry");
        System.out.println("1번 인덱스에 추가: " + fruits); // [Apple, Blueberry, Banana, Cherry]

        // 3. get(index) - 요소 가져오기
        String secondFruit = fruits.get(1);
        System.out.println("1번 인덱스의 과일: " + secondFruit); // Blueberry

        // 4. set(index, element) - 요소 수정
        fruits.set(2, "Mango");
        System.out.println("2번 인덱스 수정: " + fruits); // [Apple, Blueberry, Mango, Cherry]

        // 5. remove(index) - 인덱스로 삭제
        fruits.remove(0);
        System.out.println("0번 인덱스 삭제: " + fruits); // [Blueberry, Mango, Cherry]

        // 6. remove(element) - 값으로 삭제
        fruits.remove("Mango");
        System.out.println("\"Mango\" 삭제: " + fruits); // [Blueberry, Cherry]

        // 7. size() - 리스트 크기 확인
        System.out.println("리스트 크기: " + fruits.size()); // 2

        // 8. contains(element) - 포함 여부 확인
        System.out.println("Cherry 포함? " + fruits.contains("Cherry")); // true

        // 9. indexOf(element) - 위치 확인
        System.out.println("Cherry의 인덱스: " + fruits.indexOf("Cherry")); // 1

        // 10. clear() - 전체 삭제
        fruits.clear();
        System.out.println("clear() 이후: " + fruits); // []

        // ✅ 배열 → 리스트 변환
        String[] fruitArray = {"Orange", "Grapes", "Peach"};
        List<String> fruitList = new ArrayList<>(Arrays.asList(fruitArray));
        System.out.println("\n배열 → 리스트 변환: " + fruitList);

        // ✅ 오름차순 정렬
        Integer[] numbers = {5, 2, 9, 1, 7};
        Arrays.sort(numbers); // 오름차순
        System.out.println("\n오름차순 정렬: " + Arrays.toString(numbers));

        // ✅ 내림차순 정렬
        Integer[] numbers2 = {5, 2, 9, 1, 7};
        Arrays.sort(numbers2, Collections.reverseOrder()); // 내림차순
        System.out.println("내림차순 정렬: " + Arrays.toString(numbers2));
    }
}
