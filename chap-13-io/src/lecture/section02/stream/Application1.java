package lecture.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /*
            Stream : 자바 프로그램과 외부 데이터를 연결하는 통로. (서로 단방향. 그래서 따로 존재.)

            입력 스트림 : 데이터를 읽어오기 위한 스트림 (FileInputStream, FileReader(char 단위로 읽어옴.) )
            출력 스트림 : 데이터를 출력하기 위한 스트림

            반납할 때도 try-catch 문. 윈도우 상하면 안되니까.
         */

        //null 하는 이유?
        FileInputStream fin = null;
        //이경로의 파일을 읽겠다.

        try

            (FileInputStream fin = new FileInputStream("src/lecture/section02/stream/testInputStream.txt")){

            //읽을 때는.
            //read() : 파일의 기록된 값을 순차적으로 읽어옴, 더 이상 읽을게 없으면 -1 반환.
            int value;
            while ((value = fin.read()) != -1){


                //한글은 한 글자에 3byte.
                // 외부시스템은 메모리를 사용많이 함.
                //한번에 읽어올 수 있도록 처리해야함.
                //지금은 나눠서.
                System.out.print((char)(value));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fin != null){

                try {
                    fin.close();
                }catch (IOException e){
                    System.out.println("오류" + e);
                }

            }
        }


    }

}e
