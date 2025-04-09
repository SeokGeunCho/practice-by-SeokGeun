package A_TheWorkingCode.Practice001;

class Employee {
    private String id;
    private String name;
    private String department;

    // 생성자
    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // getter 메서드
    public String getId() {
        return id;
    }

    // 사원 정보 출력용 toString()
    public String toString() {
        return "ID: " + id + ", 이름: " + name + ", 부서: " + department;
    }
}
