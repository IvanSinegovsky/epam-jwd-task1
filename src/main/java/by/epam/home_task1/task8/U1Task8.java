package by.epam.home_task1.task8;

public class U1Task8 {
    public static void main(String[] args) {
        double x = 25.7;
        System.out.println(functionValue(2.8));
    }

    public static double functionValue(double x) {
        if (x < 3) {
            return 1 / (x * x * x - 6);
        } else {
            return (-1) * x * x + 3 * x + 9;
        }
    }
}
