package by.epam.task1.task3;

public class U1Task3 {
    public static void main(String[] args) {
        double sBigFoursquare = 27.333;
        System.out.println(" Big foursquare S = " + sBigFoursquare
                + "\n Little foursquare s = " + sLittleFoursquare(sBigFoursquare));
    }

    public static double sLittleFoursquare(double sBigFoursquare) {
        return sBigFoursquare / 2;
    }
}
