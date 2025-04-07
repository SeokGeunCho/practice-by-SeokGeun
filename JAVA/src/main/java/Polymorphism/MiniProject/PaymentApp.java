package Polymorphism.MiniProject;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // 다양한 결제 방식 객체 생성
        Payment card = new CardPayment();
        Payment paypal = new PaypalPayment();
        Payment bank = new BankTransferPayment();

        // 다형성을 이용해서 같은 방식으로 호출
        processor.processPayment(card, 10000);
        processor.processPayment(paypal, 20000);
        processor.processPayment(bank, 30000);

    }
}
