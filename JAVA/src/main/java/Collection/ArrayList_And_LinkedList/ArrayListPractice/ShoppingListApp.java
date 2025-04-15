package Collection.ArrayList_And_LinkedList.ArrayListPractice;

import java.util.ArrayList; // ArrayList 사용을 위한 import
import java.util.Scanner;   // 사용자 입력을 받기 위한 Scanner import

public class ShoppingListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성
        ArrayList<String> shoppingList = new ArrayList<>(); // 문자열을 저장할 ArrayList 생성

        // 1단계: 물건 입력
        System.out.println("물건을 입력하세요 (끝 입력 시 종료):");
        while (true) { // 무한 반복
            String item = sc.nextLine(); // 한 줄 입력 받기
            if (item.equals("끝")) break; // "끝"을 입력하면 반복 종료
            shoppingList.add(item); // 입력된 항목을 리스트에 추가
        }

        // 2단계: 현재 리스트 출력
        System.out.println("\n[현재 쇼핑 리스트]");
        for (int i = 0; i < shoppingList.size(); i++) { // 리스트 크기만큼 반복
            System.out.println((i + 1) + ". " + shoppingList.get(i)); // 번호와 함께 출력
        }

        // 3단계: 물건 수정
        System.out.print("\n수정할 물건 이름: ");
        String oldItem = sc.nextLine(); // 기존 항목 이름 입력받기
        System.out.print("새 이름: ");
        String newItem = sc.nextLine(); // 새 이름 입력받기

        int index = shoppingList.indexOf(oldItem); // 기존 항목의 인덱스 찾기
        if (index != -1) { // 항목이 존재하면
            shoppingList.set(index, newItem); // 새 이름으로 교체
        } else {
            System.out.println("해당 물건이 없습니다."); // 항목이 없으면 안내 메시지
        }

        // 4단계: 물건 삭제
        System.out.print("\n삭제할 물건 이름: ");
        String deleteItem = sc.nextLine(); // 삭제할 항목 이름 입력

        if (shoppingList.remove(deleteItem)) { // 삭제가 성공하면 true 반환
            System.out.println(deleteItem + "을(를) 삭제했습니다."); // 삭제 메시지 출력
        } else {
            System.out.println("해당 물건이 없습니다."); // 삭제 실패 시 안내
        }

        // 최종 리스트 출력
        System.out.println("\n[최종 쇼핑 리스트]");
        for (int i = 0; i < shoppingList.size(); i++) { // 리스트 반복 출력
            System.out.println((i + 1) + ". " + shoppingList.get(i)); // 번호와 함께 출력
        }

        sc.close(); // Scanner 자원 해제
    }
}
