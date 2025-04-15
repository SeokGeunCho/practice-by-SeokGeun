package ArraysAlgorithm.BubbleSort;

import java.util.Arrays;

public class BubbleSortDebug {

    public static void main(String[] args) {
        // 정렬할 배열 선언
        int[] arr = {5, 3, 8, 1, 2};

        // 정렬 전 출력
        System.out.println("정렬 전: " + Arrays.toString(arr));

        // 디버그 모드로 버블 정렬 수행
        bubbleSortDebug(arr);

        // 정렬 후 출력
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    // ✅ 디버그용 버블 정렬 메서드
    public static void bubbleSortDebug(int[] arr) {
        int n = arr.length;

        // 바깥 반복문: 총 n-1번 회전
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\n[" + (i + 1) + "회전 시작]");

            // 정렬 과정 중 변경 여부 체크
            boolean swapped = false;

            // 안쪽 반복문: 인접한 값들 비교
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("비교: " + arr[j] + " > " + arr[j + 1] + " ? ");

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;  // 값 교환 발생
                    System.out.println("→ 교환됨 → " + Arrays.toString(arr));
                } else {
                    System.out.println("→ 그대로");
                }
            }

            // 현재 회전 결과 출력
            System.out.println("[" + (i + 1) + "회전 결과] " + Arrays.toString(arr));

            // 정렬 완료되었으면 종료
            if (!swapped) {
                System.out.println("※ 더 이상 교환이 없어 정렬 종료");
                break;
            }
        }
    }
}

