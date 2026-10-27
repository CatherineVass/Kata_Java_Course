public class isWeekend {
    public static int isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
            case "Sunday":
                return 3;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                return 5;
            default:
                return 0;
        }
    }
}
