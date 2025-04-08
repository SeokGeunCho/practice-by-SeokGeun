package Collection.HashSet;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueVisitors {
    public static void main(String[] args) {
        HashSet<String> visitorIPs = new HashSet<>(); // HashSet<String>	중복 없이 방문자 IP를 저장할 Set
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 방문자 IP 기록 시스템 ===");

        while (true) {
            System.out.print("방문자 IP를 입력하세요 (종료하려면 'exit'): ");
            String ip = sc.nextLine(); // 사용자로부터 IP 입력

            if (ip.equalsIgnoreCase("exit")) {
                break;
            }

            if (visitorIPs.contains(ip)) { // visitorIPs.contains(ip)	이미 입력된 IP인지 확인
                System.out.println("이미 방문한 IP입니다.");
            } else {
                visitorIPs.add(ip); // visitorIPs.add(ip) Set에 IP 추가 (중복은 자동 제거됨)
                System.out.println("새 방문자 IP 등록 완료!");
            }
        }
        // 전체 방문자 IP 출력
        System.out.println("\n 유일한 방문자 IP 목록:");
        for (String ip : visitorIPs) {
            System.out.println("- " + ip);
        }

        sc.close();
    }
}
// Set은 자동으로 중복 제거	→ 같은 IP는 한 번만 저장됨