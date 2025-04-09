//✅ Scanner 주요 메서드 정리
//  메서드	                    설명	                            예시 입력
//  next()	           공백 전까지 한 단어 입력	              "hello world" 입력 시 → hello
//  nextLine()	       한 줄 전체 입력	                  "hello world" 입력 시 → hello world
//  nextInt()	       정수 입력 받기	                              42
//  nextDouble()	   실수 입력 받기	                             3.14
//  nextBoolean()	   true/false 입력	                         true
//  nextLong()	       long 정수 입력 받기	                    10000000000
//  hasNext()	       다음에 입력이 존재하는지 확인
//  hasNextInt()	   다음 입력이 정수인지 확인
//  hasNextLine()	   다음 줄이 존재하는지 확인
//  close()	Scanner    닫기 (자원 해제)
package Scanner;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. next(): 공백 전까지만 읽음
        System.out.print("한 단어 입력 (next): ");
        String word = scanner.next(); // hello world → hello
        System.out.println("입력된 단어: " + word);

        scanner.nextLine(); // 버퍼 비우기 (next() 사용 후 줄바꿈 처리)
        
        // 2. nextLine(): 한 줄 전체 입력
        System.out.print("한 문장 입력 (nextLine): ");
        String sentence = scanner.nextLine();
        System.out.println("입력된 문장: " + sentence);

        // 3. nextInt(): 정수 입력
        System.out.print("정수 입력 (nextInt): ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("입력된 정수: " + number);
        } else {
            System.out.println("정수가 아닙니다!");
            scanner.next(); // 잘못된 입력 제거
        }

        // 4. nextDouble(): 실수 입력
        System.out.print("실수 입력 (nextDouble): ");
        if (scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("입력된 실수: " + d);
        } else {
            System.out.println("실수가 아닙니다!");
            scanner.next(); // 잘못된 입력 제거
        }

        // 5. nextBoolean(): true/false 입력
        System.out.print("논리값 입력 (true/false): ");
        if (scanner.hasNextBoolean()) {
            boolean bool = scanner.nextBoolean();
            System.out.println("입력된 논리값: " + bool);
        } else {
            System.out.println("true 또는 false를 입력하세요.");
            scanner.next(); // 잘못된 입력 제거
        }

        // 6. nextLong(): 큰 정수 입력
        System.out.print("긴 정수 입력 (nextLong): ");
        if (scanner.hasNextLong()) {
            long longNum = scanner.nextLong();
            System.out.println("입력된 long 값: " + longNum);
        } else {
            System.out.println("long 타입 정수가 아닙니다.");
            scanner.next(); // 잘못된 입력 제거
        }

        // 7. hasNext() 예시
        System.out.print("추가 입력이 있는지 확인합니다. 아무거나 입력해보세요: ");
        if (scanner.hasNext()) {
            String nextInput = scanner.next();
            System.out.println("입력한 값: " + nextInput);
        }

        // 마무리
        scanner.close(); // 자원 반납
        System.out.println("🔚 Scanner 종료");
    }
}
