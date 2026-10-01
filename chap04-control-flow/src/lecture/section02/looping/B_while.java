package lecture.section02.looping;

import java.util.Scanner;

public class B_while {

    /*
    초기식 ;

     while (조건식) {
     반복시키고 싶은 구문

     증감식
     }
     */

    //ctrl +alt + l : 줄정렬
    // ctrl + alt + o : 안쓰는 줄 지우기.

    public void sampleWhile() {

        int i = 1;

        Scanner sc = new Scanner(System.in);
        while (i<=10){
            System.out.println(i);

            i++;
        }

        while (true){

            int num = sc.nextInt();





            if(num==5){
                break;
            } else {
                System.out.println("5가 아닙니다");
            }
            System.out.println("축하!");
            }
        }
    }

