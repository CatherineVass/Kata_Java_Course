public class СalcCircleRadius {

    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f%n", radius);
    }
}
