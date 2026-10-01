package lecture.section01.conditional;

import java.util.Scanner;

public class B_if_elseif {


/*
if -elseif

 */

    public void testSimpleIf() {

        //전달된 정수가 짝수면 "짝수"입니다.
        //아니면 홀수입니다.

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();
        if (num ==0) {
            System.out.println("짝수입니다");

        } else if((num % 2) == 0) {
            System.out.println("짝수입니다");


        }else {

            System.out.println("홀수입니다");
        }


        System.out.println("프로그램을 종료합니다");

    }

}
