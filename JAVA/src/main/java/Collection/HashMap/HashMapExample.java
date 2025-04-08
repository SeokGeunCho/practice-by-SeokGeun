package Collection.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap 객체 생성 키key(String) -> 학생 이름, 값value(Integer) -> 점수
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("철수", 90); // "철수"(key) 라는 키에 90(value)이라는 점수를 저장
        scores.put("영희", 85);
        scores.put("철수", 95);   // "철수"가 이미 있으니까, 점수를 90 → 95로 덮어써.
                                 // 📌 HashMap은 같은 키가 두 번 못 들어감 → 새 값으로 교체
        for (String name : scores.keySet()) { // HashMap에 있는 **모든 키 값(학생 이름들)**을 하나씩 꺼내오는 반복문이야.
            System.out.println(name + "의 점수는: " + scores.get(name));
        }
    }
}
