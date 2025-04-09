package Collection.ArrayList_And_LinkedList.ArrayListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        boolean running = true; // 반복문을 실행할지 여부를 결정하는 플래그 변수. false가 되면 프로그램이 종료됨.

        while (running) { // 사용자가 0을 선택할 때까지 메뉴를 계속 보여주는 반복문.
            // 메뉴 출력
            System.out.println("\n--- 단어장 메뉴 ---");
            System.out.println("1. 단어 추가");
            System.out.println("2. 단어 목록 보기");
            System.out.println("3. 단어 수정");
            System.out.println("4. 단어 삭제");
            System.out.println("5. 단어 검색");
            System.out.println("6. 단어장 비우기");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            int choice = scanner.nextInt(); // 사용자로부터 메뉴 번호를 입력받고 choice 변수에 저장.
            scanner.nextLine(); // 숫자 입력 후 남아 있는 엔터(\n)를 처리하기 위해 scanner.nextLine()을 한 번 호출.

            switch (choice) { // 사용자의 선택에 따라 기능을 분기함.
                case 1:
                    System.out.print("추가할 단어 입력: ");
                    String newWord = scanner.nextLine();
                    wordList.add(newWord);
                    System.out.println("✅ 단어가 추가되었습니다.");
                    break;
                case 2:
                    if (wordList.isEmpty()) {
                        System.out.println("📭 단어장이 비어 있습니다.");
                    } else {
                        System.out.println("📚 단어 목록: " + wordList);
                    }
                    break;
                case 3:
                    System.out.print("수정할 단어 입력: ");
                    String oldWord = scanner.nextLine();
                    if (wordList.contains(oldWord)) { // contains()로 존재 여부 확인.
                        int idx = wordList.indexOf(oldWord); // 있으면 indexOf()로 인덱스를 찾고, set()으로 새로운 단어로 수정.
                        System.out.print("새 단어 입력: ");
                        String updatedWord = scanner.nextLine();
                        wordList.set(idx, updatedWord);
                        System.out.println("✅ 단어가 수정되었습니다.");
                    } else {
                        System.out.println("❌ 해당 단어는 존재하지 않습니다.");
                    }
                    break;
                case 4:
                    System.out.print("삭제할 단어 입력: ");
                    String removeWord = scanner.nextLine();
                    if (wordList.remove(removeWord)) {
                        System.out.println("🗑️ 단어가 삭제되었습니다.");
                    } else {
                        System.out.println("❌ 해당 단어는 존재하지 않습니다.");
                    }
                    break;
                case 5:
                    System.out.print("검색할 단어 입력: ");
                    String searchWord = scanner.nextLine();
                    if (wordList.contains(searchWord)) {
                        System.out.println("🔎 단어가 존재합니다.");
                    } else {
                        System.out.println("❌ 단어가 존재하지 않습니다.");
                    }
                    break;
                case 6:
                    wordList.clear();
                    System.out.println("🧹 단어장이 초기화되었습니다.");
                    break;
                case 0:
                    running = false;
                    System.out.println("👋 프로그램을 종료합니다.");
                    break;
                default:  // 0~6 외의 숫자가 들어오면 잘못된 입력 처리.
                    System.out.println("⚠️ 잘못된 선택입니다. 다시 시도하세요.");
                    break;
            }
        }
        scanner.close();
    }
}


