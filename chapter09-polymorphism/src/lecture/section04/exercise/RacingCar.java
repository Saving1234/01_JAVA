package lecture.section04.exercise;

public class RacingCar extends Car {


    @Override
    public void go() {

        System.out.println("레이싱카는 앞으로 갑니다...");

    }

    @Override
    public void stop() {

        System.out.println("레이싱 카는 멈춥니다...");

    }
}
