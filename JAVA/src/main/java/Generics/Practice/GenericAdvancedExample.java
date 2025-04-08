package Generics.Practice;

public class GenericAdvancedExample {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.set("Hello");

        Box<Integer> intBox = new Box<>();
        intBox.set(123);

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);

        // ✅ 다양한 타입을 받아서 출력
        Printer.printBox(strBox);
        Printer.printBox(intBox);
        Printer.printBox(doubleBox);
    }
}
