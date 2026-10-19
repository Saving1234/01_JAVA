package lecture.section01.syncronization;

public class Account {

    private int balance = 1000; // 계좌 잔액

    // 스레드가 동시에 가면 문제 되니까
    //다른 스레드가 해당자원을 사용하고 있으면 못 가져가도록 잠금
    //임계영역, 싱크로나이즈라는 걸 써서 락을 건다???

    // 출금
    public void withdraw(int money) {

        if (balance >= money) {

            // 처리하는데 걸리는 시간을 표현
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= money;

            System.out.println(Thread.currentThread().getName()+"출금이 " + money + "원 완료되었습니다.");
            System.out.println(Thread.currentThread().getName()+"잔액이 " + balance + "원 남았습니다.");
        }

    }
}