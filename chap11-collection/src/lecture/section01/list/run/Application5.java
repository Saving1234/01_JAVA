package lecture.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        //선형 메모리 공간에 데이터 저장하는 선입선출(FIFO).
        // 먼저 들어온게 먼저 나가도록.

        Queue<String> que = new LinkedList<>();

        //데이터 삽입.
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        //peek() : 큐의 가장 앞에있는 요소를 반환.
        //poll() : 큐의 가장 앞에있는 요소를 반환 후 제거.

        System.out.println("큐 픽"+ que.peek());
        System.out.println("큐 픽"+ que.peek());
        System.out.println("큐 픽"+ que.peek());

        System.out.println("큐 폴" + que.poll());
        System.out.println("큐 폴" + que.poll());
        System.out.println("큐 폴" + que.poll());
        System.out.println("큐 폴" + que.poll());
        System.out.println("큐 폴" + que.poll());
        System.out.println("큐 폴" + que.poll()); // 더 이상 제거할 게 없으니 null이 나옴. stack은 에러. queue는 null.
    }
}
