package Collection.ArrayList_And_LinkedList.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("철수");
        names.add("영희");
        names.add("철수");    // 중복도 가능!

        for (String name : names) {
            System.out.println("이름: " + name);
        }
    }
}
