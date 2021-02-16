package by.epam.task1.task10;

public class U1Task10 {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 10.0;
        double h = 0.5;

        valuesTable(a, b, h);
    }

    public static double[] valuesTable(double a, double b, double h) {
        double[] values = new double[(int) ((b - a) / h)];

        for (int i = 0; a <= b && i < values.length; i++, a += h) {
            values[i] = functionValue(a);
        }

        return values;
    }

    public static double functionValue(double x) {
        return Math.tan(x);
    }
}
