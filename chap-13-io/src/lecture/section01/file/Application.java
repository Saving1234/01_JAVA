package lecture.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        /*
            File 클래스
             파일 처리를 수행하는 클래스
             파일 생성, 삭제, 정보조회 등의 기능을 제공
         */

        //인자가 필수.
        //경로를.
        File file = new File("src/lecture/section01/file/text.text"); //상대경로.

        //자바 밖에서도 사용할 때. 윈도우의 파일관리 시스템을 사용.
        //외부 것을 사용할 때는 윈도우에 문제가 생길 수 있기 때문에 exception은 필수.

        try {
            file.createNewFile();
            //파일 생성할 수가 있다.
            //경로에 해달하는 파일을 생성.
            boolean createSuceess = file.createNewFile();
            System.out.println(createSuceess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath() + "byte");
        System.out.println("파일의 절대경로 : " + file.getAbsolutePath() + "byte");

       // file.delete(); //파일 삭제.

    }

}
