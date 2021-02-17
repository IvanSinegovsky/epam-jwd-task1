package by.epam.home_task1.task5;

public class U1Task5 {
    public static void main(String[] args) {
        int number = 496;
        System.out.println(isPerfectNumber(number));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
