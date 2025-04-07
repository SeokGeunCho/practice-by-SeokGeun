package Application_Programming_Interface.Concept.HashMap;

import java.util.HashMap;

public class HashMapExample_00 {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreMap = new HashMap<>();

        // 이름과 점수 저장
        scoreMap.put("철수", 90);
        scoreMap.put("영희", 85);

        // 특정 학생 점수 조회
        System.out.println("철수의 점수: " + scoreMap.get("철수"));
        System.out.println("영희의 점수: " + scoreMap.get("영희"));
    }
}
