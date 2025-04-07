package Polymorphism.Notification;

public class PolymorphismExample {
    public static void main(String[] args) {
        // 부모 타입으로 다양한 자식 객체를 담음
        Notification[] notifications = {
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        // 같은 메서드지만 객체 타입에 따라 다르게 동작함 (다형성!)
        for (Notification n : notifications) {
            n.send(); // 어떤 send()가 실행될지는 실제 객체가 결정함!
        }
    }
}
/**
 * ✅ 한글 해설
 * Notification 클래스는 send()라는 공통 인터페이스를 제공한다.
 * EmailNotification, SMSNotification, PushNotification은 이걸 오버라이딩해서 자신만의 방식으로 구현.
 * 부모 클래스 타입인 Notification 배열에 다양한 자식 객체를 담을 수 있음 → 이게 바로 다형성!
 *
 * ✅ 정리 포인트
 * 개념            	설명
 * 상속	    :   자식이 부모의 구조를 물려받음
 * 오버라이딩	:   자식이 부모의 메서드를 "다르게" 구현
 * 다형성	:   부모 타입으로 다양한 자식 객체를 다룰 수 있음
 */