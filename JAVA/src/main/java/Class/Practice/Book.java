package Class.Practice;

// Book 클래스 정의
class Book {
    String title;
    String author;
    int price;

    // 생성자
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 책 정보 출력
    void printInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원\n");
    }

    // 책 가격 변경
    void changePrice(int newPrice) {
        this.price = newPrice;
        System.out.println("가격이 " + newPrice + "원으로 변경되었습니다.");
    }
}