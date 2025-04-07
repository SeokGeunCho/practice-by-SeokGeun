// 자식 클래스3: 계좌이체 결제

package Polymorphism.MiniProject;

public class BankTransferPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("🏦 계좌이체로 " + amount + "원 결제했습니다.");
    }
}
