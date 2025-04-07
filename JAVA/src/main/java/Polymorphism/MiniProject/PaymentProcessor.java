//  결제를 처리하는 클래스 (다형성 활용!)

package Polymorphism.MiniProject;

public class PaymentProcessor {
    public void processPayment(Payment paymentMethod, int amount) {
        paymentMethod.pay(amount); // 어떤 방식인지 몰라도, 공통 메서드로 처리 가능!
    }
}
