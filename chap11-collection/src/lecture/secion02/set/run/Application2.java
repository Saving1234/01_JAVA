package lecture.secion02.set.run;

import java.util.*;

public class Application2 {

    //TreeSet : 데이터가 정렬된 상태로 저장되는 이진 검색 트리. (정렬된 상태.)
    // 이진 트리란 ? 현재 값을 기준으로 값을 추가하면서 저장. 예 : 현재값보다 크면 오른쪽, 작으면 왼쪽 . 이런 식으로 정렬.
    //검색, 추가, 삭제할 때 효율적으로 처리할 수 있도록 해주는 알고리즘.

    public static void main(String[] args) {

        TreeSet<Integer> tset = new TreeSet<>();

        //2323 기준으로 왼쪽, 오른쪽으로 정렬하는 것인지 질문.

        tset.add(2323);
        tset.add(21415);
        tset.add(003);
        tset.add(00332);

        System.out.println(tset);

        LinkedHashSet<String> hset = new LinkedHashSet<>();
        //이것도 알파벳 순이나, 맨 앞 글자끼리 비교하여.


        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println(hset);

        //정렬 원하면.
        //문자열도 정렬 가능. 근데 어떤 이건 어떤 기준으로?
        //알파벳 순으로. 맨 위에 저장한 값 기준으로.

        TreeSet<String> tset2 = new TreeSet<>(hset);

        System.out.println(tset2);


    }

}
