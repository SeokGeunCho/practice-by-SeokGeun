//  상속 (Inheritance)
//  개념 설명
//  상속은 **기존 클래스(부모, 슈퍼 클래스)**의 기능을
//  **새로운 클래스(자식, 서브 클래스)**가 물려받는 것.
//  코드 재사용성을 높이고, 유지보수를 쉽게 해줌.

package Application_Programming_Interface.Inheritance.practice01;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // 상속받은 메서드
        d.bark(); // 자식 클래스 고유 메서드
    }
}

// 해설:
// Animal 클래스를 Dog 클래스가 상속받음
// Dog 클래스는 sound() 메서드를 상속받아 사용할 수 있고,
// 자신만의 bark() 메서드도 가지고 있음