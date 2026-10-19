package lecture.section01.extend;

public class Car {

    //달리는 중인지 상태.(무언 갈 체크/ 검증은 boolean으로)
    protected boolean runningStatus;

    public Car(){  //기본 생성자 만들어야 상속 가능.
        System.out.println("car의 기본 생성자 호출..");
    }


    public Car(boolean runningStatus) {//매개변수 있는 생성자.
        this.runningStatus = runningStatus;

        System.out.println("Car의 기본 생성자가 호출되었습니다...");

    }

    public boolean isRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(boolean runningStatus) {
        this.runningStatus = runningStatus;
    }

    public void soundHorn() {

        //주행 중일 때만 경적.
        if (isRunning()) {
            System.out.println("빵빵!");
        } else {
            System.out.println("주행중이 아닐 경우 경적을 울릴 수 없습니다");
        }


    }


    public void run() {

        runningStatus = true;
        System.out.println("자동차가 달립니다");

    }


    //멈추는 기능
    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다");

    }


    //주행 상태 확인할 수 있는 메서드
    protected boolean isRunning() {

        return runningStatus;

    }


    @Override   //HEAP의 주소값대로 가지고 오라는 뜻(toString?). 메서드 다시 작성.
    public String toString() {
        return super.toString();
    }
}


