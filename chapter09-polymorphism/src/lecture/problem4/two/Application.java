package lecture.problem4.two;

import lecture.problemLv3.one.Vehicle;
//클래스 타입을 치려면 베이클을 임포트에 넣어야 함.

public class Application {

    Vehicle v1 = VehicleFactory.create("car");
    Vehicle v2 = VehicleFactory.create("boat");

        VehicleFactory.runVehicle(v1);
        VehicleFactory.runVehicle(v2);


}
