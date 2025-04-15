package ArraysAlgorithm.QuickSort;

import java.util.Arrays;

public class QuickSortDebug {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        System.out.println("정렬 전: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);  // 전체 범위 정렬

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    // ✅ 퀵 정렬 메서드 (재귀)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 파티션으로 피벗 기준 정렬
            int pivotIndex = partition(arr, low, high);

            // 왼쪽 그룹 정렬
            quickSort(arr, low, pivotIndex - 1);

            // 오른쪽 그룹 정렬
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // ✅ 파티션 함수: 피벗 기준으로 분할 & 정렬
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 마지막 요소를 피벗으로 선택
        int i = low - 1;       // 작은 값의 마지막 인덱스

        System.out.println("\n[파티션] 범위: " + low + " ~ " + high + ", 피벗 = " + pivot);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap(arr[i], arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println(" → 교환: " + Arrays.toString(arr));
            }
        }

        // 피벗을 올바른 위치로 이동
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        System.out.println(" → 피벗 이동 후: " + Arrays.toString(arr));
        return i + 1; // 피벗 위치 반환
    }
}

