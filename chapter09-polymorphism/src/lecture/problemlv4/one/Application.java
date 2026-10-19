package lecture.problemlv4.one;

public class Application {

    public static void main(String[] args) {

        Appliance[] appliances = new Appliance[2];
        appliances[0] = new WashingMachine();
        appliances[1] = new Refrigerator();

        for (Appliance appliance : appliances) {
            appliance.operate();
        }

    }

    }


