package lecture.section04.cleandar;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {


        Date now = new Date();
        System.out.println(now.getTime());
        //켈렌더

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) +1; //현재 날짜보다 하루 적게 나옴. 월이 0부터 시작해서.
        int date = calendar.get(Calendar.DAY_OF_MONTH);


        //서식지정지.
        //format 함수.

        //%02 : 정수를 2자리 수로 출력,
        //%.2f : 소수점 2잘.
        //%n  : 줄바꿈.

        System.out.printf("%d-%02d-%02d%n",year,month,date); //02 정수 두 자리 출력.



    }
}
