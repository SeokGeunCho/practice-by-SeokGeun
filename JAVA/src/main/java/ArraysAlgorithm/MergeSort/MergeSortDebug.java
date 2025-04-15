package ArraysAlgorithm.MergeSort;

import java.util.Arrays;

public class MergeSortDebug {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        System.out.println("정렬 전: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    // ✅ 병합 정렬 메서드
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // 배열을 반으로 나누기
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // 나눈 배열을 병합
            merge(arr, left, mid, right);
        }
    }

    // ✅ 병합 메서드
    public static void merge(int[] arr, int left, int mid, int right) {
        System.out.println("\n[병합] 범위: " + left + " ~ " + right);

        int[] temp = new int[right - left + 1];  // 병합 결과를 담을 배열
        int i = left;     // 왼쪽 배열 시작
        int j = mid + 1;  // 오른쪽 배열 시작
        int k = 0;        // temp 배열 인덱스

        // 두 배열을 비교하며 작은 값을 temp에 저장
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // 왼쪽 배열이 남아있다면 복사
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // 오른쪽 배열이 남아있다면 복사
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // temp 배열을 원래 배열에 복사
        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }

        System.out.println(" → 병합 결과: " + Arrays.toString(arr));
    }
}

