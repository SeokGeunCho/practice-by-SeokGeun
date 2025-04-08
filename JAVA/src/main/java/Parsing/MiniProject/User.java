package Parsing.MiniProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class User {
    int age;
    double height;
    boolean isAdult;
    LocalDateTime createdAt; // 등록시간

    public User(int age, double height, boolean isAdult, LocalDateTime createdAt) {
        this.age = age;
        this.height = height;
        this.isAdult = isAdult;
        this.createdAt = createdAt;
    }
    public void printInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm:ss");
        System.out.println("나이: " + age + "살, 키: " + height + "cm, 성인여부: " +  (isAdult ? "성인" : "미성년자"));
        System.out.println("등록일시: " + createdAt.format(formatter));
    }
    // 파일에 출력할 형식 지정
    public String toFileString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return age + "," + height + "," + (isAdult ? "성인" : "미성년자") + "," + createdAt.format(formatter);
    }
}

