//✅ match 메서드 정리
//메서드 이름	설명
//anyMatch()	하나라도 조건을 만족하면 true
//allMatch()	전부 조건을 만족해야 true
//noneMatch()	아무것도 조건을 만족하지 않아야 true
//모두 boolean 반환이며, Predicate를 받아 조건을 검사해요!
//✅ 한 줄 요약 암기 팁 🧠
//anyMatch: 하나라도 만족 → || 느낌
//allMatch: 모두 다 만족해야 → && 느낌
//noneMatch: 전부 다 불만족 → 조건을 부정(!)

package Stream.Match;

import java.util.*;
import java.util.stream.*;

public class MatchExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // anyMatch - 하나라도 짝수가 있나?
        boolean hasEven = list.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("하나라도 짝수인가요? " + hasEven); // 👉 true

        // allMatch - 전부 0보다 큰가?
        boolean allPositive = list.stream().allMatch(n -> n > 0);
        System.out.println("모두 양수인가요? " + allPositive); // 👉 true

        // noneMatch - 하나도 음수가 아닌가?
        boolean noNegative = list.stream().noneMatch(n -> n < 0);
        System.out.println("음수는 없나요? " + noNegative); // 👉 true
    }
}
