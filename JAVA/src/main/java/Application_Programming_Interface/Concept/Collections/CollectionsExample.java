package Application_Programming_Interface.Concept.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(90);
        scores.add(70);
        scores.add(100);
        scores.add(80);

        Collections.sort(scores);  // 리스트를 오름차순 정렬 -> [70, 80, 90, 100]
        System.out.println("오름차순 정렬: " + scores);

        Collections.reverse(scores); // 리스트 순서를 거꾸로 뒤집음 -> [100, 90, 80, 70]
        System.out.println("내림차순 정렬: " + scores);

        int maxScore = Collections.max(scores); // 가장 큰 값 반환 -> 100
        System.out.println("최고 점수: " + maxScore);
    }
}
