public class WeekendChecker {
    public static boolean isWeekend(int weekDayNumber) {
        if (weekDayNumber == 6 || weekDayNumber == 7) {
            return true;
        } else {
            return false;
        }
    }
}
