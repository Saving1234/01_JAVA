package lecture.section04.exercise;

public class FireCar extends Car implements Soundable {

    @Override
    public void go() {

        System.out.println("소방차가 출발합니다");

    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("소방차가 경적을 울립니다.");
    }

    @Override
    public boolean goTo(int track) {
        return false;
    }
}

