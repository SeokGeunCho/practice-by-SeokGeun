package Application_Programming_Interface.Mini_Project;

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ToDoListApp {

    // 📌 할 일 저장용 내부 클래스 정의
    static class ToDo {
        int id;                     // 고유 ID
        String content;            // 할 일 내용
        LocalDateTime deadline;    // 마감 시간
        boolean isDone;            // 완료 여부

        ToDo(int id, String content, LocalDateTime deadline) {
            this.id = id;
            this.content = content;
            this.deadline = deadline;
            this.isDone = false;
        }

        // 할 일을 문자열로 출력 (마감 여부와 완료 상태 포함)
        @Override
        public String toString() {
            String doneMark = isDone ? "✅" : "❌";
            String deadlineStr = deadline.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

            // 현재 시간이 마감일보다 크고 완료가 안 되었을 경우 ⚠️ 마감 경고 표시
            String overdueMark = (!isDone && deadline.isBefore(LocalDateTime.now())) ? " ⚠️마감됨" : "";

            return "[" + id + "] " + content + " | 마감: " + deadlineStr + " | 완료 여부: " + doneMark + overdueMark;
        }
    }

    // 📌 전역 변수
    static Scanner scanner = new Scanner(System.in);               // 사용자 입력
    static ArrayList<ToDo> todoList = new ArrayList<>();           // 할 일 저장소
    static int nextId = 1;                                         // ID 자동 증가용
    static final String FILE_NAME = "todolist.txt";                // 저장 파일명

    public static void main(String[] args) {
        loadFromFile();  // 실행 시 파일에서 저장된 목록 불러오기

        // 📌 반복 메뉴
        while (true) {
            showMenu();  // 메뉴 출력
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    addTodo(); break;
                case "2":
                    listTodos(); break;
                case "3":
                    markAsDone(); break;
                case "4":
                    deleteTodo(); break;
                case "5":
                    saveToFile();
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case "6":
                    showCompletedTodos(); break;
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }
        }
    }

    // 📌 메뉴 출력
    static void showMenu() {
        System.out.println("\n=== 할 일 관리 프로그램 ===");
        System.out.println("1. 할 일 추가");
        System.out.println("2. 할 일 목록 보기");
        System.out.println("3. 할 일 완료 처리");
        System.out.println("4. 할 일 삭제");
        System.out.println("5. 종료");
        System.out.println("6. 완료된 할 일 보기");
        System.out.print(">> ");
    }

    // ✅ 1. 할 일 추가 기능
    static void addTodo() {
        try {
            System.out.print("할 일을 입력하세요: ");
            String content = scanner.nextLine();  // 할 일 내용 입력

            System.out.print("마감일시를 입력하세요 (yyyy-MM-dd HH:mm): ");
            String deadlineInput = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime deadline = LocalDateTime.parse(deadlineInput, formatter); // 문자열 → 날짜 변환

            ToDo todo = new ToDo(nextId++, content, deadline); // 새 할 일 생성
            todoList.add(todo); // 리스트에 추가

            System.out.println("등록되었습니다!");
        } catch (Exception e) {
            System.out.println("입력 형식이 잘못되었습니다. 예: 2025-04-08 18:00");
        }
    }

    // ✅ 2. 할 일 목록 보기 (마감일 기준 정렬 포함)
    static void listTodos() {
        if (todoList.isEmpty()) {
            System.out.println("할 일이 없습니다.");
            return;
        }

        // 마감일 기준 오름차순 정렬
        Collections.sort(todoList, Comparator.comparing(todo -> todo.deadline));

        for (ToDo todo : todoList) {
            System.out.println(todo.toString());
        }
    }

    // ✅ 3. 완료 처리 기능
    static void markAsDone() {
        System.out.print("완료 처리할 ID를 입력하세요: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());

            for (ToDo todo : todoList) {
                if (todo.id == id) {
                    todo.isDone = true;
                    System.out.println("완료 처리되었습니다.");
                    return;
                }
            }
            System.out.println("해당 ID를 가진 할 일이 없습니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식으로 입력해주세요.");
        }
    }

    // ✅ 4. 삭제 기능
    static void deleteTodo() {
        System.out.print("삭제할 ID를 입력하세요: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());

            boolean removed = todoList.removeIf(todo -> todo.id == id);

            if (removed) {
                System.out.println("삭제되었습니다.");
            } else {
                System.out.println("해당 ID를 가진 할 일이 없습니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식으로 입력해주세요.");
        }
    }

    // ✅ 5. 완료된 항목만 보기
    static void showCompletedTodos() {
        boolean found = false;
        for (ToDo todo : todoList) {
            if (todo.isDone) {
                System.out.println(todo.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("완료된 할 일이 없습니다.");
        }
    }

    // ✅ 저장 기능 (파일로 저장)
    static void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (ToDo todo : todoList) {
                String line = todo.id + "|" + todo.content + "|" + todo.deadline + "|" + todo.isDone;
                writer.write(line);
                writer.newLine();
            }
            System.out.println("할 일 목록이 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생!");
        }
    }

    // ✅ 불러오기 기능 (파일에서 읽기)
    static void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String content = parts[1];
                LocalDateTime deadline = LocalDateTime.parse(parts[2]);
                boolean isDone = Boolean.parseBoolean(parts[3]);

                ToDo todo = new ToDo(id, content, deadline);
                todo.isDone = isDone;

                todoList.add(todo);

                // ID가 최대값보다 크면 nextId 갱신
                if (id >= nextId) {
                    nextId = id + 1;
                }
            }
            System.out.println("할 일 목록을 불러왔습니다.");
        } catch (IOException e) {
            System.out.println("파일 불러오기 중 오류 발생!");
        }
    }
}
