// 다형성 (Polymorphism)
// 개념 설명
// 하나의 객체가 여러 타입으로 동작할 수 있는 성질.
// 부모 타입으로 자식 객체를 다룰 수 있음 → 유연하고 확장성 있는 코드 가능.
package Polymorphism.Animal_Sounds;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a = new Cat(); // 부모 타입으로 자식 객체 참조
        a.sound(); // 실행 결과: "야옹~"
    }
}
// 해설:
// Animal 타입으로 Cat 객체를 다루지만,
// 실제 객체는 Cat이므로 오버라이딩된 sound()가 실행됨.
// 이렇게 부모 타입 참조로 다양한 자식 객체를 사용할 수 있는 게 다형성임