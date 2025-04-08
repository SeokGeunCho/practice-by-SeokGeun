package Collection.ArrayList_And_LinkedList.ArrayList_vs_LinkedList_Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample_01 {
    public static void main(String[] args) {
        List<String> students = new LinkedList<>();

        // 학생 추가
        students.add("홍길동");
        students.add("김철수");
        students.add("이영희");

        System.out.println("초기 명단: " + students);

        // 중간 삽입
        students.add(1,"박영수");  // 인덱스 1에 삽입
        System.out.println("중간 삽입 후: " + students);

        // 마지막 삭제
        students.remove(students.size() -1);
        System.out.println("마지막 삭제 후: " + students);
    }
}
