package by.epam.task1.task7;

public class U1Task7 {
    public static void main(String[] args) {
        double x1 = 3.0;
        double y1 = 3.0;
        double x2 = 3.0;
        double y2 = 3.0;

        System.out.println(pointCloser(x1, y1, x2, y2));
    }

    public static String pointCloser(double x1, double y1, double x2, double y2) {
        double r1 = Math.sqrt(x1 * x1 + y1 * y1);
        double r2 = Math.sqrt(x2 * x2 + y2 * y2);

        if (r1 == r2) {
            return " Points equidistant from origin.";
        }

        if (r1 < r2) {
            return " First point is closer to origin than second.";
        } else {
            return " Second point is closer to origin than first.";
        }
    }
}
