package lecture.section03;

public class CarRaser {

    private Car car = new Car();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void startUp(){
        car.startUp();

    }

    public void stepAccelator(){
        car.go();
    }

    public void stopBreak(){

        car.stop();

    }

    public void turnOff(){
        car.turnOff();
    }

}
