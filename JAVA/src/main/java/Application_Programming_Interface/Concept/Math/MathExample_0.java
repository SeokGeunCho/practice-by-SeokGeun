package Application_Programming_Interface.Concept.Math;

public class MathExample_0 {
    public static void main(String[] args) {
        int max = Math.max(10, 20);   // 두 숫자 중 더 큰 값을 리턴
        int min = Math.min(5, 3);     // 두 숫자 중 더 작은 값을 리턴
        double sqrt = Math.sqrt(16);  // 16의 제곱근을 계산 → 4.0
        double random = Math.random(); // 0.0 이상 1.0 미만의 랜덤한 소수 하나 생성

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("제곱근: " + sqrt);
        System.out.println("난수: " + random);
    }
}
