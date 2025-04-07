package Polymorphism.Notification;

public class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("\uD83D\uDCF1 문자를 보냈습니다.");
    }
}
