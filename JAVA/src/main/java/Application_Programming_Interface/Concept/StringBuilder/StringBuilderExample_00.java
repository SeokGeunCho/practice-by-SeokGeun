package Application_Programming_Interface.Concept.StringBuilder;

public class StringBuilderExample_00 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // "Hello"를 3번 붙이기
        for (int i = 0; i < 3; i++) {
            sb.append("Hello ");
        }

        System.out.println("결과: " + sb.toString());
    }
}
