package Collection.HashMap;

import java.util.HashMap;

public class HashMapAPIExample_0 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); // 문자열(String) 타입의 키와 값을 저장하는 Map 생성

        map.put("name", "철수"); // "name"이라는 키에 "철수"라는 값을 저장
        map.put("job", "개발자"); // "job"이라는 키에 "개발자"라는 값을 저장

        System.out.println(map.get("name")); // "name" 키에 해당하는 값을 가져옴 → "철수"
        System.out.println(map.containsKey("job")); // "job"이라는 키가 존재하는지 true/false로 확인 -> true
    }
}
