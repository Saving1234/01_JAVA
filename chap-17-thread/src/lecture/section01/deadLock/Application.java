package lecture.section01.deadLock;

public class Application {


    //공유자원.
    //실행시키면 heap 영역에 들어감.
    static  final Object 티셔츠 = new Object();
    static  final Object 바지 = new Object();

    public static void main(String[] args) {

    //


        //데드락
        /*
            두 개이상의 스레드가 서로 가진 락을 기다리면서 무한정 대기하는 상태.
            발생 조건.
                1. 상호 배제 -> 한번에 하나의 공유자원만 사용 가능할 때. //싱크로나이즈.
                2. 점유 대기 -> 하나를 가지고 다른 공유자원을 기다리는 것. //데드락. catch. InterruptedException으로.
                3. 비선점 -> 강제로 다른 스레드가 이미 점유하여 작업하는 공유자원을 뺏을 수 없는
                4. 순환 대기 -> 서로 물려있는 상태.? 대기?



         */

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (티셔츠) {
                    System.out.println(
                            Thread.currentThread().getName()
                                    + " : 티셔츠를 입었다."
                    );

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " : 바지 찾으러 가는중..."
                    );

                    synchronized (바지) {
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " : 바지를 입었다."
                        );
                    }
                }
            }
        }, "형");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (바지) {
                    System.out.println(
                            Thread.currentThread().getName()
                                    + " : 바지를 입었다."
                    );

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) { //다른 스레드가 이 스레드를 멈추려고 할 때 발생하는 예외. 즉, t1이 이것을 멈추려고 할 때.
                        throw new RuntimeException(e);
                    }

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " : 티셔츠 찾으러 가는중..."
                    );

                    synchronized (티셔츠) {
                        System.out.println(
                                Thread.currentThread().getName()
                                        + " : 티셔츠를 입었다."
                        );
                    }
                }
            }
        }, "동생");

        t1.start();
        t2.start();

    }

}
