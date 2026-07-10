public class EnumDemo {

    public static void main(String[] args) {

        System.out.println("=== Enum Basics ===");
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
        System.out.println("Is weekend? " + today.isWeekend());

        Day weekendDay = Day.SATURDAY;
        System.out.println("\n" + weekendDay + " is weekend? " + weekendDay.isWeekend());

        // ---- Enum with switch statement ----
        System.out.println("\n=== Enum with switch ===");
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek grind.");
                break;
        }

        System.out.println("\n=== All Days (Day.values()) ===");
        for (Day d : Day.values()) {
            System.out.println(d + " -> weekend? " + d.isWeekend());
        }

        System.out.println("\n=== Enum ordinal/valueOf ===");
        System.out.println("Ordinal of WEDNESDAY: " + Day.WEDNESDAY.ordinal());
        Day parsedDay = Day.valueOf("FRIDAY");
        System.out.println("Parsed from String: " + parsedDay);
    }
}