package practice.level2;

public class GlobalTrappicMessage {

    public static void message(TraafficEnum lightMessage) {

        TrafficLight light = lightMessage.getWarningLight();


        System.out.println("light = " + light);

    }

}
