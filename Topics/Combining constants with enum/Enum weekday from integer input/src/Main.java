import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();

        Weekday day = Weekday.fromInt(dayNumber);
        System.out.println(day);
    }
}

enum Weekday {
    // Define the enum constants here
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private final int dayNumber;

    Weekday(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public static Weekday fromInt(int dayNumber) {
        for (Weekday day : Weekday.values()) {
            if (day.getDayNumber() == dayNumber) {
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid day number: " + dayNumber);
    }

    }