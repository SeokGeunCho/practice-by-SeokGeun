package ArraysAlgorithm.ComprehensivePractice;

public class Member {
    private static int nextId = 1; // ID 자동 증가

    private int id;
    private String name;
    private int age;
    private int point;
    private String password; // 비밀번호

    // 회원가입 생성자
    public Member(String name, int age, int point, String password) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.point = point;
        this.password = password;
    }

    // 파일 불러오기용 생성자
    public Member(int id, String name, int age, int point, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.point = point;
        this.password = password;

        if (id >= nextId) {
            nextId = id + 1;
        }
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getPoint() { return point; }
    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " (" + age + "세, 점수: " + point + ")";
    }
}
/*
✅ 정리 요약
멤버 변수	        설명
static int nextId	모든 회원의 고유 ID를 자동 증가시킴
id	                회원 고유 ID
name	            이름
age	                나이
point	            점수

생성자	                        용도
Member(name, age, point)	    새로 추가할 때 자동 ID 부여
Member(id, name, age, point)	저장된 파일 불러올 때 ID 유지

기타	설명
toString()	System.out.println(member) 시 출력 포맷 설정
getXXX()	멤버 정보 접근용 getter       */