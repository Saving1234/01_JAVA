package lecture.section01.main_thread;

public class Application {

    public static void main(String[] args) {

        //자바에서 추상화 시킨 것.

        Thread current = Thread.currentThread();
        System.out.println(current.getName());  // .class파일로 변환 -> jvm에 들어감. -> thread동작.

        //main 스레드가 혼자서 모든 반복을 처리한다. 지금은 메인이 한개라서.
        //스레드가 여러개이면 여러개가 처리? -> 확인하기 위해서 얼마다 할당 받았는지 확인받기.
        for(int i=1; i<=5; i++ ){
            System.out.println(current.getName()  + i + "번 작업처리");





        }

        //스레드가 여러개이면 여러개가 처리할까? ->
        // 확인하기 위해서 얼마다 할당 받았는지 확인받기.//현재 jvm이 사용할 수 있는 cpu 코어 수
        //코어 수란 하드웨어적인 자원. -> 코어를 활용해서 !!!작업!!!을 만드는게 스레드.
        //스레드 하나를 사용한다는 것은 코어 하나를 사용한다는 것.
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("코어 수"+ cores);


    }

}
