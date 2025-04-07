// 자식 클래스 2: 페이팔 결제

package Polymorphism.MiniProject;

public class PaypalPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("🅿️ 페이팔로 " + amount + "원 결제했습니다.");
    }
}
