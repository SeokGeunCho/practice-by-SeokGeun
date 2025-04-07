package Application_Programming_Interface.Concept.String;

public class StringAPIExample_0 {
    public static void main(String[] args) {
        String name = "Java Programming";   // 문자열을 name이라는 변수에 저장

        System.out.println(name.length());  // 문자열의 길이를 구함 (공백 포함해서 총 16자)  -> 16
        System.out.println(name.toUpperCase()); // 문자열을 모두 대문자로 변환해서 리턴 -> JAVA PROGRAMMING
        System.out.println(name.toLowerCase()); // 문자열을 모두 소문자로 변환해서 리턴 -> java programming
        System.out.println(name.contains("gram"));  // 문자열 안에 "gram"이 포함돼 있는지 true/false로 알려줌 -> true
        System.out.println(name.contains("hello")); // 문자열 안에 "hello"이 포함돼 있는지 true/false로 알려줌 -> fales
        System.out.println(name.substring(0,5)); // 문자열 앞 5글자만 자르기 -> Java
        System.out.println(name.substring(name.length() -4)); // 문자열 뒷 4글자만 자르기 -> ming
    }
}
