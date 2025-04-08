package InputOutput;

import java.io.File;
import java.io.IOException;

public class InputOutputApplication {

    public static void main(String[] args) {

        File file = new File("src/main/resources/input.txt");

        boolean createSuccess = file.exists();
        System.out.println("createNewfile: " + createSuccess);


        System.out.println("파일의 크기: " + file.length() + "byte"); // 파일의 크기(byte) 출력
        System.out.println("파일의 경로: " + file.getPath()); // 파일의 상대 경로 출력
        System.out.println("현재 파일의 상위경로: " + file.getParent()); // 파일의 상위 폴더 경로 출력
        System.out.println("파일의 절대경로: " + file.getAbsolutePath()); // 파일의 절대 경로 출력

        String path = "src/;main/resources/input.txt"; // 새로운 폴더 경로 설정
        File filepath = new File(path); // 해당 경로의 File 객체 생성

        boolean mkdir = filepath.mkdirs(); // 폴더 생성 (하위 디렉토리까지 모두 생성됨) → 성공 시 true
        System.out.println("mkdir: " + mkdir); // 폴더 생성 (하위 디렉토리까지 모두 생성됨) → 성공 시 true

        boolean deleteSuccess = filepath.delete();   // 생성된 폴더 삭제
        System.out.println("deleteSuccess: " + deleteSuccess);   // 생성된 폴더 삭제

        boolean deleteSuccess2 = new File("src/;main/resources").delete(); // 상위 폴더도 삭제 시도 (주의: 하위 폴더가 없을 때만 삭제 가능)
        System.out.println("deleteSuccess2: " + deleteSuccess2); // 상위 폴더도 삭제 시도 (주의: 하위 폴더가 없을 때만 삭제 가능)

        boolean deleteSuccess3 = file.delete(); // 처음 만든 파일(test.txt) 삭제
        System.out.println("deleteSuccess3: " + deleteSuccess3);    // 처음 만든 파일(test.txt) 삭제

        System.out.println("filepath.exists() : " + filepath.exists());
    }
}
