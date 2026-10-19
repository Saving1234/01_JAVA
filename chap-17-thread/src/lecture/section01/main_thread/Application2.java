package lecture.section01.main_thread;

public class Application2 {
    public static void main(String[] args) throws InterruptedException {

        PrintingTask myTask = new PrintingTask("빨래", 3);

        //데드락.
        //스레드가


        // 스레드 만들기
        Thread worker = new Thread(myTask, "일꾼-1");

        // 일꾼을 고용

         //worker.start() : 새 스레드를 만들어서 해당 스레드에게 run을 실행하라
         //worker.run() : main 스레드가 run을 실행

        worker.start(); // 우리가 만든 일꾼이 동작

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "설거지를 "
                            + "[" + Thread.currentThread().getName() + "]"
                            + i + "번 작업처리"
            );
            Thread.sleep(1000);
        }
    }
}