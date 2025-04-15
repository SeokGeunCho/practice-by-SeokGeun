/* package ArraysAlgorithm.ComprehensivePractice;

import java.util.*;

// 프로그램 실행 클래스
public class MemberSortMain {

    // main() 메서드: 실행의 시작점
    public static void main(String[] args) {

        // ✅ 회원 리스트 생성
        List<Member> members = new ArrayList<>();
        members.add(new Member("홍길동", 25, 1200));
        members.add(new Member("김철수", 30, 900));
        members.add(new Member("박영희", 22, 1500));
        members.add(new Member("최수정", 30, 1100));
        members.add(new Member("이영호", 25, 950));

        // 🔹 정렬 전 출력
        System.out.println("👉 정렬 전:");
        //  "회원 리스트를 printMembers 함수에 넘겨서, 각각 출력하도록 시킨다."
        printMembers(members);

        // ✅ 1. 이름 오름차순 정렬 (가나다 순)
        members.sort(Comparator.comparing(Member::getName));
        System.out.println("\n📌 이름 오름차순 정렬:");
        // "회원 리스트를 printMembers 함수에 넘겨서, 각각 출력하도록 시킨다."
        printMembers(members);

        // ✅ 2. 나이 내림차순 정렬 (나이 많은 순)
        members.sort(Comparator.comparing(Member::getAge).reversed());
        System.out.println("\n📌 나이 내림차순 정렬:");
        // "회원 리스트를 printMembers 함수에 넘겨서, 각각 출력하도록 시킨다."
        printMembers(members);

        // ✅ 3. 포인트 오름차순 정렬 (점수 낮은 순)
        members.sort(Comparator.comparing(Member::getPoint));
        System.out.println("\n📌 포인트 오름차순 정렬:");
        // "회원 리스트를 printMembers 함수에 넘겨서, 각각 출력하도록 시킨다."
        printMembers(members);
    }

    // 🔁 회원 리스트를 출력하는 보조 메서드
    public static void printMembers(List<Member> list) {
        for (Member m : list) {
            System.out.println(m);  // toString()을 통해 보기 좋게 출력
        }
    }
}

*/