package lecture.section01.extend;

public class RacingCar extends Car {

    //car 클래스를 상속받아서 오버라이딩.


    public RacingCar() {

        super();
    }

    public RacingCar(boolean runningStatus) {
        super(runningStatus);
    }

    @Override
    public void run() {
        System.out.println("레이싱카가 질주합니다!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱 카는 경적을 울리지 않습니다");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
