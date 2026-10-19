package lecture.section03.substream;

import java.io.*;
import java.nio.Buffer;


public class Application2 {
    public static  void main(String[] args) {


        //내보낸다.

        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong777@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea31@ohgiraffers.com", 16, '여', 1221.6),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin@ohgiraffers.com", 22, '남', 1234.6)};


        try (
                FileOutputStream fo = new FileOutputStream("src/lecture/section03/substream/object.dat");
                //dat 자바 객체 불러오는 파일?
                BufferedOutputStream bfo = new BufferedOutputStream(fo);
                 ObjectOutputStream oos = new ObjectOutputStream(bfo);
        ) {

            for(MemberDTO dto : outputMembers){
                oos.writeObject(dto);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        MemberDTO[] inputMember = new MemberDTO[3];

        try (
                FileInputStream fi = new FileInputStream("src/lecture/section03/substream/object.dat");
                //dat 자바 객체 불러오는 파일?
                BufferedInputStream bfi = new BufferedInputStream(fi);
                ObjectInputStream oos = new ObjectInputStream(bfi);
        ) {





            for(int i =0; i < inputMember.length; i++){
                inputMember[i] =(MemberDTO) oos.readObject();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(MemberDTO dto : inputMember){
            System.out.println(dto);
        }

    }
    }
