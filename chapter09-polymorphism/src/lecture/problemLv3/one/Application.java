package lecture.problemLv3.one;

public class Application {

    public static void main(String[] args) {


        Vehicle[] vehicle = new Vehicle[2];
        vehicle[0] = new Car();
        vehicle[1] = new Boat();

        for (Vehicle vehicle1 : vehicle) {
            vehicle1.move();

        }
    }
}
