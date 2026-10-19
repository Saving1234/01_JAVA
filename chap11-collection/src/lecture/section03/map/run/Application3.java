package lecture.section03.map.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application3 {
    public static void main(String[] args) {

        Properties prop = new Properties();
        //읽어올때
        try(FileInputStream input = new FileInputStream("settintg.properties")){

            //파일인풋스트림을 이용해 파일 읽어오는 역할.(load)
            prop.load(input);

        }catch (IOException e){
            //exception 구조. 이것도 상속 구조로 되어 있음.
            //외부에서 문제 생기는 걸 체크.

        } System.out.println(prop);

    }

}
