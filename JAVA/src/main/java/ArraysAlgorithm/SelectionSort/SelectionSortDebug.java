package ArraysAlgorithm.SelectionSort;

import java.util.Arrays;

public class SelectionSortDebug {

    public static void main(String[] args) {
        // 정렬할 배열 선언
        int[] arr = {5, 3, 8, 1, 2};

        // 정렬 전 출력
        System.out.println("정렬 전: " + Arrays.toString(arr));

        // 디버그 모드 선택 정렬 수행
        selectionSortDebug(arr);

        // 정렬 후 출력
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    // ✅ 선택 정렬 (디버그 출력 포함)
    public static void selectionSortDebug(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // 현재 위치부터 최소값 찾기 시작

            System.out.println("\n[" + (i + 1) + "회전 시작]");
            System.out.println("현재 정렬 기준 위치: i = " + i + " → 값 = " + arr[i]);

            // 뒤쪽에서 가장 작은 값 찾기
            for (int j = i + 1; j < n; j++) {
                System.out.print("비교: arr[" + minIndex + "](" + arr[minIndex] + ") vs arr[" + j + "](" + arr[j] + ") → ");
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println("✔️ 더 작음 → minIndex 갱신: " + minIndex);
                } else {
                    System.out.println("그대로");
                }
            }

            // 교환이 필요한 경우
            if (i != minIndex) {
                System.out.println("→ 최소값: arr[" + minIndex + "] = " + arr[minIndex] + " → arr[" + i + "]와 교환");
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            } else {
                System.out.println("→ 현재 위치가 최소값 → 교환 생략");
            }

            System.out.println("[" + (i + 1) + "회전 결과] " + Arrays.toString(arr));
        }
    }
}
