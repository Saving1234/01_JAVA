package lecture.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /*
            Stack
            후입 선출.(LIFO)
            나중에 들어온 것부터 빨리 나간다.
         */

        Stack<Integer> intStack = new Stack<>();

        intStack.push(3);
        intStack.push(2);
        intStack.push(24);
        intStack.push(134);

        System.out.println(intStack);

        //Pop : 반환 후 제거
        //peek : 보기만.

        System.out.println(intStack.peek());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        //System.out.println(intStack.pop()); 배열 갯수 넘어갈 만큼 pop을 출력하면 더 이상 제거할 게 없어서 오류 뜸.


    }


}
