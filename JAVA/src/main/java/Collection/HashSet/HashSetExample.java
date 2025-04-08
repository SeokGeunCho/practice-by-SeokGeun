package Collection.HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("사과"); // 중복이므로 저장 안 됨!

        for (String fruit : fruits) {
            System.out.println("과일: " + fruit);
        }
    }
}
