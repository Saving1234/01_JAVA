package lecture.problemLv3.one;

public class Boat extends Vehicle {

    String girm = girm;

    public Boat(){}

    public Boat(String girm) {
        this.girm=girm;
    }

    @Override
    public void move() {
        System.out.println("보트가 물 위를 떠다닙니다");;
    }
}
