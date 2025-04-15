package ArraysAlgorithm.BubbleSort;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        // 정렬할 배열 선언
        int[] arr = {5, 3, 8, 1, 2};
        // 정렬 전 출력
        System.out.println("정렬 전: " + Arrays.toString(arr));

        // 버블 정렬 수행
        bubbleSort(arr);

        // 정렬 후 출력
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
    // 버블 정렬 메서드 정의
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // 배열 길이 저장

        // 바깥쪽 반쪽문: 총 n-1번 반복
        for (int i = 0; i < n -1; i++) {
            // 안쪽 반복문: 인접한 두 값 비교
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 두 값을 바꾸기 (swap)
                    int temp = arr[j];  // 임시로 저장
                    arr[j] = arr[j + 1]; // 오른쪽 값을 왼쪽에 넣기
                    arr[j + 1] = temp; // 임시 값을 오른족에 넣기
                }
            }
        }
    }
}
