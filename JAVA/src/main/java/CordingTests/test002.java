// 문제 : 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다.
//       이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//       예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//       세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

// 입력 : 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
//       둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

// 출력 : 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

package CordingTests;

import java.util.Scanner;

public class test002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();                         // 변수 N에 과목의 수 입력받기
        int A[] = new int[N];                         // 길이가 N인 1차원 배열 A[] 선언하기
        for (int i = 0; i < N; i++) {                 // for(A[] 길이 만큼 반복하기
            A[i] = sc.nextInt();                      // A[i]에 각 점수 저장하기
        }
        long sum = 0;                                 // 총점은 변수 sum에 저장하기
        long max = 0;                                 // 최고점은 변수 max에 저장하기
        for (int i = 0; i < N; i++) {                 // for(A[] 길이만큼 반복하기) {
            if (A[i] > max) max = A[i];
            sum = sum + A[i];
        }
        // 한 과목과 관련된 수식을 총합한 후 관련된 수식으로 변환해 로직이 간단해짐
        System.out.println(sum * 100.0 / max / N);    // sum * 100 / max / N 출력하기
    }
}
