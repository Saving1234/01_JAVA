package lecture.section02.looping;

public class C_doWhile {

public void sampleDowhile(){

    /*
    초기식.
    do{
        반복시키고 싶은 코드
        증감식
     } while (조건식0
     .
     .
     .

     */

    //do while은 한번은 무조건 작동.
    //while은 조건이 안맞으면 작동 안함.

    do{
        System.out.println("최초 한번 동작함");
    } while (false);

    System.out.println("반복문 종료됨...");

}

}
