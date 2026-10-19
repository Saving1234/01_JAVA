package lecture.section01.list.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;


public class Application1 {

    public static void main(String[] args) {

        /*
            ArrayList
            배열의 단점을 보완.
            크기변경, 요소의 추가 삭제, 정렬기능을 구현해놓음.
         */

        ArrayList arrayList = new ArrayList();
        List arraylist = new ArrayList();

        arrayList.add("dd");
        arrayList.add(34);
        arrayList.add(34.4);
        arrayList.add(LocalDateTime.now());

        System.out.println("arrList =" + arrayList); //toString 오버라이딩이 되어있다.
        System.out.println(arrayList.size()); //length 대신 size.
        System.out.println(arrayList.get(1));//인덱스 출력.

        arrayList.add(1, "바나나"); //인덱스 위치에 삽입도 가능.

        arrayList.remove(1); //지울 땐 remove!





    }

}
