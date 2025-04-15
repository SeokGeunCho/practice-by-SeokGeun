package ArraysAlgorithm.InsertionSort;

import java.util.Arrays;

public class InsertionSortDebug {

    public static void main(String[] args) {
        // 정렬할 배열
        int[] arr = {5, 3, 8, 1, 2};

        // 정렬 전 출력
        System.out.println("정렬 전: " + Arrays.toString(arr));

        // 삽입 정렬 실행
        insertionSortDebug(arr);

        // 정렬 후 출력
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    // ✅ 삽입 정렬 구현 (디버그 모드)
    public static void insertionSortDebug(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];           // 현재 삽입할 값
            int j = i - 1;              // 정렬된 영역의 마지막 인덱스

            System.out.println("\n[" + i + "번째 삽입] key = " + key);

            // 정렬된 영역에서 key보다 큰 값들은 오른쪽으로 밀기
            while (j >= 0 && arr[j] > key) {
                System.out.println(" → arr[" + j + "](" + arr[j] + ") > key(" + key + ") → 오른쪽으로 이동");
                arr[j + 1] = arr[j];    // 값 한 칸 오른쪽으로 이동
                j--;
            }

            // 올바른 위치에 key 삽입
            arr[j + 1] = key;

            System.out.println(" → key 삽입 위치: arr[" + (j + 1) + "] = " + key);
            System.out.println("정렬 상태: " + Arrays.toString(arr));
        }
    }
}
