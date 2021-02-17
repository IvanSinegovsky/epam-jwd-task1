package by.epam.home_task1.task6;

public class U1Task6 {
    public static void main(String[] args) {
        int n = 34141;
        System.out.println(secondsToDate(n));
    }

    public static String secondsToDate(int n) {
        if (n < 0 || n > 86400) {
            return "Incorrect value";
        }

        StringBuilder date = new StringBuilder(9);
        int hours = n / 3600;
        int minutes = n / 60 - hours * 60;
        int seconds = n - hours * 3600 - minutes * 60;

        date.append(Integer.valueOf(hours).toString() + "h")
                .append(Integer.valueOf(minutes).toString() + "m")
                .append(Integer.valueOf(seconds).toString() + "s");

        return date.toString();
    }
}
