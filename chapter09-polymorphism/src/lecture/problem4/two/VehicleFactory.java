package lecture.problem4.two;

import lecture.problemLv3.one.Boat;
import lecture.problemLv3.one.Car;
import lecture.problemLv3.one.Vehicle;

public class VehicleFactory {
    public static Vehicle create(String move) {


        //호출한 클래스에 가서 문제 파악.
        //그곳에 생성자, 즉 매개변수 생성자가 없으면 안됨. 매개변수가 없는데 호출할 수가 없으니까.
        if(move.equals("car")){
            return new Car("가솔린");
        } else{
            return new Boat("경유?");
        }





    }

    public static void runVehicle(){




    }
}
