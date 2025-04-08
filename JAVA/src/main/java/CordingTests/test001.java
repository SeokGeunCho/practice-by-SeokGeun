// 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

// 입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

// 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
package CordingTests;
import java.util.Scanner;

public class test001 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);               // 슈도 코드
     int N = sc.nextInt();                     // int N값을 입력받기
     String sNum = sc.next() ;                 // 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
     char[] cNum = sNum.toCharArray();         // sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
     int sum = 0;                              // int형 변수 sum 선언하기
     for (int i = 0; i < cNum.length; i++) {   // for(cNum 길이만큼 반복하기
      sum += cNum[i] - '0';                    // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
    }
    System.out.print(sum);
    }
}
// 자바에서의 형 변환
// String형 -> 숫자형(int, double, float, long, short)
// String sNum = "1234";
// int i1 = Interger.parseInt(sNum); / Interger.valueOf(sNum);
// double d1 = Double.parseDouble(sNum); / Double.valueOf(sNum);
// float f1 = Float.parseFloat(sNum); / Float.valueOf(sNum);
// long l1 = Long.parseLong(sNum); / Long.valueOf(sNum);
// short s1 = Short.parseShort(sNum); / Short.valueOf(sNum);

// 숫자형(int, double, float, long, short) -> String형
// int i = 1234;
// String i = String.valueOf(i); / Interger.toString(i);
// double d = 1.23;
// String d = String.valueOf(d); / Double.toString(d);
// float f = (float) 1,23;
// String f = String.valueOf(f); / Float.toString(f);
// long l = 1234;
// String l = String.valueOf(l); / Long.toString(l);
// short s = 1234;
// String s = String.valueOf(s); / Short.toString(s);