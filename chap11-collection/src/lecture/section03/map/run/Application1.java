package lecture.section03.map.run;

import java.util.Date;
import java.util.HashMap;

public class Application1 {

    //hashmap
    // key : value
    //key : 값의 이름 같은 느낌? 중복 x.
    //value : 값. 이건 중복됨. key만 다르면 됨.

    public static void main(String[] args) {


        //Map
        // key와 value를 쌍으로 저장.
        // 값을 찾기 위한 역할을 하는 객체
        /* 요소의 저장 순서를 유지하지 않는다.
           키값은 중복이 안된다.



         */

        HashMap hmap = new HashMap<>();
        //지정안하면 object 타입으로 들어가기에, 값 어떻게 써도 상관 없음.

        hmap.put("one", new Date());
        hmap.put(12, new Date());
        hmap.put("one", "new Date()");

        System.out.println(hmap);

        //key 값 중복.
        // value의 값이 덮어 씌워진다.
        //같은 value여도 key가 다르기에 저장.
        hmap.put(12, new Date());
        hmap.put(13, new Date());
        System.out.println(hmap);

        //map의 자료조회
        //get(key) : key에 해당하는 value 반환.
        System.out.println("hmap.get(\"one\")" + hmap.get("one"));

        //map 삭제.
        // .remove
        hmap.remove(12, new Date());
        System.out.println("hmap = " + hmap);


        //propperties / yaml  스프링?
        //propperties 문자열로만 저장.
        // 인증정보는 노출될 위험성이 있으니 따로 파일을 빼놓는다. key value로 빼, propperrites로 빼놓음.


    }

}
