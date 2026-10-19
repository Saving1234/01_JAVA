package lecture.section03.substream;

import java.io.*;


public class Application1 {

//buffer. 모았다가 한꺼번에 보내주는 보조 스프링.
    //버퍼 기능을 이용해 성능을 향상.

    public static void main(String[] args) {

        //BufferedWriter . 경로가 적힌 파일의 내용을 쓰는 것.

        try (
                FileWriter fw = new FileWriter(
                        "src/lecture/section03/substream/testBuffer.txt");
                BufferedWriter bfw = new BufferedWriter(fw)
        ) {

            bfw.write("안녕하세요!! 반갑습니다!");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


        //BufferedReader . 경로가 적힌 파일의 내용을 읽는 것.

        try (
                FileReader fw = new FileReader(
                        "src/lecture/section03/substream/testBuffer.txt");
                BufferedReader bfw = new BufferedReader(fw)
        ) {

           String temp;
           while((temp = bfw.readLine())!= null){
               System.out.println(temp);
           }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
