/* package ArraysAlgorithm.ComprehensivePractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortMenuExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 예제 회원 데이터
        List<Member> members = new ArrayList<>();
        members.add(new Member("홍길동", 25, 90));
        members.add(new Member("김철수", 20, 85));
        members.add(new Member("이영희", 30, 95));

        while (true) {
            System.out.println("\n==== 정렬 메뉴 ====");
            System.out.println("1. 이름순 정렬");
            System.out.println("2. 나이순 정렬");
            System.out.println("3. 점수순 정렬");
            System.out.println("0. 종료");
            System.out.println("선택 > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // 이름순 오름차순 정렬
                    members.sort(Comparator.comparing(Member::getName));
                    System.out.println("이름순 정렬 결과:");
                    printMembers(members);
                    break;
                case 2:
                    // 나이순 오름차순 정렬
                    members.sort(Comparator.comparing(Member::getAge));
                    System.out.println("나이순 정렬 결과:");
                    printMembers(members);
                    break;
                case 3:
                    // 점수순 내림차순 정렬
                    members.sort(Comparator.comparing(Member::getPoint).reversed());
                    System.out.println("점수순 정렬 결과:");
                    printMembers(members);
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
    // Member 리스트를 출력하는 메서드
    private static void printMembers(List<Member> list) {
        for (Member m : list) {
            System.out.println(m);
        }
    }
}
*/