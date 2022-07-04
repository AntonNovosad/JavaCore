package by.devincubator.task4;

public enum Weekdays {
    MONDAY(" (MON)", false),
    TUESDAY(" (TUE)", false),
    WEDNESDAY(" (WED)", false),
    THURSDAY(" (THU)", false),
    FRIDAY(" (FRI)", false),
    SATURDAY(" (SAT)", true),
    SUNDAY(" (SUN)", true);

    private final String shortName;
    private final boolean weekend;

    Weekdays(String shortName, boolean weekend) {
        this.shortName = shortName;
        this.weekend = weekend;
    }

    public String getShortName() {
        return shortName;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
