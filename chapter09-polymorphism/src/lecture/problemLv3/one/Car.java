package lecture.problemLv3.one;

public class Car extends Vehicle {
    String girm;

    public Car(){}

    public Car(String girm) {
    this.girm=girm;
    }

    @Override
    public void move() {
        System.out.println("자동차가 도로를 달립니다");
    }
}
