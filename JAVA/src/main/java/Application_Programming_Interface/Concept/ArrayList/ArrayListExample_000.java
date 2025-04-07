package Application_Programming_Interface.Concept.ArrayList;

import java.util.ArrayList;

public class ArrayListExample_000 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // 이름 추가
        names.add("철수");
        names.add("영희");
        names.add("민수");

        // 전체 출력
        for (String name : names) {
            System.out.println("이름: " + name);
        }
    }
}
