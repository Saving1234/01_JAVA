package lecture.section02.vertualTread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

    public static void main(String[] args) {

        int taskCount = 10_000;


        System.out.println("=== 플랫폼 스레드 풀(200명)로 " + taskCount + "개 처리 ===");

        //시작시간
        long start = System.currentTimeMillis();

        //ExcutorService 생성
        try (ExecutorService executor = Executors.newFixedThreadPool(200)) {
                //작업진행.
            for (int i = 0; i < taskCount; i++) {
                executor.submit(() -> sleep(100));
            }
        }

        System.out.println("소요 시간: 약 " + (System.currentTimeMillis() - start) + "ms\n");


        /*
            플랫폼스레드 : os 스레드와 1:1로 묶이는 무거운 스레드
            가상스레드 : 아주 가벼운 스레드 힙 영역에 작은 객체형태로 만들어짐.
            가상스레드가 동작하기 위해선 OS 스레드 위에서 동작해야함. //캐리어스레드
            //sleep() 이나 네트워크 대기 같은 기다리는 작업을 만나면 OS 스레드 위에서 동작하다가 내려옴(umount) // 내려온다는 것은 잠시 작업을 쉰다는 느낌. 위에서만 작업을 하니까.
            //OS 스레드가 할 작업이 비어있게 되므로, 기다리는 동안 다른작업을 할 가상스레드를 실행시킬 수 있다.
         */


        System.out.println("=== 가상 스레드 풀(200명)로 " + taskCount + "개 처리 ===");

        //시작시간
        start = System.currentTimeMillis();

        //ExcutorService 생성
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) { //가상 스레드 풀 생성.
            //작업진행.
            for (int i = 0; i < taskCount; i++) {
                executor.submit(() -> sleep(100));
            }
        }

        System.out.println("가상스레드 소요 시간: 약 " + (System.currentTimeMillis() - start) + "ms\n");

    }
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
