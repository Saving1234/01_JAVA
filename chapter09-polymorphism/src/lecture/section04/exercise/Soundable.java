package lecture.section04.exercise;

public interface Soundable {

    public abstract void soundHorn();

    boolean goTo(int track);

    FireCar firecar = new FireCar();
    RacingCar racingCar = new RacingCar();

    //실무에서는 인터페이스 잘 쓰임.
    //인터페이스 안에 설계도 씀.


}
