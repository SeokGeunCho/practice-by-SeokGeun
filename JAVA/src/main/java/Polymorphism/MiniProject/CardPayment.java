// 자식 클래스 1: 카드 결제

package Polymorphism.MiniProject;

public class CardPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("💳 카드로 " + amount + "원 결제했습니다.");
    }
}
