// 문제 : 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

// 입력 : 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
//       둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
//       셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

// 출력 : 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

package CordingTests;

import java.io.BufferedReader;                                            // BufferedReader: 빠른 입력을 위해 사용
import java.io.IOException;
import java.io.InputStreamReader;                                         // InputStreamReader: 바이트 입력을 문자 입력으로 변환
import java.util.StringTokenizer;                                         // StringTokenizer: 한 줄의 문자열을 공백 기준으로 쪼개기 위해 사용.

public class test003 {
    // 자바 프로그램의 시작점입니다. IOException은 입력 도중 오류가 생길 경우를 대비해 예외를 던짐.
    public static void main(String[] args) throws IOException {
        // 키보드로부터 입력을 받기 위한 BufferedReader 객체를 생성합니다.
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        // 사용자로부터 한 줄 입력을 받고, 이를 공백 기준으로 잘라주는 StringTokenizer를 생성합니다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());   // 첫 줄 입력에서 첫 번째 값은 수의 개수(suNo),
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 두 번째 값은 질문(구간합 계산)의 개수(quizNo)로 저장합니다.
        long[] S = new long[suNo + 1];   // 누적합을 저장할 배열 S를 선언합니다. 편의를 위해 인덱스 0을 비우고, 1부터 사용하므로 크기를 suNo + 1로 만듭니다.
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 다음 줄 입력을 받아 공백으로 나눈 StringTokenizer 객체를 새로 생성합니다. 이 줄에는 suNo만큼의 숫자들이 들어 있습니다.
        for (int i =1; i <= suNo; i++) {  // 입력된 수들을 읽어 누적합을 계산해 배열 S에 저장합니다.
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());  // 예: S[3] = S[2] + 입력된 세 번째 수
        }
        for (int q = 0; q < quizNo; q++) { // quizNo 만큼 반복해서 질의(구간 합 계산)를 처리합니다.
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 질의마다 두 개의 정수(i, j)를 입력받습니다 (i번째부터 j번째 수까지의 합을 계산할 예정).
            // 구간의 시작점 i와 끝점 j를 정수로 변환하여 저장합니다.
            int i = Integer.valueOf(stringTokenizer.nextToken());
            int j = Integer.valueOf(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
// 구간 합의 핵심 이론
// 합 배열 S정의
// 배열 A, 합 배열 S / S[i] = A[0] + A[1] + A[2] + ....+ A[i-1] + A[i] // A[0]부터 A[i]까지의 합
// 합 배열 S를 만드는 공식 / S[i] = S[i-1] + A[i]
// 구간 합을 구하는 공식  / S[j] - S[i-1] // i 에서 j 까지의 구간합