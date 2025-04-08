package Generics;

// 🔹 어떤 타입이든 출력하는 제너릭 메서드
public class GenericMethodExample {
    public static <T> void printItem(T item) {
        System.out.println("출력: " + item);
    }
    public static void main(String[] args) {
        printItem("문자열");
        printItem(100);
        printItem(3.14);
        printItem(true);
    }
}
// ✅ 자주 쓰는 제너릭 클래스
//  클래스	            설명
//  ArrayList<E>        리스트의 요소 타입을 지정 (<String>, <Integer>, 등)
//  HashMap<K,V>	    키와 값의 타입 지정
//  Optional<T>	        값이 있을 수도 있고 없을 수도 있을 때