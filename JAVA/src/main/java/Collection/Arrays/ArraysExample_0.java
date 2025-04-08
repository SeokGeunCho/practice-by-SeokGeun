package Collection.Arrays;

import java.util.Arrays;

public class ArraysExample_0 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};

        Arrays.sort(numbers); // 배열을 오름차순으로 정렬해줌

        System.out.println("정렬된 배열 " + Arrays.toString(numbers));
        //  배열을 사람이 읽을 수 있는 문자열 형태로 바꿔줌
    }
}
