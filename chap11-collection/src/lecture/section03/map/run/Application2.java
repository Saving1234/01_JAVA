package lecture.section03.map.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /*

               properties
               key - value 쌍으로 문자열만 사용가능
               설정 파일의 설정 값 저장하는 용도
         */

        Properties prop = new Properties();

        prop.setProperty("language", "Korean");
        prop.setProperty("theme", "dark");
        prop.setProperty("fontsize", "16");

        //System.out.println("prop = " + prop);

        //조회
        //key 값 넘김.
        //배포할 때 쓰이진 않음. 런 타임할 때만.
        //CI/CD에 시크릿 코드로 PASSWORD나 인증키는 따로 넣음.
       // System.out.println("DJSDJ : " + prop.getProperty("language"));

        //수정
        //해당 키와 바꾸고 싶은 벨류 입력하면 덮어씌워짐.
        prop.setProperty("theme", "darkness");

        //파일 입출력.
        try(FileOutputStream output = new FileOutputStream("settintg.properties")){

            //파일 저장. store
            prop.store(output, "application settings");
            System.out.println("settings.properties 파일 저장 완료");

        } catch (IOException e){

        }



    }

}
