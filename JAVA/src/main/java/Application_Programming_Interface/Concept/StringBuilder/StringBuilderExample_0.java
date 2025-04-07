package Application_Programming_Interface.Concept.StringBuilder;

public class StringBuilderExample_0 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder 객체 생성

        sb.append("자바");        // 문자열을 뒤에 추가
        sb.append(" ");          // 문자열을 뒤에 추가
        sb.append("재밌다!");     // 또 추가

        System.out.println(sb.toString()); // 최종 문자열 출력 -> "자바 잼있다!"

        sb.insert(2, "는 정말"); // insert(index, str) → 특정 위치에 문자열 삽입입
        System.out.println("삽입 후: " + sb);

        sb.replace(0, 2, "Java"); // replace(start, end, str) → 부분 문자열 교체
        System.out.println("교체 후: " + sb);

        sb.delete(0, 5); // delete(start, end) → 일부 문자 삭제
        System.out.println("삭제 후: " + sb);
    }
}
