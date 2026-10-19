package lecture.section02.Scanner;

import java.util.Scanner;

public class Applictaion1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름:");

        String nama = sc.nextLine();

        System.out.println("이름은 " + nama + "입니다.");

       //정수값 반환
        System.out.println("나이 : ");
        int age = sc.nextInt();

        System.out.println("나이는 " + age + "입니다");


        //프레임 워크
        //라이브러리 추가.
        //org.springframwork.
    }

}
