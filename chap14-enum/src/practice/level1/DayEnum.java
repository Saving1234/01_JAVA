package practice.level1;

public class DayEnum {

    public static void main(String[] args) {

        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WHENSDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);

        String input = "FRIDAY";

        Day talls = Day.valueOf(input);

        System.out.println(talls == Day.FRIDAY);
        System.out.println(talls == Day.MONDAY);

    }


}
