package NumberGuess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("1부터 100 사이 숫자를 맞춰보세요!");

        while (guess != answer) {
            System.out.print("숫자 입력: ");
            guess = scanner.nextInt();

            if (guess < answer) {
                System.out.println("더 큰 수입니다.");
            } else if (guess > answer) {
                System.out.println("더 작은 수입니다.");
            } else {
                System.out.println("정답입니다!");
            }
        }

        scanner.close();
    }
}
