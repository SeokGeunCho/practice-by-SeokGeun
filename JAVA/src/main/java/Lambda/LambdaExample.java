/*
 * 자바에서는 메소드를 독립적으로 선언하는 것이 불가능하다.
 * 클래스나 인터페이스 내부에서만 선언되기 때문에 메소드를 가지는 클래스나 인터페이스가 필요하다.
 * 람다식은 그 중 인터페이스를 활용하게 된다.
 * 하지만 모든 인터페이스에 메소드를 작성한다고 람다식을 활용할 수 있는 것은 아니다.
 * 인터페이스 내부에 하나의 추상메소드가 선언된 인터페이스만 람다식의 타겟이 될 수 있다.
 * 이러한 인터페이스를 함수적 인터페이스(functional interface)라고 하며,
 * 해당 조건을 만족하는지를 컴파일 시점에 체크해주는 기능이 @FunctionalInterface어노테이션이다.
 * */
package Lambda;

import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {

        // 1. Runnable - 매개변수 X, 반환 X
        Runnable run = () -> System.out.println("Runnable 실행 중입니다.");
        run.run(); // -> Runnable 인터페이스는 run()을 실행해야 출력돼요

        Runnable run2 = () -> System.out.println("람다식 연습중~");
        run2.run(); // -> 람다식 연습중~

        Runnable run3 = () -> System.out.println(11234);    // int 형 반환
        run3.run(); // ->  11234

        Runnable run4 = () -> System.out.println(3.14195);  // double 형 반환
        run4.run(); // -> 3.14195

        Runnable run5 = () -> System.out.println(1+3*4);  // 사칙 연산 가능
        run5.run(); // -> 13

        Runnable run6 = () -> System.out.println("이름 :" + "조석근 입니다." + (3 * 4) + 1 );  // 사칙 연산 가능
        run6.run(); // -> 이름 : 조석근 입니다.121


        // 2. Consumer - 매개변수 O, 반환 X
        Consumer<String> printer = name -> System.out.println("이름: " + name);
        printer.accept("홍길동"); // 👉 Consumer는 accept()로 실행해야 해요

        Consumer<Integer> i = number -> System.out.println(number);  // 👉 오토박싱: int → Integer
        i.accept(1); // -> 1

        Consumer<Double> d = number -> System.out.println(number);
        d.accept(3.14); // -> 3.14

        Consumer<Boolean> b = number -> System.out.println(number);
        b.accept(true); // -> true


        // 3. Supplier - 매개변수 X, 반환 O
        Supplier<String> getName = () -> "람다 공급자";
        System.out.println(getName.get()); // -> 람다 공급자

        Supplier<Integer> getNumber = () ->  1;
        System.out.println(getNumber.get());    // -> 1

        Supplier<Double> getNumber2 = () ->  3.14;
        System.out.println(getNumber2.get());   // -> 3.14

        Supplier<Boolean> gettext = () ->  true;
        System.out.println(gettext.get());  // -> true


        // 4. Function<T, R> - T: Type, Return 입력을 받아 변환  👉 apply()로 실행해요
        Function<Integer, String> intToString = i1 -> "숫자: " + i;
        System.out.println(intToString.apply(1)); // -> 1

        Function<Integer, String> toWon = amount -> amount + "원";
        System.out.println(toWon.apply(5000)); // -> 5000원

        Function<Integer, String> evenOdd = n ->
                (n % 2 == 0) ? "짝수입니다" : "홀수입니다";
        System.out.println(evenOdd.apply(4)); // -> 짝수입니다

        Function<Integer, String> getGrade = score -> {
            if(score >= 90) return "A등급";
            else if(score >= 80) return "B등급";
            else if(score >= 70) return "C등급";
            else return "F등급";
        };
        System.out.println(getGrade.apply(99)); // -> A등급

        Function<Integer, String> levelMessage = level -> {
            switch(level) {
                case 1: return "입문자입니다.";
                case 2: return "중급자입니다.";
                case 3: return "고급자입니다.";
                default: return "알 수 없는 레벨입니다.";
            }
        };
        System.out.println(levelMessage.apply(3)); // -> 고급자입니다.

        Function<Integer, String> stars = n -> "★".repeat(n);
        System.out.println(stars.apply(5)); // -> ★★★★★

        String result = stars.apply(5);
        System.out.println("내 별점: " + result); // -> 내 별점: ★★★★★

        // 문자열 정수로 반환

        Function<String, Integer> strToInt = s -> Integer.parseInt(s);
        System.out.println(strToInt.apply("123")); // 👉 출력: 123

        Function<String, Integer> addTen = s -> Integer.parseInt(s) + 10;
        System.out.println(addTen.apply("50")); // 👉 출력: 60

        // BiFuncton ( T, T, 조건)

        // 문자열 두 개를 받아서 같은지 비교하는 함수
        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("java", "java")); // 👉 true
        System.out.println(bf.apply("java", "hello")); // 👉 false


        // 5. Predicate<T> - 조건 검사, true/false 반환
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.test(""));       // 👉 true
        System.out.println(isEmpty.test("hello"));  // 👉 false

        // 정수가 짝수인지 검사
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(2)); // 👉 true
        System.out.println(isEven.test(3)); // 👉 false

        // 문자열이 숫자로만 이루어져 있는지 검사
        Predicate<String> isNumeric = str -> str.matches("\\d+");
        System.out.println(isNumeric.test("123")); // 👉 true
        System.out.println(isNumeric.test("abc")); // 👉 false

    }
}
