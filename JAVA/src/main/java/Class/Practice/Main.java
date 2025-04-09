package Class.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// 실행 클래스
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 Scanner 생성
        ArrayList<Book> books = new ArrayList<>(); // 책 객체들을 저장할 리스트 생성
        boolean running = true; // 프로그램 실행 여부 제어 변수

        while (running) {
            // 메뉴 출력
            System.out.println("\n📚 도서 관리 프로그램");
            System.out.println("1. 책 등록");
            System.out.println("2. 전체 책 목록 출력");
            System.out.println("3. 책 제목으로 검색");
            System.out.println("4. 책 가격 수정");
            System.out.println("5. 책 삭제");
            System.out.println("6. 가격 오름차순 정렬 출력");
            System.out.println("7. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt(); // 메뉴 입력
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1:
                    // 📘 책 등록
                    System.out.print("제목: ");
                    String title = scanner.nextLine();

                    // 중복 제목 검사
                    boolean isDuplicate = false;
                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(title)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (isDuplicate) {
                        System.out.println("⚠ 이미 존재하는 제목입니다. 책 등록을 취소합니다.");
                        break;
                    }

                    System.out.print("저자: ");
                    String author = scanner.nextLine();

                    System.out.print("가격: ");
                    int price = scanner.nextInt();
                    scanner.nextLine(); // 개행 제거

                    // 책 리스트에 추가
                    books.add(new Book(title, author, price));
                    System.out.println("✅ 책이 등록되었습니다.");
                    break;

                case 2:
                    // 📋 전체 책 목록 출력
                    System.out.println("\n전체 책 목록:");
                    if (books.isEmpty()) {
                        System.out.println("📂 등록된 책이 없습니다.");
                    } else {
                        for (Book b : books) {
                            b.printInfo(); // 각 책 정보 출력
                        }
                    }
                    break;

                case 3:
                    // 🔍 제목으로 책 검색
                    System.out.print("검색할 책 제목: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(searchTitle)) {
                            b.printInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ 해당 책을 찾을 수 없습니다.");
                    }
                    break;

                case 4:
                    // 💵 책 가격 수정
                    System.out.print("가격을 수정할 책 제목: ");
                    String editTitle = scanner.nextLine();
                    boolean updated = false;

                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(editTitle)) {
                            System.out.print("새 가격 입력: ");
                            int newPrice = scanner.nextInt();
                            scanner.nextLine();
                            b.changePrice(newPrice);
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("❌ 해당 책을 찾을 수 없습니다.");
                    }
                    break;

                case 5:
                    // ❌ 책 삭제
                    System.out.print("삭제할 책 제목: ");
                    String deleteTitle = scanner.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).title.equalsIgnoreCase(deleteTitle)) {
                            books.remove(i); // 해당 인덱스 책 삭제
                            System.out.println("🗑 책이 삭제되었습니다.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("❌ 해당 책을 찾을 수 없습니다.");
                    }
                    break;

                case 6:
                    // 🔽 가격 오름차순 정렬 후 출력
                    Collections.sort(books, Comparator.comparingInt(b -> b.price));
                    System.out.println("💰 가격 오름차순 정렬 결과:");
                    for (Book b : books) {
                        b.printInfo();
                    }
                    break;

                case 7:
                    // 종료
                    running = false;
                    System.out.println("📴 프로그램을 종료합니다.");
                    break;

                default:
                    // 메뉴 번호 잘못 선택한 경우
                    System.out.println("⚠ 올바른 메뉴 번호를 선택해주세요.");
            }
        }

        scanner.close(); // Scanner 자원 해제
    }
}