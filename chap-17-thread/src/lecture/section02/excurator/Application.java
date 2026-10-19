package lecture.section02.excurator;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class Application {
//스레드란 os에서 가져오는 것.
    public static void main(String[] args) throws Exception {

        /*
            스레드풀
              1. 스레드를 미리 정해진 수만큼 만들어 두고 재사용
              2. 작업들을 대기열(큐형태)에 쌓고, 일을 안하고 있는 스레드가 하나씩 처리.
         */

        //스레드 세 개 가진 스레드 풀.
        ExecutorService excutor = Executors.newFixedThreadPool(3); //스레드 갯수. 많을 수록 빨라짐.

        System.out.println("=== 일감 5개 제출 (일꾼은 3명) ===");

        for (int i = 1; i <= 5; i++) {

            int taskNo = i;


            excutor.submit(() -> {
                System.out.println("[" + Thread.currentThread().getName() + "] " + taskNo + "번 일 처리");
                sleep(1000); //줄일 수록 작업속도가 빨라짐.
            });


        }

    }
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
