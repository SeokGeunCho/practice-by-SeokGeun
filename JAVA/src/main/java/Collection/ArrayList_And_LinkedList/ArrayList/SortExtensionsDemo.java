package Collection.ArrayList_And_LinkedList.ArrayList;

import java.util.*;

public class SortExtensionsDemo {
    public static void main(String[] args) {
        // ✅ 1. 기본형 배열 (int[]) 정렬
        int[] intArray = {5, 1, 9, 3, 7};
        Arrays.sort(intArray); // 오름차순
        System.out.println("int[] 오름차순: " + Arrays.toString(intArray));

        // 내림차순 정렬은 직접 구현 필요
        Integer[] temp = Arrays.stream(intArray) // int[] → Integer[]
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(temp, Collections.reverseOrder()); // 내림차순
        System.out.println("int[] 내림차순: " + Arrays.toString(temp));

        // ✅ 2. List<Integer> 정렬
        List<Integer> numberList = new ArrayList<>(Arrays.asList(8, 3, 5, 1, 9));

        Collections.sort(numberList); // 오름차순
        System.out.println("\nList 오름차순: " + numberList);

        Collections.sort(numberList, Collections.reverseOrder()); // 내림차순
        System.out.println("List 내림차순: " + numberList);
    }
}