package lecture.section04.exercise;

public class Application {

    public static void main(String[] args) {

        FireCar car = new FireCar();
        RacingCar car2 = new RacingCar();

       Car [] car3 = {new FireCar(), new RacingCar()};
       for(Car caR : car3){
           caR.go();
       }
    }

}
