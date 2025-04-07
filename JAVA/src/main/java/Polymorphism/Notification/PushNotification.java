package Polymorphism.Notification;

public class PushNotification extends Notification {
    @Override
    public void send() {
        System.out.println("\uD83D\uDCF2 앱 푸시를 보냈씁니다.");
    }
}
