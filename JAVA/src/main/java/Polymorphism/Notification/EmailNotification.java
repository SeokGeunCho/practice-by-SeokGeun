package Polymorphism.Notification;

public class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("\uD83D\uDCE7 이메일을 보냈습니다.");
    }
}
