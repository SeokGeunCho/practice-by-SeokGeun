package Collection.ArrayList_And_LinkedList.ArrayList_vs_LinkedList_Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample_01 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // 학생 추가
        students.add("홍길동");
        students.add("김철수");
        students.add("이영희");

        System.out.println("초기 명단: " + students);

        // 중간 삽입
        students.add(1, "박영수"); // 인덱스 1에 삽입 (김철수 앞), 값 대체가 아닌 삽입
        System.out.println("중간 삽입 후: " + students);

        System.out.println("리스트의 길이 :" + students.size());
        // 마지막 삭제
        students.remove(students.size() -1);
        System.out.println("마지막 삭제 후: " + students);

        students.remove(students.size() -1);
        System.out.println("마지막 삭제 후2: " + students);
    }
}
