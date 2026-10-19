package practice.level1;

public enum Day {

    MONDAY(0, "MONDAY"),
    TUESDAY(1, "TUESDAY"),
    WHENSDAY(2, "WHENSDAY"),
    THUSDAY(3, "THUSDAY"),
    FRIDAY(4, "FRIDAY"),
    SATURDAY(5, "SATURDAY"),
    SUNDAY(6, "SUNDAY");

    private final int ordinal;
    private final String name;

    Day(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getName() {
        return name;
    }
}
