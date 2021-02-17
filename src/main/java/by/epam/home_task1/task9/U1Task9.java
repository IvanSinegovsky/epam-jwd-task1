package by.epam.home_task1.task9;

public class U1Task9 {
    public static void main(String[] args) {
        double r = 1.0;
        System.out.println(" Circle length - " + circleLength(r)
                + " Circle square - " + circleSquare(r));
    }

    public static double circleLength(double r) {
        return 2 * Math.PI * r;
    }

    public static double circleSquare(double r) {
        return Math.PI * r * r;
    }
}
