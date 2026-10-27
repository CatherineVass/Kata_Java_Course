public class checkWeekend {
    public static String checkWeekend(String weekday) {
        return weekday.equals("Saturday") || weekday.equals("Sunday")
                ? "Ура, выходной!"
                : "Надо ещё поработать";
    }
}
