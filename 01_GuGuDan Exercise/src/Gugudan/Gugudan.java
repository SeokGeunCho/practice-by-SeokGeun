package Gugudan;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 단을 입력하세요: ");
        int dan = scanner.nextInt();

        System.out.println(dan + "단 출력:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }

        scanner.close();
    }
}
