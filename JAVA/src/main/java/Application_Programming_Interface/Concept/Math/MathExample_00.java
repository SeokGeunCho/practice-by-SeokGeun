package Application_Programming_Interface.Concept.Math;

public class MathExample_00 {
    public static void main(String[] args) {
        double randomValue = Math.random() * 10; // 0~10 사이 실수

        // 반올림하여 정수로
        int result = (int) Math.round(randomValue);

        System.out.println("무작위 숫자 (반올림): " + result);
    }
}
