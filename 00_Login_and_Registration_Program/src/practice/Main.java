package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "C:\\study by myself\\00_Login_and_Registration_Program\\src\\practice\\Login.txt";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("[1] 로그인 [2] 회원가입 [3] 종료"); //화면 구성
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("숫자 1, 2, 3 중에 하나를 다시 선택하세요.\n");
                    break;
            }
        }
    }

    //회원가입 기능
    //사용자로부터 이름, 아이디, 비밀번호를 입력받음
    private static void register() {
        System.out.print("이름: ");
        String name = sc.nextLine();

        String id; //회원가입-아이디
        while (true) {
            System.out.print("아이디: ");
            id = sc.nextLine();
            if (availableId(id)) { //availableId: 아이디 중복 확인
                System.out.println("아이디 사용 가능 합니다.\n");
                break;
            } else {
                System.out.println("중복된 아이디입니다. 다시 입력하세요.");
            }
        }

        String password;
        while (true) {
            System.out.println("(비밀번호는 8자 이상이어야 하며, 대문자, 소문자, 특수기호,숫자를 최소 1개 이상 포함해야 합니다.)");
            System.out.print("비밀번호: ");
            password = sc.nextLine();
            if (!availablePassword(password)) { //availablePassword: 비밀번호의 유효성을 검사하고, 확인 입력을 통해 일치 여부를 확인
                System.out.println("비밀번호 조건을 확인하세요.\n");
                continue;
            }
            System.out.print("비밀번호 확인: ");
            String confirmPassword = sc.nextLine();
            if (password.equals(confirmPassword)) {
                break;
            } else {
                System.out.println("비밀번호를 다시 입력하세요\n");
            }
        }
        save(name, id, password); //입력받은 사용자 정보를 save 메소드를 통해 파일에 저장
        System.out.println(name + "님 가입을 축하합니다\n");
    }

    // 비밀번호 유효성 검사
// 대문자, 소문자, 숫자, 특수문자가 각각 하나 이상 포함되고, 8자 이상인지 검사
    private static boolean availablePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;  // 대문자
        boolean hasLowerCase = false;  // 소문자
        boolean hasDigit = false;      // 숫자
        boolean hasSpecialChar = false; // 특수문자

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    // 아이디 중복 확인
    private static boolean availableId(String id) {
        List<Login> users = load(); //load 메소드를 통해 파일에서 사용자 정보를 읽어옴
        for (Login user : users) { //향상된 for문과 if문을 통해 리스트에 중복되는 아이디가 있는지 확인
            if (user.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    // 로그인 기능
    private static void login() {
        System.out.print("아이디: ");
        String id = sc.nextLine();
        System.out.print("비밀번호: ");
        String password = sc.nextLine();

        List<Login> users = load();
        boolean loginSuccess = false;
        for (Login user : users) {
            if (user.getId().equals(id) && user.getPassword().equals(password)) { //현재 검사중인 user객체의 아이디와 비밀번호가 맞는 경우
                System.out.println("로그인 성공\n");
                loginSuccess = true;
                break;
            }
        }
        if (!loginSuccess) {
            // 로그인 실패 시 메시지를 한 번만 출력
            System.out.println("로그인 실패. 아이디나 비밀번호를 다시 입력하세요.\n");
        }
    }

    // BufferedWriter와 FileWriter를 사용하여 파일쓰기
    private static void save(String name, String id, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + "," + id + "," + password);  // 사용자 정보를 쉼표로 구분하여 파일에 쓰기
            writer.newLine();
        } catch (IOException e) {
            System.out.println("사용자 정보를 저장하는 동안 오류가 발생했습니다.");
        }
    }

    // BufferedReader와 FileReader를 사용하여 파일읽기
    private static List<Login> load() { //users라는 이름의 List 객체를 선언하고, load 메서드를 호출
        List<Login> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) { // 파일에서 한 줄씩 읽기(null이 아닐 경우 반복문 계속 실행)
                String[] parts = line.split(",");  // 쉼표로 문자열 분리
                if (parts.length == 3) { // 배열의 길이가 3인지 확인
                    users.add(new Login(parts[0], parts[1], parts[2])); // User 객체를 생성하여 리스트에 추가
                }
            }
        } catch (IOException e) {
            System.out.println("사용자 정보를 불러오는 동안 오류가 발생했습니다.");
        }
        return users;
    }
}