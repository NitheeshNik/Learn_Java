public class DifferentSwichtsCase {
    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1, 7 -> System.out.println("Weekend");
            case 2, 3, 4, 5, 6 -> System.out.println("Weekday");
            default -> System.out.println("Invalid day");
        }

        int day1 = 2;

        String dayName = switch (day1) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };

        System.out.println(dayName);

        String command = "stop";

        switch (command) {
            case "start" -> System.out.println("Starting");
            case "stop" -> System.out.println("Stopping");
            default -> System.out.println("Unknown command");
        }
    }
}