package ArraysAlgorithm.ComprehensivePractice;

import java.io.*;
import java.util.*;

public class MemberManager {
    private static List<Member> members = new ArrayList<>(); // 전체 회원 리스트
    private static Member currentUser = null; // 로그인 사용자
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n====== 멤버 관리 프로그램 ======");
            for (MenuOption m : MenuOption.values()) {
                System.out.println(m.getValue() + ". " + m.name());
            }
            System.out.print("선택 > ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                MenuOption selected = MenuOption.from(choice);

                if (selected == null) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                if (selected != MenuOption.LOGIN && selected != MenuOption.JOIN && selected != MenuOption.EXIT) {
                    if (currentUser == null) {
                        System.out.println("\u26a0\ufe0f 로그인이 필요합니다.");
                        continue;
                    }
                }

                switch (selected) {
                    case VIEW_ALL -> viewAll();
                    case SORT -> sortMenu();
                    case SEARCH -> searchMember();
                    case ADD -> addMember();
                    case DELETE -> deleteMember();
                    case SAVE -> saveToFile();
                    case LOAD -> loadFromFile();
                    case LOGIN -> login();
                    case JOIN -> joinMember();
                    case LOGOUT -> logout();
                    case EXIT -> {
                        System.out.println("종료합니다.");
                        return;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
            }
        }
    }

    // 전체 목록 출력
    private static void viewAll() {
        if (members.isEmpty()) {
            System.out.println("등록된 멤버가 없습니다.");
        } else {
            members.forEach(System.out::println);
        }
    }

    // 정렬 메뉴
    private static void sortMenu() {
        System.out.println("[정렬 기준 선택]\n1. 이름 오름차순\n2. 나이 내림차순\n3. 점수 오름차순");
        System.out.print("선택 > ");
        String sel = sc.nextLine();

        switch (sel) {
            case "1" -> members.sort(Comparator.comparing(Member::getName));
            case "2" -> members.sort(Comparator.comparing(Member::getAge).reversed());
            case "3" -> members.sort(Comparator.comparing(Member::getPoint));
            default -> System.out.println("잘못된 선택입니다.");
        }
    }

    // 이름으로 검색
    private static void searchMember() {
        System.out.print("검색할 이름 > ");
        String keyword = sc.nextLine();
        boolean found = false;
        for (Member m : members) {
            if (m.getName().contains(keyword)) {
                System.out.println(m);
                found = true;
            }
        }
        if (!found) System.out.println("검색 결과 없음");
    }

    // 회원 추가
    private static void addMember() {
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("점수: ");
        int point = Integer.parseInt(sc.nextLine());
        System.out.print("비밀번호: ");
        String pw = sc.nextLine();

        members.add(new Member(name, age, point, pw));
        System.out.println("추가 완료!");
    }

    // 회원 삭제
    private static void deleteMember() {
        System.out.print("삭제할 이름 > ");
        String name = sc.nextLine();
        boolean removed = members.removeIf(m -> m.getName().equals(name));
        System.out.println(removed ? "삭제 완료!" : "일치하는 이름 없음");
    }

    // 파일 저장
    private static void saveToFile() {
        try (PrintWriter pw = new PrintWriter("members.txt")) {
            for (Member m : members) {
                pw.println(m.getId() + "," + m.getName() + "," + m.getAge() + "," + m.getPoint() + "," + m.getPassword());
            }
            System.out.println("저장 완료!");
        } catch (IOException e) {
            System.out.println("파일 저장 실패: " + e.getMessage());
        }
    }

    // 파일 불러오기
    private static void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("members.txt"))) {
            members.clear();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                int point = Integer.parseInt(parts[3]);
                String pw = parts[4];
                members.add(new Member(id, name, age, point, pw));
            }
            System.out.println("불러오기 완료!");
        } catch (IOException e) {
            System.out.println("불러오기 실패: " + e.getMessage());
        }
    }

    // 로그인
    private static void login() {
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("비밀번호: ");
        String pw = sc.nextLine();

        for (Member m : members) {
            if (m.getName().equals(name) && m.getPassword().equals(pw)) {
                currentUser = m;
                System.out.println("로그인 성공! 환영합니다 " + m.getName() + "님");
                return;
            }
        }
        System.out.println("로그인 실패. 아이디 또는 비밀번호를 확인하세요.");
    }

    // 회원가입
    private static void joinMember() {
        addMember(); // 기존 추가 로직 재사용
    }

    // 로그아웃
    private static void logout() {
        if (currentUser != null) {
            System.out.println("로그아웃 완료: " + currentUser.getName() + "님");
            currentUser = null;
        } else {
            System.out.println("현재 로그인 상태가 아닙니다.");
        }
    }
}

