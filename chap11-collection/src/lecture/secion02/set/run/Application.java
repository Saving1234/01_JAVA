package lecture.secion02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Application {

    public static void main(String[] args) {

        //Hashset. set 인터페이스에서 가장 많이 사용됨.
        // 순서 없음.
        //같은 요소 중복 저장 안함.,(set의 특징)

        HashSet<String> hset = new HashSet<>();

        Set hset2 = hset;
        Collection hset3 = hset;

        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        //저장순서 유지가 안됨.
        //linked가 아니라서 위치 정보는 몰라서?
        System.out.println(hset);
        System.out.println(hset.size());


        //중복 추가 안됨.
        System.out.println("=================w= 중복 추가 =========");
        hset.add("java");
        System.out.println(hset);

        //저장한 내용을 한 개씩 꺼내는 내용이 없다. get 없다.
        //배열 형태로 바꾸기.

        Object[]arr = hset.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        //Iterator (반복자)
        // 컬렉션에서 값을 꺼내 읽어오는 방식을 통일하기 위해 사용.
        // hasNext() : 다음 요소가 있으면 true, 없으면 false. 영어 직역(다음 있는지)
        //next() : 다음 요소 반환.(다음) , 현재 가리키는 요소를 다음으로 넘어감.



        //이터러블 : 값을 순서대로 가지고 오는 것. 컬렉션에선 이터레이터로 사용.
        Iterator<String> iter = hset.iterator();

       while(iter.hasNext()){
           System.out.println(iter.next()); //요소 반환.
       }



    }

}
