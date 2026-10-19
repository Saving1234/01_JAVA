package practice.level2;

public enum TrafficLight {

    RED("정지하세요"),
    YELLOW("감속하세요"),
    GREEN("통과하세요");

    private final String traffic;



    TrafficLight(String traffic) {
        this.traffic = traffic;
    }

    public String getTraffic() {
        return traffic;
    }
}
